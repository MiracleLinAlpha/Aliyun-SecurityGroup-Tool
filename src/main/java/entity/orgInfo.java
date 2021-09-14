package entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class orgInfo {
	private List<resourceGroupListEty> resourceGroupList;
	
	private List<orgInfo> children;
	private String name;
	private boolean active;
	private String alias;
	private int id;
	private int parentId;
	
	public orgInfo() {
		super();
	}


	public List<resourceGroupListEty> getResourceGroupList() {
		return resourceGroupList;
	}


	public void setResourceGroupList(List<resourceGroupListEty> resourceGroupList) {
		this.resourceGroupList = resourceGroupList;
	}


	public List<orgInfo> getChildren() {
		return children;
	}

	public void setChildren(List<orgInfo> children) {
		this.children = children;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	
	
}
