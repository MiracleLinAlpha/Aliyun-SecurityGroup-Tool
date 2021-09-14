package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class SecurityGroupRuleEty {
	private String Policy;
	private String SourceGroupId;
	private String Description;
	private String SourcePortRange;
	private int Priority;
	private String CreateTime;
	private String RuleId;
	private String Ipv6SourceCidrIp;
	private String NicType;
	private String DestGroupId;
	private String Direction;
	private String SourceGroupName;
	private String PortRange;
	private String DestGroupOwnerAccount;
	private String SourceCidrIp;
	private String IpProtocol;
	private String DestCidrIp;
	private String DestGroupName;
	private String Ipv6DestCidrIp;
	private String SourceGroupOwnerAccount;
	private String ExpireTime;
	
	public SecurityGroupRuleEty() {
		super();
	}

	public String getPolicy() {
		return Policy;
	}

	public void setPolicy(String policy) {
		Policy = policy;
	}

	public String getSourceGroupId() {
		return SourceGroupId;
	}

	public void setSourceGroupId(String sourceGroupId) {
		SourceGroupId = sourceGroupId;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getSourcePortRange() {
		return SourcePortRange;
	}

	public void setSourcePortRange(String sourcePortRange) {
		SourcePortRange = sourcePortRange;
	}

	public int getPriority() {
		return Priority;
	}

	public void setPriority(int priority) {
		Priority = priority;
	}

	public String getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}

	public String getRuleId() {
		return RuleId;
	}

	public void setRuleId(String ruleId) {
		RuleId = ruleId;
	}

	public String getIpv6SourceCidrIp() {
		return Ipv6SourceCidrIp;
	}

	public void setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
		Ipv6SourceCidrIp = ipv6SourceCidrIp;
	}

	public String getNicType() {
		return NicType;
	}

	public void setNicType(String nicType) {
		NicType = nicType;
	}

	public String getDestGroupId() {
		return DestGroupId;
	}

	public void setDestGroupId(String destGroupId) {
		DestGroupId = destGroupId;
	}

	public String getDirection() {
		return Direction;
	}

	public void setDirection(String direction) {
		Direction = direction;
	}

	public String getSourceGroupName() {
		return SourceGroupName;
	}

	public void setSourceGroupName(String sourceGroupName) {
		SourceGroupName = sourceGroupName;
	}

	public String getPortRange() {
		return PortRange;
	}

	public void setPortRange(String portRange) {
		PortRange = portRange;
	}

	public String getDestGroupOwnerAccount() {
		return DestGroupOwnerAccount;
	}

	public void setDestGroupOwnerAccount(String destGroupOwnerAccount) {
		DestGroupOwnerAccount = destGroupOwnerAccount;
	}

	public String getSourceCidrIp() {
		return SourceCidrIp;
	}

	public void setSourceCidrIp(String sourceCidrIp) {
		SourceCidrIp = sourceCidrIp;
	}

	public String getIpProtocol() {
		return IpProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		IpProtocol = ipProtocol;
	}

	public String getDestCidrIp() {
		return DestCidrIp;
	}

	public void setDestCidrIp(String destCidrIp) {
		DestCidrIp = destCidrIp;
	}

	public String getDestGroupName() {
		return DestGroupName;
	}

	public void setDestGroupName(String destGroupName) {
		DestGroupName = destGroupName;
	}

	public String getIpv6DestCidrIp() {
		return Ipv6DestCidrIp;
	}

	public void setIpv6DestCidrIp(String ipv6DestCidrIp) {
		Ipv6DestCidrIp = ipv6DestCidrIp;
	}

	public String getSourceGroupOwnerAccount() {
		return SourceGroupOwnerAccount;
	}

	public void setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
		SourceGroupOwnerAccount = sourceGroupOwnerAccount;
	}

	public String getExpireTime() {
		return ExpireTime;
	}

	public void setExpireTime(String expireTime) {
		ExpireTime = expireTime;
	}
	
}
