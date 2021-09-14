package entity;

import java.util.ArrayList;
import java.util.List;

public class efficientAddRuleEty {
	String sourceIp;
	List<String> destIP = new ArrayList<String>();
	String IpProtocol;
	String PortRange;
	String Description;
	String SecurityGroupId;
	int Department;
	
	public efficientAddRuleEty() {
		super();
	}

	public String getSourceIp() {
		return sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}

	public String getDestIP() {
		StringBuffer temp = new StringBuffer(" ");
		for(int i=0;i<this.destIP.size();i++) {
			temp.append(this.destIP.get(i).toString() + " ");
		}
		return temp.toString();
	}

	public void setDestIP(String destIP) {
		this.destIP.add(destIP);
	}
	
	

	public String getIpProtocol() {
		return IpProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		IpProtocol = ipProtocol;
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
		return "efficientAddRuleEty [sourceIp=" + sourceIp + ", destIP=" + getDestIP() + ", IpProtocol=" + IpProtocol
				+ ", PortRange=" + PortRange + ", Description=" + Description + ", SecurityGroupId=" + SecurityGroupId
				+ ", Department=" + Department + "]";
	}
	
	
}
