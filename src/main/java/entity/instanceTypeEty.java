package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class instanceTypeEty {
	private int MemorySize;
	private int InstancePpsTx;
	private int MaximumQueueNumberPerEni;
	private int EniIpv6AddressQuantity;
	private int PrimaryEniQueueNumber;
	private int CpuCoreCount;
	private int TotalEniQueueQuantity;
	private int EniTotalQuantity;
	private boolean EniTrunkSupported;
	private String InstanceTypeFamily;
	private int InstancePpsRx;
	private int EniQuantity;
	private int InstanceBandwidthRx;
	private int GPUAmount;
	private int InstanceBandwidthTx;
	private int SecondaryEniQueueNumber;
	private int DiskQuantity;
	private String LocalStorageCategory;
	private String GPUSpec;
	private String InstanceFamilyLevel;
	private String InstanceTypeId;
	private int EniPrivateIpAddressQuantity;
	
	public instanceTypeEty() {
		super();
	}

	public int getMemorySize() {
		return MemorySize;
	}

	public void setMemorySize(int memorySize) {
		MemorySize = memorySize;
	}

	public int getInstancePpsTx() {
		return InstancePpsTx;
	}

	public void setInstancePpsTx(int instancePpsTx) {
		InstancePpsTx = instancePpsTx;
	}

	public int getMaximumQueueNumberPerEni() {
		return MaximumQueueNumberPerEni;
	}

	public void setMaximumQueueNumberPerEni(int maximumQueueNumberPerEni) {
		MaximumQueueNumberPerEni = maximumQueueNumberPerEni;
	}

	public int getEniIpv6AddressQuantity() {
		return EniIpv6AddressQuantity;
	}

	public void setEniIpv6AddressQuantity(int eniIpv6AddressQuantity) {
		EniIpv6AddressQuantity = eniIpv6AddressQuantity;
	}

	public int getPrimaryEniQueueNumber() {
		return PrimaryEniQueueNumber;
	}

	public void setPrimaryEniQueueNumber(int primaryEniQueueNumber) {
		PrimaryEniQueueNumber = primaryEniQueueNumber;
	}

	public int getCpuCoreCount() {
		return CpuCoreCount;
	}

	public void setCpuCoreCount(int cpuCoreCount) {
		CpuCoreCount = cpuCoreCount;
	}

	public int getTotalEniQueueQuantity() {
		return TotalEniQueueQuantity;
	}

	public void setTotalEniQueueQuantity(int totalEniQueueQuantity) {
		TotalEniQueueQuantity = totalEniQueueQuantity;
	}

	public int getEniTotalQuantity() {
		return EniTotalQuantity;
	}

	public void setEniTotalQuantity(int eniTotalQuantity) {
		EniTotalQuantity = eniTotalQuantity;
	}

	public boolean isEniTrunkSupported() {
		return EniTrunkSupported;
	}

	public void setEniTrunkSupported(boolean eniTrunkSupported) {
		EniTrunkSupported = eniTrunkSupported;
	}

	public String getInstanceTypeFamily() {
		return InstanceTypeFamily;
	}

	public void setInstanceTypeFamily(String instanceTypeFamily) {
		InstanceTypeFamily = instanceTypeFamily;
	}

	public int getInstancePpsRx() {
		return InstancePpsRx;
	}

	public void setInstancePpsRx(int instancePpsRx) {
		InstancePpsRx = instancePpsRx;
	}

	public int getEniQuantity() {
		return EniQuantity;
	}

	public void setEniQuantity(int eniQuantity) {
		EniQuantity = eniQuantity;
	}

	public int getInstanceBandwidthRx() {
		return InstanceBandwidthRx;
	}

	public void setInstanceBandwidthRx(int instanceBandwidthRx) {
		InstanceBandwidthRx = instanceBandwidthRx;
	}

	public int getGPUAmount() {
		return GPUAmount;
	}

	public void setGPUAmount(int gPUAmount) {
		GPUAmount = gPUAmount;
	}

	public int getInstanceBandwidthTx() {
		return InstanceBandwidthTx;
	}

	public void setInstanceBandwidthTx(int instanceBandwidthTx) {
		InstanceBandwidthTx = instanceBandwidthTx;
	}

	public int getSecondaryEniQueueNumber() {
		return SecondaryEniQueueNumber;
	}

	public void setSecondaryEniQueueNumber(int secondaryEniQueueNumber) {
		SecondaryEniQueueNumber = secondaryEniQueueNumber;
	}

	public int getDiskQuantity() {
		return DiskQuantity;
	}

	public void setDiskQuantity(int diskQuantity) {
		DiskQuantity = diskQuantity;
	}

	public String getLocalStorageCategory() {
		return LocalStorageCategory;
	}

	public void setLocalStorageCategory(String localStorageCategory) {
		LocalStorageCategory = localStorageCategory;
	}

	public String getGPUSpec() {
		return GPUSpec;
	}

	public void setGPUSpec(String gPUSpec) {
		GPUSpec = gPUSpec;
	}

	public String getInstanceFamilyLevel() {
		return InstanceFamilyLevel;
	}

	public void setInstanceFamilyLevel(String instanceFamilyLevel) {
		InstanceFamilyLevel = instanceFamilyLevel;
	}

	public String getInstanceTypeId() {
		return InstanceTypeId;
	}

	public void setInstanceTypeId(String instanceTypeId) {
		InstanceTypeId = instanceTypeId;
	}

	public int getEniPrivateIpAddressQuantity() {
		return EniPrivateIpAddressQuantity;
	}

	public void setEniPrivateIpAddressQuantity(int eniPrivateIpAddressQuantity) {
		EniPrivateIpAddressQuantity = eniPrivateIpAddressQuantity;
	}
	
	
	
}
