package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class RouterTableListEty {
	private String Description;
	private String RouteTableId;
	private String ResourceGroupId;
	private VSwitchIdsEty VSwitchIds;
	private String RouterId;
	private String RouteTableType;
	private int Department;
	private String VpcId;
	private String RouterType;
	private String CreationTime;
	private String DepartmentName;
	private String RouteTableName;
	private int ResourceGroup;
	private String ResourceGroupName;
	
	public RouterTableListEty() {
		super();
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getRouteTableId() {
		return RouteTableId;
	}

	public void setRouteTableId(String routeTableId) {
		RouteTableId = routeTableId;
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

	public String getRouterId() {
		return RouterId;
	}

	public void setRouterId(String routerId) {
		RouterId = routerId;
	}

	public String getRouteTableType() {
		return RouteTableType;
	}

	public void setRouteTableType(String routeTableType) {
		RouteTableType = routeTableType;
	}

	public int getDepartment() {
		return Department;
	}

	public void setDepartment(int department) {
		Department = department;
	}

	public String getVpcId() {
		return VpcId;
	}

	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}

	public String getRouterType() {
		return RouterType;
	}

	public void setRouterType(String routerType) {
		RouterType = routerType;
	}

	public String getCreationTime() {
		return CreationTime;
	}

	public void setCreationTime(String creationTime) {
		CreationTime = creationTime;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	public String getRouteTableName() {
		return RouteTableName;
	}

	public void setRouteTableName(String routeTableName) {
		RouteTableName = routeTableName;
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
