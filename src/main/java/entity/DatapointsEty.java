package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class DatapointsEty {
	private long timestamp;
	private String userId;
	private String instanceId;
	private float Minimum;
	private float Maximum;
	private float Average;
	
	public DatapointsEty() {
		super();
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public float getMinimum() {
		return Minimum;
	}

	public void setMinimum(float minimum) {
		Minimum = minimum;
	}

	public float getMaximum() {
		return Maximum;
	}

	public void setMaximum(float maximum) {
		Maximum = maximum;
	}

	public float getAverage() {
		return Average;
	}

	public void setAverage(float average) {
		Average = average;
	}
	
	
}
