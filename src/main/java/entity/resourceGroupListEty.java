package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class resourceGroupListEty {
	private int organizationID;
	private String creator;
	private long gmtModified;
	private String resourceGroupName;
	private String organizationName;
	private long gmtCreated;
	private int resourceGroupType;
	private int id;
	
	public resourceGroupListEty() {
		super();
	}

	public int getOrganizationID() {
		return organizationID;
	}

	public void setOrganizationID(int organizationID) {
		this.organizationID = organizationID;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public long getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(long gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getResourceGroupName() {
		return resourceGroupName;
	}

	public void setResourceGroupName(String resourceGroupName) {
		this.resourceGroupName = resourceGroupName;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public long getGmtCreated() {
		return gmtCreated;
	}

	public void setGmtCreated(long gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public int getResourceGroupType() {
		return resourceGroupType;
	}

	public void setResourceGroupType(int resourceGroupType) {
		this.resourceGroupType = resourceGroupType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
