package entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class NatGatewayIdsEty {
	private List<String> NatGatewayIds;

	public NatGatewayIdsEty() {
		super();
	}

	public List<String> getNatGatewayIds() {
		return NatGatewayIds;
	}

	public void setNatGatewayIds(List<String> natGatewayIds) {
		NatGatewayIds = natGatewayIds;
	}
	
	
}
