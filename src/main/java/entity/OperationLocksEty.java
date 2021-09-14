package entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class OperationLocksEty {
	private List<String> LockReason;

	public OperationLocksEty() {
		super();
	}

	public List<String> getLockReason() {
		return LockReason;
	}

	public void setLockReason(List<String> lockReason) {
		LockReason = lockReason;
	}
	
	
}
