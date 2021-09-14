package util;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import entity.SecurityGroupAllEty;
import entity.diskInfo;
import entity.ecsInfo;
import entity.instanceTypeEty;
import entity.orgInfo;
import entity.vpcInfo;

public class json2Entity {

	public Object json2entity(String entity,String json) {
		ObjectMapper mapper = new ObjectMapper(); 
		//在反序列化时忽略在 json 中存在但 Java 对象不存在的属性 
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false); 
		//mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		//在序列化时日期格式默认为 yyyy-MM-dd'T'HH:mm:ss.SSSZ 
		//mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false) 
		//忽略值为默认值的属性 
		mapper.setDefaultPropertyInclusion(Include.NON_DEFAULT);
		//在序列化时忽略值为 null 的属性
		mapper.setSerializationInclusion(Include.NON_NULL);  
		
		try {
			switch (entity) {
			case "ecsinfo":
				ecsInfo ecsinfo = new ecsInfo();
				ecsinfo = mapper.readValue(json, ecsInfo.class);
				return ecsinfo;
			case "diskinfo":
				diskInfo diskinfo = new diskInfo();
				diskinfo = mapper.readValue(json, diskInfo.class);
				return diskinfo;
			case "orginfo":
				orgInfo orginfo = new orgInfo();
				orginfo = mapper.readValue(json, orgInfo.class);
				return orginfo;
			case "instanceType":
				instanceTypeEty ite = new instanceTypeEty();
				ite = mapper.readValue(json, instanceTypeEty.class);
				return ite;
			case "vpcinfo":
				vpcInfo vpcinfo = new vpcInfo();
				vpcinfo = mapper.readValue(json, vpcInfo.class);
				return vpcinfo;
			case "SecurityGroupinfo":
				SecurityGroupAllEty sgae = new SecurityGroupAllEty();
				sgae = mapper.readValue(json, SecurityGroupAllEty.class);
			}
			
			return null;
		} catch (Exception e) {
			System.out.println("json2entity 出错！");
     		e.printStackTrace();
     		return null;
		}
	}
}
