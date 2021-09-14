package entity;

public class CpuOptionsEty {

    private int ThreadsPerCore;
    private String  Numa;
    private int CoreCount;

    public CpuOptionsEty() {
    }

    public int getThreadsPerCore() {
        return ThreadsPerCore;
    }

    public void setThreadsPerCore(int threadsPerCore) {
        ThreadsPerCore = threadsPerCore;
    }

    public String getNuma() {
        return Numa;
    }

    public void setNuma(String numa) {
        Numa = numa;
    }

    public int getCoreCount() {
        return CoreCount;
    }

    public void setCoreCount(int coreCount) {
        CoreCount = coreCount;
    }
}
