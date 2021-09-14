package entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class InnerIpAddressEty {
	private List<String> IpAddress;

	public InnerIpAddressEty() {
		super();
	}

	public List<String> getIpAddress() {
		return IpAddress;
	}

	public void setIpAddress(List<String> ipAddress) {
		IpAddress = ipAddress;
	}

	
	
}
