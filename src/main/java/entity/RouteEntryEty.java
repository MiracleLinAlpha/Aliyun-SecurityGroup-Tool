package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class RouteEntryEty {
	private NextHopsEty NextHops;
	private String Status;
	private String RouteEntryName;
	private String RouteEntryId;
	private String Type;
	private String IpVersion;
	private String RouteTableId;
	private String DestinationCidrBlock;
	
	public RouteEntryEty() {
		super();
	}

	public NextHopsEty getNextHops() {
		return NextHops;
	}

	public void setNextHops(NextHopsEty nextHops) {
		NextHops = nextHops;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getRouteEntryName() {
		return RouteEntryName;
	}

	public void setRouteEntryName(String routeEntryName) {
		RouteEntryName = routeEntryName;
	}

	public String getRouteEntryId() {
		return RouteEntryId;
	}

	public void setRouteEntryId(String routeEntryId) {
		RouteEntryId = routeEntryId;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getIpVersion() {
		return IpVersion;
	}

	public void setIpVersion(String ipVersion) {
		IpVersion = ipVersion;
	}

	public String getRouteTableId() {
		return RouteTableId;
	}

	public void setRouteTableId(String routeTableId) {
		RouteTableId = routeTableId;
	}

	public String getDestinationCidrBlock() {
		return DestinationCidrBlock;
	}

	public void setDestinationCidrBlock(String destinationCidrBlock) {
		DestinationCidrBlock = destinationCidrBlock;
	}
	
	
}
