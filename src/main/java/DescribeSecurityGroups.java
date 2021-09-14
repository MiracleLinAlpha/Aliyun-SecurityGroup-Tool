import api.Ascm_Api;
import api.Ecs_Api;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.requestParams;
import util.saveAsFileWriter;

import java.io.*;
import java.util.Scanner;

public class DescribeSecurityGroups {

    public static String displayName;
    public static String choose = "0";
    public static Scanner scan = new Scanner(System.in);
    public static requestParams rp = new requestParams();
    public static Ascm_Api aa = new Ascm_Api();
    public static saveAsFileWriter safw = new saveAsFileWriter();
    public static Ecs_Api ea = new Ecs_Api();

    public static void main(String[] args) throws InterruptedException, IOException {
        //引导
        while(true) {
            cls();
            System.out.println(".____    .__                      \r\n"
                    + "|    |   |__| ____ ________ ____  \r\n"
                    + "|    |   |  |/    \\\\___   //    \\ \r\n"
                    + "|    |___|  |   |  \\/    /|   |  \\\r\n"
                    + "|_______ \\__|___|  /_____ \\___|  /\r\n"
                    + "        \\/       \\/      \\/    \\/ \n\n");
            System.out.println("---------------------DescribeSecurityGroups--------------------");
            System.out.println("\n	请将配置文件conf.txt放入jar包所在的目录\n");
            System.out.println("         [conf.txt                  	]");
            System.out.println("+ -- -- =[域名                       	]");
            System.out.println("+ -- -- =[API网关                    	]");
            System.out.println("+ -- -- =[AccessKeyId                	]");
            System.out.println("+ -- -- =[AccessKeySecret            	]");
            System.out.println("\n	请输入选项：\n");
            System.out.println("+ -- -- =(1、文件已放入相应目录,认证信息	)");
            System.out.println("+ -- -- =(2、退出				)\n");
            System.out.println("---------------------------------------------------");

            choose = scan.next();
            switch (choose) {
                case "1":
                    //displayName.equals("") != true
                    if(checkLogin() == true) {

                        String SecurityGroupsjson = ea.DescribeSecurityGroups(rp);

                        String jarpath = System.getProperty("java.class.path");
                        int firstIndex = jarpath.lastIndexOf(System.getProperty("path.separator")) + 1;
                        int lastIndex = jarpath.lastIndexOf(File.separator) + 1;
                        jarpath = jarpath.substring(firstIndex, lastIndex);

                        safw.saveAsFileWriter(SecurityGroupsjson, jarpath + "DescribeSecurityGroups.txt");

                        return;
                    }
                    cls();
                    System.out.println("读取文件失败，请重试！");
                    break;
                case "2":
                    return ;
                default:
                    cls();
                    System.out.println("输入有误，请重输！");
                    break;
            }
        }
    }

    public static boolean checkLogin() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        try {
            String jarpath = System.getProperty("java.class.path");
            int firstIndex = jarpath.lastIndexOf(System.getProperty("path.separator")) + 1;
            int lastIndex = jarpath.lastIndexOf(File.separator) + 1;
            jarpath = jarpath.substring(firstIndex, lastIndex);

            File conffile =new File(jarpath + "conf.txt");
            if(conffile.exists() != true) {
                System.out.println("conf.txt文件不存在！");
                return false;
            }
            InputStreamReader confrd = new InputStreamReader (new FileInputStream(conffile),"UTF-8");
            BufferedReader confbf = new BufferedReader(confrd);

            rp.setRegionId(confbf.readLine());
            rp.setApiGateWay(confbf.readLine());
            rp.setAccessKeyId(confbf.readLine());
            rp.setAccessKeySecret(confbf.readLine());


            String userinfojson = aa.GetUserInfo(rp);
            JsonNode userinfojn = mapper.readTree(userinfojson);
            userinfojn = userinfojn.get("data").get("displayName");
            displayName = userinfojn.toString();
            rp.setDisplayName(displayName);

            return true;
        } catch (Exception e) {
            System.out.println("读取文件出错！");
            e.printStackTrace();
            return false;
        }
    }





    public static void cls() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
