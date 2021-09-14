package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class EipAddressEty {
	private String AllocationId;
	private String IpAddress;
	private String InternetChargeType;
	
	public EipAddressEty() {
		super();
	}

	public String getAllocationId() {
		return AllocationId;
	}

	public void setAllocationId(String allocationId) {
		AllocationId = allocationId;
	}

	public String getIpAddress() {
		return IpAddress;
	}

	public void setIpAddress(String ipAddress) {
		IpAddress = ipAddress;
	}

	public String getInternetChargeType() {
		return InternetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		InternetChargeType = internetChargeType;
	}
	
	
}
