package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class DedicatedInstanceAttributeEty {
	private String Tenancy;
	private String Affinity;
	
	public DedicatedInstanceAttributeEty() {
		super();
	}

	public String getTenancy() {
		return Tenancy;
	}

	public void setTenancy(String tenancy) {
		Tenancy = tenancy;
	}

	public String getAffinity() {
		return Affinity;
	}

	public void setAffinity(String affinity) {
		Affinity = affinity;
	}
	
	
}
