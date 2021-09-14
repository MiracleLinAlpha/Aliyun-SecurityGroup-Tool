package entity;

public class ipRangesEty {
    private String ipRange;
    private int loginPolicyId;
    private String protocol;

    public ipRangesEty() {
    }

    public String getIpRange() {
        return ipRange;
    }

    public void setIpRange(String ipRange) {
        this.ipRange = ipRange;
    }

    public int getLoginPolicyId() {
        return loginPolicyId;
    }

    public void setLoginPolicyId(int loginPolicyId) {
        this.loginPolicyId = loginPolicyId;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
}
