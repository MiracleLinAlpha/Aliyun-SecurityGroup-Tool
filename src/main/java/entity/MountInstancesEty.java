package entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class MountInstancesEty {
	private List<String> MountInstance;

	public MountInstancesEty() {
		super();
	}

	public List<String> getMountInstance() {
		return MountInstance;
	}

	public void setMountInstance(List<String> mountInstance) {
		MountInstance = mountInstance;
	}
	
	
}
