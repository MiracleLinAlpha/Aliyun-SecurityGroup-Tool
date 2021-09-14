package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class TagEty {
	private String TagKey;
	private String TagValue;
	
	public TagEty() {
		super();
	}

	public String getTagKey() {
		return TagKey;
	}

	public void setTagKey(String tagKey) {
		TagKey = tagKey;
	}

	public String getTagValue() {
		return TagValue;
	}

	public void setTagValue(String tagValue) {
		TagValue = tagValue;
	}
	
	
}
