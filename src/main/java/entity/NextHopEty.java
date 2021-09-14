package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class NextHopEty {
	private int Enabled;
	private int Weight;
	private String NextHopId;
	private NextHopRelatedInfoEty NextHopRelatedInfo;
	private String NextHopType;
	
	public NextHopEty() {
		super();
	}

	public int getEnabled() {
		return Enabled;
	}

	public void setEnabled(int enabled) {
		Enabled = enabled;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}

	public String getNextHopId() {
		return NextHopId;
	}

	public void setNextHopId(String nextHopId) {
		NextHopId = nextHopId;
	}

	public NextHopRelatedInfoEty getNextHopRelatedInfo() {
		return NextHopRelatedInfo;
	}

	public void setNextHopRelatedInfo(NextHopRelatedInfoEty nextHopRelatedInfo) {
		NextHopRelatedInfo = nextHopRelatedInfo;
	}

	public String getNextHopType() {
		return NextHopType;
	}

	public void setNextHopType(String nextHopType) {
		NextHopType = nextHopType;
	}
	
}
