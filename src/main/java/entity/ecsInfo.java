package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class ecsInfo {
	private	String ResourceGroupId;
	private	int Memory;
	private	String InstanceChargeType;
	private	int Cpu;
	private	String OSName;
	private String InstanceBandwidthRx;
	private	String InstanceNetworkType;
	private	InnerIpAddressEty InnerIpAddress;

	private	int Department;
	private	String ExpiredTime;
	private	String ImageId;
	private	EipAddressEty EipAddress;

	private	String VlanId;
	private	String HostName;
	private	String Status;
	private MetadataOptionsEty MetadataOptions;

	private	String InstanceId;
	private	String StoppedMode;
	private CpuOptionsEty CpuOptions;

	private	String StartTime;
	private boolean DeletionProtection;
	private	SecurityGroupIdsEty SecurityGroupIds;

	private	VpcAttributesEty VpcAttributes;

	private	String InternetChargeType;
	private	String InstanceName;
	private	String DeploymentSetId;
	private	int InternetMaxBandwidthOut;
	private	String SerialNumber;
	private	String OSType;
	private	String CreationTime;
	private	String DepartmentName;
	private	String AutoReleaseTime;
	private	String ResourceGroupName;
	private	String Description;
	private	String InstanceTypeFamily;
	private	DedicatedInstanceAttributeEty DedicatedInstanceAttribute;

	private String InstanceBandwidthTx;
	private	PublicIpAddressEty PublicIpAddress;

	private	String GPUSpec;
	private	NetworkInterfacesEty NetworkInterfaces;

	private	float SpotPriceLimit;

	public float getSpotPriceLimit() {
		return SpotPriceLimit;
	}

	public void setSpotPriceLimit(float spotPriceLimit) {
		SpotPriceLimit = spotPriceLimit;
	}

	private	boolean DeviceAvailable;
	private	String SaleCycle;
	private	String InstanceType;
	private	String SpotStrategy;
	private	String OSNameEn;
	private	int ResourceGroup;
	private	boolean IoOptimized;
	private	String ZoneId;
	private	String ClusterId;
	private	EcsCapacityReservationAttrEty EcsCapacityReservationAttr;

	private	DedicatedHostAttributeEty DedicatedHostAttribute;

	private	int GPUAmount;
	private	OperationLocksEty OperationLocks;

	private	int InternetMaxBandwidthIn;
	private	boolean Recyclable;
	private	String RegionId;
	private	String CreditSpecification;

	public ecsInfo() {
		super();
	}

	public String getResourceGroupId() {
		return ResourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		ResourceGroupId = resourceGroupId;
	}

	public int getMemory() {
		return Memory;
	}
	public void setMemory(int memory) {
		Memory = memory;
	}
	public String getInstanceChargeType() {
		return InstanceChargeType;
	}
	public void setInstanceChargeType(String instanceChargeType) {
		InstanceChargeType = instanceChargeType;
	}
	public int getCpu() {
		return Cpu;
	}
	public void setCpu(int cpu) {
		Cpu = cpu;
	}
	public String getOSName() {
		return OSName;
	}
	public void setOSName(String oSName) {
		OSName = oSName;
	}
	public String getInstanceNetworkType() {
		return InstanceNetworkType;
	}
	public void setInstanceNetworkType(String instanceNetworkType) {
		InstanceNetworkType = instanceNetworkType;
	}
	public InnerIpAddressEty getInnerIpAddress() {
		return InnerIpAddress;
	}
	public void setInnerIpAddress(InnerIpAddressEty innerIpAddress) {
		InnerIpAddress = innerIpAddress;
	}
	public int getDepartment() {
		return Department;
	}
	public void setDepartment(int department) {
		Department = department;
	}
	public String getExpiredTime() {
		return ExpiredTime;
	}
	public void setExpiredTime(String expiredTime) {
		ExpiredTime = expiredTime;
	}
	public String getImageId() {
		return ImageId;
	}
	public void setImageId(String imageId) {
		ImageId = imageId;
	}
	public EipAddressEty getEipAddress() {
		return EipAddress;
	}
	public void setEipAddress(EipAddressEty eipAddress) {
		EipAddress = eipAddress;
	}
	public String getVlanId() {
		return VlanId;
	}
	public void setVlanId(String vlanId) {
		VlanId = vlanId;
	}
	public String getHostName() {
		return HostName;
	}
	public void setHostName(String hostName) {
		HostName = hostName;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getInstanceId() {
		return InstanceId;
	}
	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}
	public String getStoppedMode() {
		return StoppedMode;
	}
	public void setStoppedMode(String stoppedMode) {
		StoppedMode = stoppedMode;
	}
	public String getStartTime() {
		return StartTime;
	}
	public void setStartTime(String startTime) {
		StartTime = startTime;
	}
	public SecurityGroupIdsEty getSecurityGroupIds() {
		return SecurityGroupIds;
	}
	public void setSecurityGroupIds(SecurityGroupIdsEty securityGroupIds) {
		SecurityGroupIds = securityGroupIds;
	}
	public VpcAttributesEty getVpcAttributes() {
		return VpcAttributes;
	}
	public void setVpcAttributes(VpcAttributesEty vpcAttributes) {
		VpcAttributes = vpcAttributes;
	}
	public String getInternetChargeType() {
		return InternetChargeType;
	}
	public void setInternetChargeType(String internetChargeType) {
		InternetChargeType = internetChargeType;
	}
	public String getInstanceName() {
		return InstanceName;
	}
	public void setInstanceName(String instanceName) {
		InstanceName = instanceName;
	}
	public String getDeploymentSetId() {
		return DeploymentSetId;
	}
	public void setDeploymentSetId(String deploymentSetId) {
		DeploymentSetId = deploymentSetId;
	}
	public int getInternetMaxBandwidthOut() {
		return InternetMaxBandwidthOut;
	}
	public void setInternetMaxBandwidthOut(int internetMaxBandwidthOut) {
		InternetMaxBandwidthOut = internetMaxBandwidthOut;
	}
	public String getSerialNumber() {
		return SerialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}
	public String getOSType() {
		return OSType;
	}
	public void setOSType(String oSType) {
		OSType = oSType;
	}
	public String getCreationTime() {
		return CreationTime;
	}
	public void setCreationTime(String creationTime) {
		CreationTime = creationTime;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	public String getAutoReleaseTime() {
		return AutoReleaseTime;
	}
	public void setAutoReleaseTime(String autoReleaseTime) {
		AutoReleaseTime = autoReleaseTime;
	}
	public String getResourceGroupName() {
		return ResourceGroupName;
	}
	public void setResourceGroupName(String resourceGroupName) {
		ResourceGroupName = resourceGroupName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getInstanceTypeFamily() {
		return InstanceTypeFamily;
	}
	public void setInstanceTypeFamily(String instanceTypeFamily) {
		InstanceTypeFamily = instanceTypeFamily;
	}
	public DedicatedInstanceAttributeEty getDedicatedInstanceAttribute() {
		return DedicatedInstanceAttribute;
	}
	public void setDedicatedInstanceAttribute(DedicatedInstanceAttributeEty dedicatedInstanceAttribute) {
		DedicatedInstanceAttribute = dedicatedInstanceAttribute;
	}
	public PublicIpAddressEty getPublicIpAddress() {
		return PublicIpAddress;
	}
	public void setPublicIpAddress(PublicIpAddressEty publicIpAddress) {
		PublicIpAddress = publicIpAddress;
	}
	public String getGPUSpec() {
		return GPUSpec;
	}
	public void setGPUSpec(String gPUSpec) {
		GPUSpec = gPUSpec;
	}
	public NetworkInterfacesEty getNetworkInterfaces() {
		return NetworkInterfaces;
	}
	public void setNetworkInterfaces(NetworkInterfacesEty networkInterfaces) {
		NetworkInterfaces = networkInterfaces;
	}
	public boolean isDeviceAvailable() {
		return DeviceAvailable;
	}

	public String getInstanceBandwidthRx() {
		return InstanceBandwidthRx;
	}

	public void setInstanceBandwidthRx(String instanceBandwidthRx) {
		InstanceBandwidthRx = instanceBandwidthRx;
	}

	public MetadataOptionsEty getMetadataOptions() {
		return MetadataOptions;
	}

	public void setMetadataOptions(MetadataOptionsEty metadataOptions) {
		MetadataOptions = metadataOptions;
	}

	public CpuOptionsEty getCpuOptions() {
		return CpuOptions;
	}

	public void setCpuOptions(CpuOptionsEty cpuOptions) {
		CpuOptions = cpuOptions;
	}

	public boolean isDeletionProtection() {
		return DeletionProtection;
	}

	public void setDeletionProtection(boolean deletionProtection) {
		DeletionProtection = deletionProtection;
	}

	public String getInstanceBandwidthTx() {
		return InstanceBandwidthTx;
	}

	public void setInstanceBandwidthTx(String instanceBandwidthTx) {
		InstanceBandwidthTx = instanceBandwidthTx;
	}


	public void setDeviceAvailable(boolean deviceAvailable) {
		DeviceAvailable = deviceAvailable;
	}
	public String getSaleCycle() {
		return SaleCycle;
	}
	public void setSaleCycle(String saleCycle) {
		SaleCycle = saleCycle;
	}
	public String getInstanceType() {
		return InstanceType;
	}
	public void setInstanceType(String instanceType) {
		InstanceType = instanceType;
	}
	public String getSpotStrategy() {
		return SpotStrategy;
	}
	public void setSpotStrategy(String spotStrategy) {
		SpotStrategy = spotStrategy;
	}
	public String getOSNameEn() {
		return OSNameEn;
	}
	public void setOSNameEn(String oSNameEn) {
		OSNameEn = oSNameEn;
	}
	public int getResourceGroup() {
		return ResourceGroup;
	}
	public void setResourceGroup(int resourceGroup) {
		ResourceGroup = resourceGroup;
	}
	public boolean isIoOptimized() {
		return IoOptimized;
	}
	public void setIoOptimized(boolean ioOptimized) {
		IoOptimized = ioOptimized;
	}
	public String getZoneId() {
		return ZoneId;
	}
	public void setZoneId(String zoneId) {
		ZoneId = zoneId;
	}
	public String getClusterId() {
		return ClusterId;
	}
	public void setClusterId(String clusterId) {
		ClusterId = clusterId;
	}
	public EcsCapacityReservationAttrEty getEcsCapacityReservationAttr() {
		return EcsCapacityReservationAttr;
	}
	public void setEcsCapacityReservationAttr(EcsCapacityReservationAttrEty ecsCapacityReservationAttr) {
		EcsCapacityReservationAttr = ecsCapacityReservationAttr;
	}
	public DedicatedHostAttributeEty getDedicatedHostAttribute() {
		return DedicatedHostAttribute;
	}
	public void setDedicatedHostAttribute(DedicatedHostAttributeEty dedicatedHostAttribute) {
		DedicatedHostAttribute = dedicatedHostAttribute;
	}
	public int getGPUAmount() {
		return GPUAmount;
	}
	public void setGPUAmount(int gPUAmount) {
		GPUAmount = gPUAmount;
	}
	public OperationLocksEty getOperationLocks() {
		return OperationLocks;
	}
	public void setOperationLocks(OperationLocksEty operationLocks) {
		OperationLocks = operationLocks;
	}
	public int getInternetMaxBandwidthIn() {
		return InternetMaxBandwidthIn;
	}
	public void setInternetMaxBandwidthIn(int internetMaxBandwidthIn) {
		InternetMaxBandwidthIn = internetMaxBandwidthIn;
	}
	public boolean isRecyclable() {
		return Recyclable;
	}
	public void setRecyclable(boolean recyclable) {
		Recyclable = recyclable;
	}
	public String getRegionId() {
		return RegionId;
	}
	public void setRegionId(String regionId) {
		RegionId = regionId;
	}
	public String getCreditSpecification() {
		return CreditSpecification;
	}
	public void setCreditSpecification(String creditSpecification) {
		CreditSpecification = creditSpecification;
	}



}
