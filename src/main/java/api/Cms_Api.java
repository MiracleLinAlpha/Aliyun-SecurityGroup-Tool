package api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aliyun.asapi.ASClient;

import entity.ecsInfo;
import entity.requestParams;

public class Cms_Api {
	public static String DescribeMetricListByEcs(requestParams rp, String MetricName, String Namespace, String InstanceId, String organizationid, String StartTime, String EndTime, String Period) {
		try {
    		Map<String, Object> requestParams = new HashMap<String, Object>();
     		requestParams.put("action", "DescribeMetricList");
     		requestParams.put("product", "Cms");
		    requestParams.put("Version", "2019-01-01");
		    requestParams.put("RegionId", rp.getRegionId());
     	    requestParams.put("AccessKeyId", rp.getAccessKeyId());
     	    requestParams.put("AccessKeySecret", rp.getAccessKeySecret());
     	    
     	    requestParams.put("MetricName", MetricName);
     	    requestParams.put("Namespace", Namespace);
     	    requestParams.put("Dimensions", "{\"instanceId\":\"" + InstanceId + "\"}");
     	    
     	    
     	    requestParams.put("Period", Period);
     	    requestParams.put("StartTime", StartTime);
     	    requestParams.put("EndTime", EndTime);
     	    
     		ASClient client = new ASClient();
     		client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
     		client.addHeader("x-acs-regionid", "cn-haikou-hnzwy157-d01");
     		client.addHeader("x-acs-organizationid", organizationid);
     		String result = client.doRequest(rp.getApiGateWay(), requestParams);

     		
     		
     		//System.out.println("DescribeMetricListByEcs API Success!");
     		return result;		
     	} catch (Exception e) {
     		System.out.println("DescribeMetricListByEcs API Error!");
     		e.printStackTrace();
     		return null;
     	} 
	}
	
	
	
}
