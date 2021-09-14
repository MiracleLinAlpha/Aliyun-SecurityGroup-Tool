package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class SecurityGroupAllEty {
	private int shared;
	private String Description;
	private String SecurityGroupName;
	private String ResourceGroupId;
	private String SecurityGroupId;
	private String SecurityGroupType;
	private int Department;
	private String VpcId;
	private String CreationTime;
	private String DepartmentName;
	private TagsEty Tags;
	private int ResourceGroup;
	private String ResourceGroupName;

	public int getShared() {
		return shared;
	}

	public void setShared(int shared) {
		this.shared = shared;
	}

	public String getResourceGroupId() {
		return ResourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		ResourceGroupId = resourceGroupId;
	}

	public String getSecurityGroupType() {
		return SecurityGroupType;
	}

	public void setSecurityGroupType(String securityGroupType) {
		SecurityGroupType = securityGroupType;
	}

	public SecurityGroupAllEty() {
		super();
	}


	public int getDepartment() {
		return Department;
	}


	public void setDepartment(int department) {
		Department = department;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public String getSecurityGroupName() {
		return SecurityGroupName;
	}


	public void setSecurityGroupName(String securityGroupName) {
		SecurityGroupName = securityGroupName;
	}


	public String getVpcId() {
		return VpcId;
	}


	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}


	public String getSecurityGroupId() {
		return SecurityGroupId;
	}


	public void setSecurityGroupId(String securityGroupId) {
		SecurityGroupId = securityGroupId;
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


	public TagsEty getTags() {
		return Tags;
	}


	public void setTags(TagsEty tags) {
		Tags = tags;
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
