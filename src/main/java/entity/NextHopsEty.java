package entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class NextHopsEty {
	private List<NextHopEty> NextHop;

	public NextHopsEty() {
		super();
	}

	public List<NextHopEty> getNextHop() {
		return NextHop;
	}

	public void setNextHop(List<NextHopEty> nextHop) {
		NextHop = nextHop;
	}
	
	
}
