package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class vpcInfo {
	private boolean IsDefault;
	private String Status;
	private int shared;
	private String Description;
	private String ResourceGroupId;
	private VSwitchIdsEty VSwitchIds;
	private RouterTableIdsEty RouterTableIds;
	private String CidrBlock;
	private UserCidrsEty UserCidrs;
	private String VRouterId;
	private int Department;
	private NatGatewayIdsEty NatGatewayIds;
	private String VpcId;
	private String CreationTime;
	private String DepartmentName;
	private String VpcName;
	private String RegionId;
	private String Ipv6CidrBlock;
	private int ResourceGroup;
	private String ResourceGroupName;
	
	public vpcInfo() {
		super();
	}

	public boolean isIsDefault() {
		return IsDefault;
	}

	public void setIsDefault(boolean isDefault) {
		IsDefault = isDefault;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public int getShared() {
		return shared;
	}

	public void setShared(int shared) {
		this.shared = shared;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getResourceGroupId() {
		return ResourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		ResourceGroupId = resourceGroupId;
	}

	public VSwitchIdsEty getVSwitchIds() {
		return VSwitchIds;
	}

	public void setVSwitchIds(VSwitchIdsEty vSwitchIds) {
		VSwitchIds = vSwitchIds;
	}

	public RouterTableIdsEty getRouterTableIds() {
		return RouterTableIds;
	}

	public void setRouterTableIds(RouterTableIdsEty routerTableIds) {
		RouterTableIds = routerTableIds;
	}

	public String getCidrBlock() {
		return CidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		CidrBlock = cidrBlock;
	}

	public UserCidrsEty getUserCidrs() {
		return UserCidrs;
	}

	public void setUserCidrs(UserCidrsEty userCidrs) {
		UserCidrs = userCidrs;
	}

	public String getVRouterId() {
		return VRouterId;
	}

	public void setVRouterId(String vRouterId) {
		VRouterId = vRouterId;
	}


	public NatGatewayIdsEty getNatGatewayIds() {
		return NatGatewayIds;
	}

	public void setNatGatewayIds(NatGatewayIdsEty natGatewayIds) {
		NatGatewayIds = natGatewayIds;
	}

	public String getVpcId() {
		return VpcId;
	}

	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}

	public String getCreationTime() {
		return CreationTime;
	}

	public void setCreationTime(String creationTime) {
		CreationTime = creationTime;
	}

	public int getDepartment() {
		return Department;
	}

	public void setDepartment(int department) {
		Department = department;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	public String getVpcName() {
		return VpcName;
	}

	public void setVpcName(String vpcName) {
		VpcName = vpcName;
	}

	public String getRegionId() {
		return RegionId;
	}

	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	public String getIpv6CidrBlock() {
		return Ipv6CidrBlock;
	}

	public void setIpv6CidrBlock(String ipv6CidrBlock) {
		Ipv6CidrBlock = ipv6CidrBlock;
	}

	public int getResourceGroup() {
		return ResourceGroup;
	}

	public void setResourceGroup(int resourceGroup) {
		ResourceGroup = resourceGroup;
	}

	public String getResourceGroupName() {
		return ResourceGroupName;
	}

	public void setResourceGroupName(String resourceGroupName) {
		ResourceGroupName = resourceGroupName;
	}
	
	
	
	
}
