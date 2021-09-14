package entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class RouterTableIdsEty {
	private List<String> RouterTableIds;

	public RouterTableIdsEty() {
		super();
	}

	public List<String> getRouterTableIds() {
		return RouterTableIds;
	}

	public void setRouterTableIds(List<String> routerTableIds) {
		RouterTableIds = routerTableIds;
	}
	
	
}
