package entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class TagsEty {
	private List<TagEty> Tag;

	public TagsEty() {
		super();
	}

	public List<TagEty> getTag() {
		return Tag;
	}

	public void setTag(List<TagEty> tag) {
		Tag = tag;
	} 
	
	
}
