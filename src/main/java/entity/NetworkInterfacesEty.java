package entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class NetworkInterfacesEty {
	private List<NetworkInterfaceEty> NetworkInterface;

	public NetworkInterfacesEty() {
		super();
	}

	public NetworkInterfacesEty(List<NetworkInterfaceEty> networkInterface) {
		super();
		NetworkInterface = networkInterface;
	}

	public List<NetworkInterfaceEty> getNetworkInterface() {
		return NetworkInterface;
	}

	public void setNetworkInterface(List<NetworkInterfaceEty> networkInterface) {
		NetworkInterface = networkInterface;
	}
	
	
}
