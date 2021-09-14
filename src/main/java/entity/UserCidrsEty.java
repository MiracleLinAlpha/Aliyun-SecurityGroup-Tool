package entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class UserCidrsEty {
	private List<String> UserCidr;

	public UserCidrsEty() {
		super();
	}

	public List<String> getUserCidr() {
		return UserCidr;
	}

	public void setUserCidr(List<String> userCidr) {
		UserCidr = userCidr;
	}
	
	
}
