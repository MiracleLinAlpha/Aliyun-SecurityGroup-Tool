package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class VpcAttributesEty {
	private PrivateIpAddressEty PrivateIpAddress;
	private String VpcId;
	private String VSwitchId;
	private String NatIpAddress;
	
	public VpcAttributesEty() {
		super();
	}

	public VpcAttributesEty(PrivateIpAddressEty privateIpAddress, String vpcId, String vSwitchId, String natIpAddress) {
		super();
		PrivateIpAddress = privateIpAddress;
		VpcId = vpcId;
		VSwitchId = vSwitchId;
		NatIpAddress = natIpAddress;
	}

	public PrivateIpAddressEty getPrivateIpAddress() {
		return PrivateIpAddress;
	}

	public void setPrivateIpAddress(PrivateIpAddressEty privateIpAddress) {
		PrivateIpAddress = privateIpAddress;
	}

	public String getVpcId() {
		return VpcId;
	}

	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}

	public String getVSwitchId() {
		return VSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		VSwitchId = vSwitchId;
	}

	public String getNatIpAddress() {
		return NatIpAddress;
	}

	public void setNatIpAddress(String natIpAddress) {
		NatIpAddress = natIpAddress;
	}
	
	
	
}
