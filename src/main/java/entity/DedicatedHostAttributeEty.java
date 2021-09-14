package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class DedicatedHostAttributeEty {
	private String DedicatedHostId;
	private String DedicatedHostName;
	
	public DedicatedHostAttributeEty() {
		super();
	}

	public String getDedicatedHostId() {
		return DedicatedHostId;
	}

	public void setDedicatedHostId(String dedicatedHostId) {
		DedicatedHostId = dedicatedHostId;
	}

	public String getDedicatedHostName() {
		return DedicatedHostName;
	}

	public void setDedicatedHostName(String dedicatedHostName) {
		DedicatedHostName = dedicatedHostName;
	}
	
	
}
