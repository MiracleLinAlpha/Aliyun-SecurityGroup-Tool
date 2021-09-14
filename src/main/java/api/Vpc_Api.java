package api;

import java.util.HashMap;
import java.util.Map;

import com.aliyun.asapi.ASClient;

import entity.requestParams;

public class Vpc_Api {
	public static String DescribeVpcs(requestParams rp) {
    	try {
    		Map<String, Object> requestParams = new HashMap<String, Object>();
     		requestParams.put("action", "DescribeVpcs");
     		requestParams.put("product", "Vpc");
		    requestParams.put("Version", "2016-04-28");
		    requestParams.put("RegionId", rp.getRegionId());
     	    requestParams.put("AccessKeyId", rp.getAccessKeyId());
     	    requestParams.put("AccessKeySecret", rp.getAccessKeySecret());
     	    
     	    
     		ASClient client = new ASClient();
     		client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
     		String result = client.doRequest(rp.getApiGateWay(), requestParams);

     		System.out.println("DescribeVpcs API Success!");
     		return result;		
     	} catch (Exception e) {
     		System.out.println("DescribeVpcs API Error!");
     		e.printStackTrace();
     		return null;
     	} 
    }
	
	public static String DescribeEipAddresses(requestParams rp) {
    	try {
    		Map<String, Object> requestParams = new HashMap<String, Object>();
     		requestParams.put("action", "DescribeEipAddresses");
     		requestParams.put("product", "Vpc");
		    requestParams.put("Version", "2016-04-28");
		    requestParams.put("RegionId", rp.getRegionId());
     	    requestParams.put("AccessKeyId", rp.getAccessKeyId());
     	    requestParams.put("AccessKeySecret", rp.getAccessKeySecret());
     	    
     	    
     		ASClient client = new ASClient();
     		client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
     		String result = client.doRequest(rp.getApiGateWay(), requestParams);

     		System.out.println("DescribeEipAddresses API Success!");
     		return result;		
     	} catch (Exception e) {
     		System.out.println("DescribeEipAddresses API Error!");
     		e.printStackTrace();
     		return null;
     	} 
    }
	
	public static String DescribeVSwitches(requestParams rp) {
    	try {
    		Map<String, Object> requestParams = new HashMap<String, Object>();
     		requestParams.put("action", "DescribeVSwitches");
     		requestParams.put("product", "Vpc");
		    requestParams.put("Version", "2016-04-28");
		    requestParams.put("RegionId", rp.getRegionId());
     	    requestParams.put("AccessKeyId", rp.getAccessKeyId());
     	    requestParams.put("AccessKeySecret", rp.getAccessKeySecret());
     	    
     	    
     		ASClient client = new ASClient();
     		client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
     		String result = client.doRequest(rp.getApiGateWay(), requestParams);

     		System.out.println("DescribeVSwitches API Success!");
     		return result;		
     	} catch (Exception e) {
     		System.out.println("DescribeVSwitches API Error!");
     		e.printStackTrace();
     		return null;
     	} 
    }
	
	public static String DescribeNatGateways(requestParams rp) {
    	try {
    		Map<String, Object> requestParams = new HashMap<String, Object>();
     		requestParams.put("action", "DescribeNatGateways");
     		requestParams.put("product", "Vpc");
		    requestParams.put("Version", "2016-04-28");
		    requestParams.put("RegionId", rp.getRegionId());
     	    requestParams.put("AccessKeyId", rp.getAccessKeyId());
     	    requestParams.put("AccessKeySecret", rp.getAccessKeySecret());
     	    
     	    
     		ASClient client = new ASClient();
     		client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
     		String result = client.doRequest(rp.getApiGateWay(), requestParams);

     		System.out.println("DescribeNatGateways API Success!");
     		return result;		
     	} catch (Exception e) {
     		System.out.println("DescribeNatGateways API Error!");
     		e.printStackTrace();
     		return null;
     	} 
    }
	
	
	public static String DescribeVSwitchAttributes(requestParams rp, String VSwitchId) {
    	try {
    		Map<String, Object> requestParams = new HashMap<String, Object>();
     		requestParams.put("action", "DescribeVSwitchAttributes");
     		requestParams.put("product", "Vpc");
		    requestParams.put("Version", "2016-04-28");
		    requestParams.put("RegionId", rp.getRegionId());
     	    requestParams.put("AccessKeyId", rp.getAccessKeyId());
     	    requestParams.put("AccessKeySecret", rp.getAccessKeySecret());
     	    
     	   requestParams.put("VSwitchId", VSwitchId);
     	    
     	    
     		ASClient client = new ASClient();
     		client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
     		String result = client.doRequest(rp.getApiGateWay(), requestParams);

     		System.out.println("DescribeVSwitchAttributes API Success!");
     		return result;		
     	} catch (Exception e) {
     		System.out.println("DescribeVSwitchAttributes API Error!");
     		e.printStackTrace();
     		return null;
     	} 
    }
	
	
	public static String DescribeRouteTables(requestParams rp, String organizationid, String RouteTableId) {
    	try {
    		Map<String, Object> requestParams = new HashMap<String, Object>();
     		requestParams.put("action", "DescribeRouteTables");
     		requestParams.put("product", "Vpc");
		    requestParams.put("Version", "2016-04-28");
		    requestParams.put("RegionId", rp.getRegionId());
     	    requestParams.put("AccessKeyId", rp.getAccessKeyId());
     	    requestParams.put("AccessKeySecret", rp.getAccessKeySecret());
     	    
     	    requestParams.put("RouteTableId", RouteTableId);
     	   
     		ASClient client = new ASClient();
     		client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
     		client.addHeader("x-acs-organizationid", organizationid);
     		client.addHeader("x-acs-instanceid", RouteTableId);
     		
     		String result = client.doRequest(rp.getApiGateWay(), requestParams);


     		System.out.println("DescribeRouteTables API Success!");
     		return result;		
     	} catch (Exception e) {
     		System.out.println("DescribeRouteTables API Error!");
     		e.printStackTrace();
     		return null;
     	} 
    }
	
	
	public static String DescribeRouteTableList(requestParams rp) {
    	try {
    		Map<String, Object> requestParams = new HashMap<String, Object>();
     		requestParams.put("action", "DescribeRouteTableList");
     		requestParams.put("product", "Vpc");
		    requestParams.put("Version", "2016-04-28");
		    requestParams.put("RegionId", rp.getRegionId());
     	    requestParams.put("AccessKeyId", rp.getAccessKeyId());
     	    requestParams.put("AccessKeySecret", rp.getAccessKeySecret());
     	    
     	    
     	    
     		ASClient client = new ASClient();
     		client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
     		String result = client.doRequest(rp.getApiGateWay(), requestParams);

     		System.out.println("DescribeRouteTableList API Success!");
     		return result;		
     	} catch (Exception e) {
     		System.out.println("DescribeRouteTableList API Error!");
     		e.printStackTrace();
     		return null;
     	} 
    }
	
	
	public static String DescribeRouteEntryList(requestParams rp, String organizationid, String RouteTableId) {
    	try {
    		Map<String, Object> requestParams = new HashMap<String, Object>();
     		requestParams.put("action", "DescribeRouteEntryList");
     		requestParams.put("product", "Vpc");
		    requestParams.put("Version", "2016-04-28");
		    requestParams.put("RegionId", rp.getRegionId());
     	    requestParams.put("AccessKeyId", rp.getAccessKeyId());
     	    requestParams.put("AccessKeySecret", rp.getAccessKeySecret());
     	    
     	    requestParams.put("RouteTableId", RouteTableId);
     	    
     		ASClient client = new ASClient();
     		client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
     		client.addHeader("x-acs-organizationid", organizationid);
     		client.addHeader("x-acs-instanceid", RouteTableId);
     		
     		String result = client.doRequest(rp.getApiGateWay(), requestParams);

     		System.out.println("DescribeRouteEntryList API Success!");
     		return result;		
     	} catch (Exception e) {
     		System.out.println("DescribeRouteEntryList API Error!");
     		e.printStackTrace();
     		return null;
     	} 
    }
}
