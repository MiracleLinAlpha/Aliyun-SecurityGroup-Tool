package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class ConfSecurityGroupEty {
	String sourceIp;
	String destIP;
	String IpProtocol;
	String PortRange;
	String Description;
	String SecurityGroupId;
	int Department;
	
	public ConfSecurityGroupEty() {
		super();
	}

	public String getSourceIp() {
		return sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}

	public String getDestIP() {
		return destIP;
	}

	public void setDestIP(String destIP) {
		this.destIP = destIP;
	}

	public String getPortRange() {
		return PortRange;
	}

	public void setPortRange(String portRange) {
		PortRange = portRange;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	
	public String getIpProtocol() {
		return IpProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		IpProtocol = ipProtocol;
	}


	public String getSecurityGroupId() {
		return SecurityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		SecurityGroupId = securityGroupId;
	}

	public int getDepartment() {
		return Department;
	}

	public void setDepartment(int department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "ConfSecurityGroupEty [sourceIp=" + sourceIp + ", destIP=" + destIP + ", IpProtocol=" + IpProtocol
				+ ", PortRange=" + PortRange + ", Description=" + Description + ", SecurityGroupId=" + SecurityGroupId
				+ ", Department=" + Department + "]";
	}


	
	
	
}
