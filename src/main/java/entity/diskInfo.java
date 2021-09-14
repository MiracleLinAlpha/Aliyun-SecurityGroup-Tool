package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class diskInfo {
	private String DetachedTime;
	private String Description;
	private String Category;
	private String ResourceGroupId;
	private boolean Encrypted;
	private int Size;
	private boolean DeleteAutoSnapshot;
	private String DiskChargeType;
	private int Department;
	private String ExpiredTime;
	private String ImageId;
	private TagsEty Tags;
	
	private int ResourceGroup;
	private String Status;
	private String AttachedTime;
	private String ZoneId;
	private String InstanceId;
	private String SourceSnapshotId;
	private String ProductCode;
	private String Device;
	private boolean EnableAutomatedSnapshotPolicy;
	private boolean DeleteWithInstance;
	private boolean EnableAutoSnapshot;
	private String AutoSnapshotPolicyId;
	private String DiskName;
	private DiskOperationLocksEty OperationLocks;
	
	private boolean Portable;
	private String Type;
	private MountInstancesEty MountInstances;
	
	private String CreationTime;
	private String DepartmentName;
	private String RegionId;
	private String DiskId;
	private String ResourceGroupName;
	
	public diskInfo() {
		super();
	}

	public String getDetachedTime() {
		return DetachedTime;
	}

	public void setDetachedTime(String detachedTime) {
		DetachedTime = detachedTime;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getResourceGroupId() {
		return ResourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		ResourceGroupId = resourceGroupId;
	}

	public boolean isEncrypted() {
		return Encrypted;
	}

	public void setEncrypted(boolean encrypted) {
		Encrypted = encrypted;
	}

	public int getSize() {
		return Size;
	}

	public void setSize(int size) {
		Size = size;
	}

	public boolean isDeleteAutoSnapshot() {
		return DeleteAutoSnapshot;
	}

	public void setDeleteAutoSnapshot(boolean deleteAutoSnapshot) {
		DeleteAutoSnapshot = deleteAutoSnapshot;
	}

	public String getDiskChargeType() {
		return DiskChargeType;
	}

	public void setDiskChargeType(String diskChargeType) {
		DiskChargeType = diskChargeType;
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

	public TagsEty getTags() {
		return Tags;
	}

	public void setTags(TagsEty tags) {
		Tags = tags;
	}

	public int getResourceGroup() {
		return ResourceGroup;
	}

	public void setResourceGroup(int resourceGroup) {
		ResourceGroup = resourceGroup;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getAttachedTime() {
		return AttachedTime;
	}

	public void setAttachedTime(String attachedTime) {
		AttachedTime = attachedTime;
	}

	public String getZoneId() {
		return ZoneId;
	}

	public void setZoneId(String zoneId) {
		ZoneId = zoneId;
	}

	public String getInstanceId() {
		return InstanceId;
	}

	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}

	public String getSourceSnapshotId() {
		return SourceSnapshotId;
	}

	public void setSourceSnapshotId(String sourceSnapshotId) {
		SourceSnapshotId = sourceSnapshotId;
	}

	public String getProductCode() {
		return ProductCode;
	}

	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}

	public String getDevice() {
		return Device;
	}

	public void setDevice(String device) {
		Device = device;
	}

	public boolean isEnableAutomatedSnapshotPolicy() {
		return EnableAutomatedSnapshotPolicy;
	}

	public void setEnableAutomatedSnapshotPolicy(boolean enableAutomatedSnapshotPolicy) {
		EnableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
	}

	public boolean isDeleteWithInstance() {
		return DeleteWithInstance;
	}

	public void setDeleteWithInstance(boolean deleteWithInstance) {
		DeleteWithInstance = deleteWithInstance;
	}

	public boolean isEnableAutoSnapshot() {
		return EnableAutoSnapshot;
	}

	public void setEnableAutoSnapshot(boolean enableAutoSnapshot) {
		EnableAutoSnapshot = enableAutoSnapshot;
	}

	public String getAutoSnapshotPolicyId() {
		return AutoSnapshotPolicyId;
	}

	public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
		AutoSnapshotPolicyId = autoSnapshotPolicyId;
	}

	public String getDiskName() {
		return DiskName;
	}

	public void setDiskName(String diskName) {
		DiskName = diskName;
	}

	public DiskOperationLocksEty getOperationLocks() {
		return OperationLocks;
	}

	public void setOperationLocks(DiskOperationLocksEty operationLocks) {
		OperationLocks = operationLocks;
	}

	public boolean isPortable() {
		return Portable;
	}

	public void setPortable(boolean portable) {
		Portable = portable;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public MountInstancesEty getMountInstances() {
		return MountInstances;
	}

	public void setMountInstances(MountInstancesEty mountInstances) {
		MountInstances = mountInstances;
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

	public String getRegionId() {
		return RegionId;
	}

	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	public String getDiskId() {
		return DiskId;
	}

	public void setDiskId(String diskId) {
		DiskId = diskId;
	}

	public String getResourceGroupName() {
		return ResourceGroupName;
	}

	public void setResourceGroupName(String resourceGroupName) {
		ResourceGroupName = resourceGroupName;
	}

	
}
