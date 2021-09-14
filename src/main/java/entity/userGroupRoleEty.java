package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class userGroupRoleEty {
    private boolean active;
    private String code;
    private long ctime;
    private String cuserId;
    private boolean Default;
    private boolean enable;
    private int id;
    private boolean rAMRole;
    private long roleLevel;
    private String roleName;
    private String roleRange;
    private String roleType;

    public userGroupRoleEty() {
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getCtime() {
        return ctime;
    }

    public void setCtime(long ctime) {
        this.ctime = ctime;
    }

    public String getCuserId() {
        return cuserId;
    }

    public void setCuserId(String cuserId) {
        this.cuserId = cuserId;
    }

    public boolean isDefault() {
        return Default;
    }

    public void setDefault(boolean aDefault) {
        Default = aDefault;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isrAMRole() {
        return rAMRole;
    }

    public void setrAMRole(boolean rAMRole) {
        this.rAMRole = rAMRole;
    }

    public long getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(long roleLevel) {
        this.roleLevel = roleLevel;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleRange() {
        return roleRange;
    }

    public void setRoleRange(String roleRange) {
        this.roleRange = roleRange;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }
}
