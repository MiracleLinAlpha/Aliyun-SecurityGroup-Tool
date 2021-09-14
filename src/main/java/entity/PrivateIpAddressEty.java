package entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class PrivateIpAddressEty {
	private List<String> IpAddress;

	
	public PrivateIpAddressEty() {
		super();
	}

	
	public PrivateIpAddressEty(List<String> ipAddress) {
		super();
		IpAddress = ipAddress;
	}


	public List<String> getIpAddress() {
		return IpAddress;
	}

	public void setIpAddress(List<String> ipAddress) {
		IpAddress = ipAddress;
	}
	
}
