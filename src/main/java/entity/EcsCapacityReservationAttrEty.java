package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class EcsCapacityReservationAttrEty {
	private String CapacityReservationPreference;
	private String CapacityReservationId;
	
	public EcsCapacityReservationAttrEty() {
		super();
	}

	public String getCapacityReservationPreference() {
		return CapacityReservationPreference;
	}

	public void setCapacityReservationPreference(String capacityReservationPreference) {
		CapacityReservationPreference = capacityReservationPreference;
	}

	public String getCapacityReservationId() {
		return CapacityReservationId;
	}

	public void setCapacityReservationId(String capacityReservationId) {
		CapacityReservationId = capacityReservationId;
	}
	
	
}
