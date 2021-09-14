package entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class VSwitchIdsEty {
	private List<String> VSwitchId;

	public VSwitchIdsEty() {
		super();
	}

	public List<String> getVSwitchId() {
		return VSwitchId;
	}

	public void setVSwitchId(List<String> vSwitchId) {
		VSwitchId = vSwitchId;
	}
	
	
}
