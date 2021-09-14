package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class NetworkInterfaceEty {
	private String PrimaryIpAddress;
	private String MacAddress;
	private String NetworkInterfaceId;
	
	public NetworkInterfaceEty() {
		super();
	}

	public NetworkInterfaceEty(String primaryIpAddress, String macAddress, String networkInterfaceId) {
		super();
		PrimaryIpAddress = primaryIpAddress;
		MacAddress = macAddress;
		NetworkInterfaceId = networkInterfaceId;
	}

	public String getPrimaryIpAddress() {
		return PrimaryIpAddress;
	}

	public void setPrimaryIpAddress(String primaryIpAddress) {
		PrimaryIpAddress = primaryIpAddress;
	}

	public String getMacAddress() {
		return MacAddress;
	}

	public void setMacAddress(String macAddress) {
		MacAddress = macAddress;
	}

	public String getNetworkInterfaceId() {
		return NetworkInterfaceId;
	}

	public void setNetworkInterfaceId(String networkInterfaceId) {
		NetworkInterfaceId = networkInterfaceId;
	}
	
	
	
}	
