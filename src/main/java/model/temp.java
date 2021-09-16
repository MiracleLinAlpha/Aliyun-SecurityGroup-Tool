package model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.SecurityGroupAllEty;
import entity.SecurityGroupRuleEty;
import entity.requestParams;
import util.UnicodeReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;

public class temp {

    public static void SecurityGroupMigration(requestParams rp) {

        try {

            while(true) {
                cls();
                System.out.println("-------------------安全组规则迁移-------------------");
                System.out.println("\n+ -- -- =>>用户:	" + rp.getDisplayName() + "		<<\n");
                System.out.println("\n	请将配置文件data.txt放入jar包所在的目录\n");
                System.out.println("         [data.txt                  				]");
                System.out.println("+ -- -- =[源安全组ID						]");
                System.out.println("+ -- -- =[目的安全组ID						]");
                System.out.println("\n	请输入选项：\n");
                System.out.println("+ -- -- =(1、文件已放入相应目录,认证信息	)");
                System.out.println("+ -- -- =(2、退出				)\n");
                System.out.println("----------------------------------------------------");

                choose = scan.next();
                switch (choose) {
                    case "1":
                        break;
                    case "2":
                        return ;
                    default:
                        cls();
                        System.out.println("输入有误，请重输！");
                        break;
                }
                break;
            }


            String sourceSecurityGroupId;
            String destSecurityGroupId;

            //获取data.txt
            String jarpath = System.getProperty("java.class.path");
            int firstIndex = jarpath.lastIndexOf(System.getProperty("path.separator")) + 1;
            int lastIndex = jarpath.lastIndexOf(File.separator) + 1;
            jarpath = jarpath.substring(firstIndex, lastIndex);

            File datafile =new File(jarpath + "data.txt");
            if(datafile.exists() != true) {
                System.out.println("data.txt文件不存在！");
                return ;
            }
            //InputStreamReader datard = new InputStreamReader (new FileInputStream(datafile),"UTF-8");
            UnicodeReader datard = new UnicodeReader(new FileInputStream(datafile), Charset.defaultCharset().name());
            BufferedReader databf = new BufferedReader(datard);
            String temp;
            int i=0;

            sourceSecurityGroupId = databf.readLine();
            destSecurityGroupId = databf.readLine();

            //展示data.txt内容
            cls();
            System.out.println("----------------------安全组规则迁移----------------------");
            System.out.println("\n+ -- -- =>>用户:	" + rp.getDisplayName() + "		<<\n");
            System.out.println("源安全组ID：" + sourceSecurityGroupId);
            System.out.println("目的安全组ID：" + destSecurityGroupId);


            //确认操作
            while(true) {
                System.out.println("\n\n	请输入选项：\n");
                System.out.println("+ -- -- =(1、执行				)");
                System.out.println("+ -- -- =(2、退出				)\n");
                System.out.println("------------------------------------------------------");
                choose = scan.next();
                switch (choose) {
                    case "1":
                        break;
                    case "2":
                        return ;
                    default:
                        cls();
                        System.out.println("输入有误，请重输！");
                        break;
                }
                break;
            }


            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

            String result = "";
            int num = 0;


            //获取所有安全组
            String SecurityGroupsjson = ea.DescribeSecurityGroups(rp);
            JsonNode SecurityGroupsjn = mapper.readTree(SecurityGroupsjson);
            SecurityGroupsjn = SecurityGroupsjn.get("SecurityGroups").get("SecurityGroup");

            //反序列化安全组
            for(i=0;i<SecurityGroupsjn.size();i++) {
                sgae = mapper.readValue(SecurityGroupsjn.get(i).toString(), SecurityGroupAllEty.class);
                //sgae = (SecurityGroupAllEty)j2e.json2entity("SecurityGroupinfo", SecurityGroupsjn.get(i).toString());
                sgaelist.add(sgae);
            }


            //验证安全组是否存在，存在则执行迁移
            for(i=0;i<sgaelist.size();i++) {
                if(sgaelist.get(i).getSecurityGroupId().equals(sourceSecurityGroupId)) {

                    String sourcerulejson = ea.DescribeSecurityGroupAttribute(rp, sourceSecurityGroupId);
                    JsonNode sourcerulejn = mapper.readTree(sourcerulejson);
                    sourcerulejn = sourcerulejn.get("Permissions").get("Permission");

                    for(int j=0;j<sourcerulejn.size();j++) {
                        sgre = (SecurityGroupRuleEty)mapper.readValue(sourcerulejn.get(j).toString(), SecurityGroupRuleEty.class);
                        sgrelist.add(sgre);
                    }

                    for(int j=0;j<sgrelist.size();j++) {
                        System.out.println("条目：" + sgrelist.get(j).getSourceCidrIp() + "  "  + sgrelist.get(j).getPortRange() + "  " + sgrelist.get(j).getDescription() + "\n");

                        ea.RevokeSecurityGroup(rp, destSecurityGroupId, String.valueOf(sgaelist.get(i).getDepartment()), sgrelist.get(j).getIpProtocol(), sgrelist.get(j).getPortRange(), sgrelist.get(j).getSourceCidrIp());

                        result = ea.AuthorizeSecurityGroup(rp, destSecurityGroupId, String.valueOf(sgaelist.get(i).getDepartment()), sgrelist.get(j).getIpProtocol(), sgrelist.get(j).getPortRange(), sgrelist.get(j).getSourceCidrIp(), sgrelist.get(j).getDescription());
                        if(result.contains("Code") == true) {
                            System.out.println("接口调用出错！");
                            System.out.println("条目 " + csgelist.get(i).toString() + " 失败！");
                        }else
                            num++;
                    }
                    return ;
                }
            }


            if(num == sgrelist.size()) {
                System.out.println("安全组迁移成功！");
            }

        } catch (Exception e) {
            System.out.println("出错！");
            e.printStackTrace();
        }
    }




    public static void revokeRule2AllSecurityGroup(requestParams rp) {
        try {
            while(true) {
                cls();
                System.out.println("--------------删除安全组规则(所有安全组)--------------");
                System.out.println("\n+ -- -- =>>用户:	" + rp.getDisplayName() + "		<<\n");
                System.out.println("\n	请将配置文件data.txt放入jar包所在的目录\n");
                System.out.println("         [data.txt                  				]");
                System.out.println("+ -- -- =[源IP + 空格 + 协议类型 + 空格 + 端口段		]");
                System.out.println("+ -- -- =[源IP + 空格 + 协议类型 + 空格 + 端口段		]");
                System.out.println("+ -- -- =<协议类型包含: tcp udp icmp gre all>");
                System.out.println("+ -- -- =<当协议类型为all时,端口填写-1/-1>");
                System.out.println("\n	请输入选项：\n");
                System.out.println("+ -- -- =(1、文件已放入相应目录,认证信息	)");
                System.out.println("+ -- -- =(2、退出				)\n");
                System.out.println("------------------------------------------------------");

                choose = scan.next();
                switch (choose) {
                    case "1":
                        break;
                    case "2":
                        return ;
                    default:
                        cls();
                        System.out.println("输入有误，请重输！");
                        break;
                }
                break;
            }

            csgelist = FileToCsgelist();

            //展示data.txt内容
            cls();
            System.out.println("--------------删除安全组规则(所有安全组)--------------");
            System.out.println("\n+ -- -- =>>用户:	" + rp.getDisplayName() + "		<<\n");
            for(i=0;i<csgelist.size();i++) {
                System.out.println("条目：" + csgelist.get(i).getSourceIp() + "  " + csgelist.get(i).getIpProtocol() + "  " + csgelist.get(i).getPortRange() + "\n");
            }
            System.out.println("总计 " + csgelist.size() + " 条");

            //确认操作
            while(true) {
                System.out.println("\n	请输入选项：\n");
                System.out.println("+ -- -- =(1、执行				)");
                System.out.println("+ -- -- =(2、退出				)\n");
                System.out.println("------------------------------------------------------");
                choose = scan.next();
                switch (choose) {
                    case "1":
                        break;
                    case "2":
                        return ;
                    default:
                        cls();
                        System.out.println("输入有误，请重输！");
                        break;
                }
                break;
            }

            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

            String SecurityGroupsjson = ea.DescribeSecurityGroups(rp);
            JsonNode SecurityGroupsjn = mapper.readTree(SecurityGroupsjson);
            SecurityGroupsjn = SecurityGroupsjn.get("SecurityGroups").get("SecurityGroup");

            //反序列化安全组
            for(i=0;i<SecurityGroupsjn.size();i++) {
                sgae = mapper.readValue(SecurityGroupsjn.get(i).toString(), SecurityGroupAllEty.class);
                sgaelist.add(sgae);
            }



            //执行删除
            int totalnum = 0;
            for(i=0;i<sgaelist.size();i++) {
                int singlenum = 0;
                for(int j=0;j<csgelist.size();j++) {
                    String result;
                    System.out.println("条目：" + csgelist.get(j).getSourceIp() + "  " + csgelist.get(j).getIpProtocol() + "  " + csgelist.get(j).getPortRange() + "\n");

                    result = ea.RevokeSecurityGroup(rp, sgaelist.get(i).getSecurityGroupId(), Integer.toString(sgaelist.get(i).getDepartment()), csgelist.get(j).getIpProtocol(), csgelist.get(j).getPortRange(), csgelist.get(j).getSourceIp());

                    if(result.contains("Code\":\"200") == true) {
                        System.out.println(result);
                        System.out.println("接口调用出错！");
                        System.out.println("条目 " + csgelist.get(i).toString() + " 失败！");
                    }else {
                        singlenum++;
                        totalnum++;
                    }
                }
                System.out.println("\n安全组: " + sgaelist.get(i).getSecurityGroupId() + " 删除规则 " + singlenum + " 条\n");
            }
            //校验
            if(totalnum == csgelist.size()*sgaelist.size()) {
                System.out.println("\n安全组删除成功！");
                System.out.println("总计 " + totalnum + " 条");
            }


        } catch (Exception e) {
            System.out.println("出错！");
            e.printStackTrace();
        }
    }





    public static void revokeRuleBySecurityGroupId(requestParams rp) {

        try {

            while(true) {
                cls();
                System.out.println("--------------删除安全组规则(通过目的安全组ID)--------------");
                System.out.println("\n+ -- -- =>>用户:	" + rp.getDisplayName() + "		<<\n");
                System.out.println("\n	请将配置文件data.txt放入jar包所在的目录\n");
                System.out.println("         [data.txt											]");
                System.out.println("+ -- -- =[安全组ID + 空格 + 源IP + 空格 + 协议类型 + 空格 + 端口段	]");
                System.out.println("+ -- -- =[安全组ID + 空格 + 源IP + 空格 + 协议类型 + 空格 + 端口段	]");
                System.out.println("+ -- -- =<协议类型包含: tcp udp icmp gre all>");
                System.out.println("+ -- -- =<当协议类型为all时,端口填写-1/-1>");
                System.out.println("\n	请输入选项：\n");
                System.out.println("+ -- -- =(1、文件已放入相应目录,认证信息	)");
                System.out.println("+ -- -- =(2、退出				)\n");
                System.out.println("---------------------------------------------------");

                choose = scan.next();
                switch (choose) {
                    case "1":
                        break;
                    case "2":
                        return ;
                    default:
                        cls();
                        System.out.println("输入有误，请重输！");
                        break;
                }
                break;
            }


            csgelist = FileToCsgelist();


            //展示data.txt内容
            cls();
            System.out.println("--------------删除安全组规则(通过目的安全组ID)--------------");
            System.out.println("\n+ -- -- =>>用户:	" + rp.getDisplayName() + "		<<\n");
            for(i=0;i<csgelist.size();i++) {
                System.out.println("条目：" + csgelist.get(i).getSecurityGroupId() + "  " + csgelist.get(i).getSourceIp() + "  " +csgelist.get(i).getIpProtocol() + "  " + csgelist.get(i).getPortRange() + "\n");
            }
            System.out.println("总计 " + csgelist.size() + " 条");

            //确认操作
            while(true) {
                System.out.println("\n	请输入选项：\n");
                System.out.println("+ -- -- =(1、执行				)");
                System.out.println("+ -- -- =(2、退出				)\n");
                System.out.println("------------------------------------------------------");
                choose = scan.next();
                switch (choose) {
                    case "1":
                        break;
                    case "2":
                        return ;
                    default:
                        cls();
                        System.out.println("输入有误，请重输！");
                        break;
                }
                break;
            }


            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

            String SecurityGroupsjson = ea.DescribeSecurityGroups(rp);
            JsonNode SecurityGroupsjn = mapper.readTree(SecurityGroupsjson);
            SecurityGroupsjn = SecurityGroupsjn.get("SecurityGroups").get("SecurityGroup");

            //反序列化安全组
            for(i=0;i<SecurityGroupsjn.size();i++) {
                sgae = mapper.readValue(SecurityGroupsjn.get(i).toString(), SecurityGroupAllEty.class);
                sgaelist.add(sgae);
            }


            //安全组存在,则执行删除
            int num = 0;
            for(i=0;i<sgaelist.size();i++) {
                for(int j=0;j<csgelist.size();j++) {
                    if(sgaelist.get(i).getSecurityGroupId().equals(csgelist.get(j).getSecurityGroupId())) {
                        String result;
                        System.out.println("条目：" + csgelist.get(j).getSecurityGroupId() + "  " + csgelist.get(j).getSourceIp() + "  " + csgelist.get(j).getIpProtocol() + "  " + csgelist.get(j).getPortRange() + "\n");

                        result = ea.RevokeSecurityGroup(rp, sgaelist.get(i).getSecurityGroupId(), Integer.toString(sgaelist.get(i).getDepartment()), csgelist.get(j).getIpProtocol(), csgelist.get(j).getPortRange(), csgelist.get(j).getSourceIp());

                        if(result.contains("Code\":\"200") == true) {
                            System.out.println(result);
                            System.out.println("接口调用出错！");
                            System.out.println("条目 " + csgelist.get(i).toString() + " 失败！");
                        }else {
                            num++;
                        }
                    }
                }
            }

            //校验
            if(num == csgelist.size()*sgaelist.size()) {
                System.out.println("\n安全组删除成功！");
                System.out.println("总计 " + num + " 条");
            }




        } catch (Exception e) {
            System.out.println("出错！");
            e.printStackTrace();
        }
    }

}
