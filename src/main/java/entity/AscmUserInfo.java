package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class AscmUserInfo {
    private List<accessKeysEty> accessKeys;
    private String cellphoneNum;
    private boolean Default;
    private defaultRoleEty defaultRole;
    private boolean deleted;
    private String displayName;
    private String email;
    private boolean enableDingTalk;
    private boolean enableEmail;
    private boolean enableShortMessage;
    private int id;
    private long lastLoginTime;
    private String loginName;
    private loginPolicyEty loginPolicy;
    private String mobileNationCode;
    private organizationEty organization;
    private String parentPk;
    private String primaryKey;
    private List<roleEty> roles;
    private String status;
    private List<userGroupRoleEty> userGroupRoles;
    private List<userRoleEty> userRoles;

    public AscmUserInfo() {
    }

    public List<accessKeysEty> getAccessKeys() {
        return accessKeys;
    }

    public void setAccessKeys(List<accessKeysEty> accessKeys) {
        this.accessKeys = accessKeys;
    }

    public String getCellphoneNum() {
        return cellphoneNum;
    }

    public void setCellphoneNum(String cellphoneNum) {
        this.cellphoneNum = cellphoneNum;
    }

    public boolean isDefault() {
        return Default;
    }

    public void setDefault(boolean aDefault) {
        Default = aDefault;
    }

    public defaultRoleEty getDefaultRole() {
        return defaultRole;
    }

    public void setDefaultRole(defaultRoleEty defaultRole) {
        this.defaultRole = defaultRole;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEnableDingTalk() {
        return enableDingTalk;
    }

    public void setEnableDingTalk(boolean enableDingTalk) {
        this.enableDingTalk = enableDingTalk;
    }

    public boolean isEnableEmail() {
        return enableEmail;
    }

    public void setEnableEmail(boolean enableEmail) {
        this.enableEmail = enableEmail;
    }

    public boolean isEnableShortMessage() {
        return enableShortMessage;
    }

    public void setEnableShortMessage(boolean enableShortMessage) {
        this.enableShortMessage = enableShortMessage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public loginPolicyEty getLoginPolicy() {
        return loginPolicy;
    }

    public void setLoginPolicy(loginPolicyEty loginPolicy) {
        this.loginPolicy = loginPolicy;
    }

    public String getMobileNationCode() {
        return mobileNationCode;
    }

    public void setMobileNationCode(String mobileNationCode) {
        this.mobileNationCode = mobileNationCode;
    }

    public organizationEty getOrganization() {
        return organization;
    }

    public void setOrganization(organizationEty organization) {
        this.organization = organization;
    }

    public String getParentPk() {
        return parentPk;
    }

    public void setParentPk(String parentPk) {
        this.parentPk = parentPk;
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public List<roleEty> getRoles() {
        return roles;
    }

    public void setRoles(List<roleEty> roles) {
        this.roles = roles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<userGroupRoleEty> getUserGroupRoles() {
        return userGroupRoles;
    }

    public void setUserGroupRoles(List<userGroupRoleEty> userGroupRoles) {
        this.userGroupRoles = userGroupRoles;
    }

    public List<userRoleEty> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<userRoleEty> userRoles) {
        this.userRoles = userRoles;
    }
}
