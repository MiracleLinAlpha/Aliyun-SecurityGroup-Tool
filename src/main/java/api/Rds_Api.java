package api;

import java.util.HashMap;
import java.util.Map;

import com.aliyun.asapi.ASClient;

import entity.requestParams;

public class Rds_Api {
	public static String DescribeDBInstances(requestParams rp) {
    	try {
    		Map<String, Object> requestParams = new HashMap<String, Object>();
     		requestParams.put("action", "DescribeDBInstances");
     		requestParams.put("product", "Rds");
		    requestParams.put("Version", "2014-08-15");
		    requestParams.put("RegionId", rp.getRegionId());
     	    requestParams.put("AccessKeyId", rp.getAccessKeyId());
     	    requestParams.put("AccessKeySecret", rp.getAccessKeySecret());
     	    
     	    
     		ASClient client = new ASClient();
     		client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
     		String result = client.doRequest(rp.getApiGateWay(), requestParams);

     		System.out.println("DescribeDBInstances API Success!");
     		return result;		
     	} catch (Exception e) {
     		System.out.println("DescribeDBInstances API Error!");
     		e.printStackTrace();
     		return null;
     	} 
    }
	
}
