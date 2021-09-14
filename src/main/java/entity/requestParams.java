package entity;

public class requestParams {
	private String RegionId;
	private String AccessKeyId;
	private String AccessKeySecret;
	private String apiGateWay;
	private String StartTime;
	private String EndTime;
	private String Period;
	private String action;
	private String product;
	private String Version;
	private String Id;
	private String displayName;
	
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public requestParams() {
		
	}

	public requestParams(String regionId, String accessKeyId, String accessKeySecret, String apiGateWay,
			String startTime, String endTime, String period, String action, String product, String version, String id) {
		super();
		RegionId = regionId;
		AccessKeyId = accessKeyId;
		AccessKeySecret = accessKeySecret;
		this.apiGateWay = apiGateWay;
		StartTime = startTime;
		EndTime = endTime;
		Period = period;
		this.action = action;
		this.product = product;
		Version = version;
		Id = id;
	}

	public String getRegionId() {
		return RegionId;
	}

	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	public String getAccessKeyId() {
		return AccessKeyId;
	}

	public void setAccessKeyId(String accessKeyId) {
		AccessKeyId = accessKeyId;
	}

	public String getAccessKeySecret() {
		return AccessKeySecret;
	}

	public void setAccessKeySecret(String accessKeySecret) {
		AccessKeySecret = accessKeySecret;
	}

	public String getApiGateWay() {
		return apiGateWay;
	}

	public void setApiGateWay(String apiGateWay) {
		this.apiGateWay = apiGateWay;
	}

	public String getStartTime() {
		return StartTime;
	}

	public void setStartTime(String startTime) {
		StartTime = startTime;
	}

	public String getEndTime() {
		return EndTime;
	}

	public void setEndTime(String endTime) {
		EndTime = endTime;
	}

	public String getPeriod() {
		return Period;
	}

	public void setPeriod(String period) {
		Period = period;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getVersion() {
		return Version;
	}

	public void setVersion(String version) {
		Version = version;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
	
}
