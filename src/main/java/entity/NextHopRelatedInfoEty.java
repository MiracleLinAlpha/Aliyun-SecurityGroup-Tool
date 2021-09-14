package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class NextHopRelatedInfoEty {
	private String InstanceId;
	private String RegionId;
	private String InstanceType;
	
	public NextHopRelatedInfoEty() {
		super();
	}

	public String getInstanceId() {
		return InstanceId;
	}

	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}

	public String getRegionId() {
		return RegionId;
	}

	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	public String getInstanceType() {
		return InstanceType;
	}

	public void setInstanceType(String instanceType) {
		InstanceType = instanceType;
	}
	
	
}
