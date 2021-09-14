package entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class SecurityGroupIdsEty {
	private List<String> SecurityGroupId;

	
	public SecurityGroupIdsEty() {
		super();
	}


	public SecurityGroupIdsEty(List<String> securityGroupId) {
		super();
		SecurityGroupId = securityGroupId;
	}


	public List<String> getSecurityGroupId() {
		return SecurityGroupId;
	}


	public void setSecurityGroupId(List<String> securityGroupId) {
		SecurityGroupId = securityGroupId;
	}
	
	
	
}
