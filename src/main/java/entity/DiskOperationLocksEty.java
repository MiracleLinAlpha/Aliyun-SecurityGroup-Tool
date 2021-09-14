package entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class DiskOperationLocksEty {
	private List<String> OperationLock;

	public DiskOperationLocksEty() {
		super();
	}

	public List<String> getOperationLock() {
		return OperationLock;
	}

	public void setOperationLock(List<String> operationLock) {
		OperationLock = operationLock;
	}
	
	
}
