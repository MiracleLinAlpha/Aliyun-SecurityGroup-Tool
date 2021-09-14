package entity;

public class timeRangesEty {
    private String endTime;
    private int loginPolicyId;
    private String startTime;

    public timeRangesEty() {
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getLoginPolicyId() {
        return loginPolicyId;
    }

    public void setLoginPolicyId(int loginPolicyId) {
        this.loginPolicyId = loginPolicyId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
}
