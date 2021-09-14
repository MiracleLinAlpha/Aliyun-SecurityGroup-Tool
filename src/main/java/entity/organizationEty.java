package entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class organizationEty {
    private String alias;
    private String cuserId;
    private int id;
    private boolean internal;
    private String level;
    private String muserId;
    private String name;
    private int parentId;
    private List<String> supportRegionList;
    private String supportRegions;

    public organizationEty() {
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCuserId() {
        return cuserId;
    }

    public void setCuserId(String cuserId) {
        this.cuserId = cuserId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isInternal() {
        return internal;
    }

    public void setInternal(boolean internal) {
        this.internal = internal;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMuserId() {
        return muserId;
    }

    public void setMuserId(String muserId) {
        this.muserId = muserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public List<String> getSupportRegionList() {
        return supportRegionList;
    }

    public void setSupportRegionList(List<String> supportRegionList) {
        this.supportRegionList = supportRegionList;
    }

    public String getSupportRegions() {
        return supportRegions;
    }

    public void setSupportRegions(String supportRegions) {
        this.supportRegions = supportRegions;
    }
}
