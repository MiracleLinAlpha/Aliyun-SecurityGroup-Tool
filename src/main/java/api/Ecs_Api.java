package api;

import java.util.HashMap;
import java.util.Map;

import com.aliyun.asapi.ASClient;

import entity.requestParams;

public class Ecs_Api {
	
	//获取所有磁盘信息
	public static String DescribeDisks(requestParams rp) {
    	try {
    		Map<String, Object> requestParams = new HashMap<String, Object>();
     		requestParams.put("action", "DescribeDisks");
     		requestParams.put("product", "Ecs");
		    requestParams.put("Version", "2014-05-26");
     		requestParams.put("RegionId", rp.getRegionId());
     	    requestParams.put("AccessKeyId", rp.getAccessKeyId());
     	    requestParams.put("AccessKeySecret", rp.getAccessKeySecret());
     	    requestParams.put("regionId", rp.getRegionId());
     	    
     	    
     		ASClient client = new ASClient();
     		client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
     		String result = client.doRequest(rp.getApiGateWay(), requestParams);

     		System.out.println("DescribeDisks API Success!");
     		return result;			

     	} catch (Exception e) {
     		System.out.println("DescribeDisks API Error!");
     		e.printStackTrace();
     		return null;
     	} 
    }
	
	//获取所有ECS实例
	public static String DescribeInstances(requestParams rp) {
    	try {
		    Map<String, Object> rpmap = new HashMap<String, Object>();
		    rpmap.put("action", "DescribeInstances");
		    rpmap.put("product", "Ecs");
		    rpmap.put("Version", "2014-05-26");
		    rpmap.put("RegionId", rp.getRegionId());
		    rpmap.put("AccessKeyId", rp.getAccessKeyId());
		    rpmap.put("AccessKeySecret", rp.getAccessKeySecret());
		    
     		ASClient client = new ASClient();
     		client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
     		String result = client.doRequest(rp.getApiGateWay(), rpmap);

     		//System.out.println("DescribeInstances API Success!");
     		return result;			
     	} catch (Exception e) {
     		System.out.println("DescribeInstances API Error!");
     		e.printStackTrace();
     		return null;
     	} 
    }
	
	//获取所有支持的实例规格
	public static String DescribeInstanceTypes(requestParams rp) {
    	try {
		    Map<String, Object> rpmap = new HashMap<String, Object>();
		    rpmap.put("action", "DescribeInstanceTypes");
		    rpmap.put("product", "Ecs");   
		    rpmap.put("Version", "2014-05-26");
		    rpmap.put("RegionId", rp.getRegionId());
		    rpmap.put("AccessKeyId", rp.getAccessKeyId());
		    rpmap.put("AccessKeySecret", rp.getAccessKeySecret());
		    
     		ASClient client = new ASClient();
     		client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
     		String result = client.doRequest(rp.getApiGateWay(), rpmap);

     		System.out.println("DescribeInstanceTypes API Success!");
     		return result;			
     	} catch (Exception e) {
     		System.out.println("DescribeInstanceTypes API Error!");
     		e.printStackTrace();
     		return null;
     	} 
    }
	
	//获取可用的ECS实例规格
	public static String DescribeAvailableResource(requestParams rp) {
    	try {
		    Map<String, Object> rpmap = new HashMap<String, Object>();
		    rpmap.put("action", "DescribeAvailableResource");
		    rpmap.put("product", "Ecs");   
		    rpmap.put("Version", "2014-05-26");
		    rpmap.put("RegionId", rp.getRegionId());
		    rpmap.put("AccessKeyId", rp.getAccessKeyId());
		    rpmap.put("AccessKeySecret", rp.getAccessKeySecret());
		    rpmap.put("DestinationResource", "InstanceType");
		    rpmap.put("IoOptimized", "optimized");
		    
     		ASClient client = new ASClient();
     		client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
     		String result = client.doRequest(rp.getApiGateWay(), rpmap);

     		System.out.println("DescribeAvailableResource API Success!");
     		return result;			
     	} catch (Exception e) {
     		System.out.println("DescribeAvailableResource API Error!");
     		e.printStackTrace();
     		return null;
     	} 
    }
	
	
	//修改安全组入站规则
	public static String AuthorizeSecurityGroup(requestParams rp, String SecurityGroupId, String organizationid, String IpProtocol, String PortRange, String SourceCidrIp, String Description) {
    	try {
		    Map<String, Object> rpmap = new HashMap<String, Object>();
		    rpmap.put("action", "AuthorizeSecurityGroup");
		    rpmap.put("product", "Ecs");   
		    rpmap.put("Version", "2014-05-26");
		    rpmap.put("RegionId", rp.getRegionId());
		    rpmap.put("AccessKeyId", rp.getAccessKeyId());
		    rpmap.put("AccessKeySecret", rp.getAccessKeySecret());
		    
		    
		    //目的端安全组ID
		    rpmap.put("SecurityGroupId", SecurityGroupId);
		    //协议类型  tcp udp icmp gre all
		    rpmap.put("IpProtocol", IpProtocol);
		    //端口取值范围 
		    rpmap.put("PortRange", PortRange);
		    //源目的IPV4段
		    rpmap.put("sourceTypes", "ipv4");
		    rpmap.put("SourceCidrIp", SourceCidrIp);
		    //描述信息
		    rpmap.put("Description", Description);
		    
		    rpmap.put("ExpireTime", "");
		    
		    rpmap.put("NicType", "intranet");
		    rpmap.put("Direction", "ingress");
		    rpmap.put("Policy", "accept");
		    rpmap.put("Priority", 1);
		    
		    
		    
     		ASClient client = new ASClient();
     		client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
     		client.addHeader("x-acs-regionid", "cn-haikou-hnzwy157-d01");
     		client.addHeader("x-acs-resourcegroupid", "");
     		client.addHeader("x-acs-organizationid", organizationid);
     		client.addHeader("x-acs-instanceid", SecurityGroupId);
     		
     		String result = client.doRequest(rp.getApiGateWay(), rpmap);
     		
     		//System.out.println("AuthorizeSecurityGroup API Success!");
     		return result;			
     	} catch (Exception e) {
     		System.out.println("AuthorizeSecurityGroup API Error!");
     		e.printStackTrace();
     		return null;
     	} 
    }
	
	
	public static String DescribeSecurityGroups(requestParams rp) {
    	try {
		    Map<String, Object> rpmap = new HashMap<String, Object>();
		    rpmap.put("action", "DescribeSecurityGroups");
		    rpmap.put("product", "Ecs");   
		    rpmap.put("Version", "2014-05-26");
		    rpmap.put("RegionId", rp.getRegionId());
		    rpmap.put("AccessKeyId", rp.getAccessKeyId());
		    rpmap.put("AccessKeySecret", rp.getAccessKeySecret());
		    
     		ASClient client = new ASClient();
     		client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
     		String result = client.doRequest(rp.getApiGateWay(), rpmap);

     		//System.out.println("DescribeSecurityGroups API Success!");
     		return result;			
     	} catch (Exception e) {
     		System.out.println("DescribeSecurityGroups API Error!");
     		e.printStackTrace();
     		return null;
     	} 
    }
	
	
	public static String DescribeSecurityGroupAttribute(requestParams rp, String SecurityGroupId) {
    	try {
		    Map<String, Object> rpmap = new HashMap<String, Object>();
		    rpmap.put("action", "DescribeSecurityGroupAttribute");
		    rpmap.put("product", "Ecs");   
		    rpmap.put("Version", "2014-05-26");
		    rpmap.put("RegionId", rp.getRegionId());
		    rpmap.put("AccessKeyId", rp.getAccessKeyId());
		    rpmap.put("AccessKeySecret", rp.getAccessKeySecret());
		    
		    rpmap.put("SecurityGroupId", SecurityGroupId);
		    
     		ASClient client = new ASClient();
     		client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
     		String result = client.doRequest(rp.getApiGateWay(), rpmap);

     		//System.out.println("DescribeSecurityGroupAttribute API Success!");
     		return result;			
     	} catch (Exception e) {
     		System.out.println("DescribeSecurityGroupAttribute API Error!");
     		e.printStackTrace();
     		return null;
     	} 
    }
	
	
	public static String RevokeSecurityGroup(requestParams rp, String SecurityGroupId, String organizationid, String IpProtocol, String PortRange, String SourceCidrIp) {
    	try {
		    Map<String, Object> rpmap = new HashMap<String, Object>();
		    rpmap.put("action", "RevokeSecurityGroup");
		    rpmap.put("product", "Ecs");   
		    rpmap.put("Version", "2014-05-26");
		    rpmap.put("RegionId", rp.getRegionId());
		    rpmap.put("AccessKeyId", rp.getAccessKeyId());
		    rpmap.put("AccessKeySecret", rp.getAccessKeySecret());
		    
		    
		    
		  //目的端安全组ID
		    rpmap.put("SecurityGroupId", SecurityGroupId);
		    //协议类型  tcp udp icmp gre all
		    rpmap.put("IpProtocol", IpProtocol);
		    //端口取值范围 
		    rpmap.put("PortRange", PortRange);
		    //源目的IPV4段
		    rpmap.put("sourceTypes", "ipv4");
		    rpmap.put("SourceCidrIp", SourceCidrIp);
		    
		    
     		ASClient client = new ASClient();
     		client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
     		client.addHeader("x-acs-regionid", rp.getRegionId());
     		client.addHeader("x-acs-resourcegroupid", "");
     		client.addHeader("x-acs-organizationid", organizationid);
     		client.addHeader("x-acs-instanceid", SecurityGroupId);
     		
     		String result = client.doRequest(rp.getApiGateWay(), rpmap);

     		//System.out.println("RevokeSecurityGroup API Success!");
     		return result;			
     	} catch (Exception e) {
     		System.out.println("RevokeSecurityGroup API Error!");
     		e.printStackTrace();
     		return null;
     	} 
    }
}
