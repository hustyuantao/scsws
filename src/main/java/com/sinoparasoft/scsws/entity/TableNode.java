package com.sinoparasoft.scsws.entity;

import java.sql.Timestamp;

/**
 * 数据库表node的实体类
 * 
 * @author 袁涛
 */
public class TableNode {
	/**
	 * 节点状态常量
	 */
	public static final String STAT_ONLINE = "Online";
	public static final String STAT_OFFLINE = "Offline";
	public static final String STAT_DOWN = "Down";
	/**
	 * 主机名称
	 */
	private String name;
	/**
	 * 主机状态
	 */
	private String status;
	/**
	 * 主机操作系统名称
	 */
	private String osName;
	/**
	 * 主机处理器核数
	 */
	private Integer coresNum;
	/**
	 * 主机CPU频率
	 */
	private Float cpuFrequency;
	/**
	 * 主机CPU负载
	 */
	private Float cpuLoad;
	/**
	 * 主机CPU空闲百分比
	 */
	private Float cpuIdlePercent;
	/**
	 * 主机CPU用户百分比
	 */
	private Float cpuUserPercent;
	/**
	 * 主机CPU系统百分比
	 */
	private Float cpuSystemPercent;
	/**
	 * 主机物理内存大小
	 */
	private Integer totalMemorySize;
	/**
	 * 主机空闲内存大小
	 */
	private Integer freeMemorySize;
	/**
	 * 主机物理磁盘大小
	 */
	private Float totalDiskSize;
	/**
	 * 主机空闲磁盘大小
	 */
	private Float freeDiskSize;
	/**
	 * 网络下载流量
	 */
	private Float inBytes;
	/**
	 * 网络上传流量
	 */
	private Float outBytes;
	/**
	 * 软件名称
	 */
	private String softwareName;
	/**
	 * 主机信息更新时间
	 */
	private Timestamp modifiedTime;

	/**
	 * 获取主机名称
	 * 
	 * @return 主机名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置主机名称
	 * 
	 * @param name
	 *            主机名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取主机状态
	 * 
	 * @return 主机状态
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 设置主机状态
	 * 
	 * @param status
	 *            主机状态
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 获取主机操作系统名称
	 * 
	 * @return 主机操作系统名称
	 */
	public String getOsName() {
		return osName;
	}

	/**
	 * 设置主机操作系统名称
	 * 
	 * @param osName
	 *            主机操作系统名称
	 */
	public void setOsName(String osName) {
		this.osName = osName;
	}

	/**
	 * 获取主机处理器核数
	 * 
	 * @return 主机处理器核数
	 */
	public Integer getCoresNum() {
		return coresNum;
	}

	/**
	 * 设置主机处理器核数
	 * 
	 * @param coresNum
	 *            主机处理器核数
	 */
	public void setCoresNum(Integer coresNum) {
		this.coresNum = coresNum;
	}

	/**
	 * 获取主机CPU频率
	 * 
	 * @return 主机CPU频率
	 */
	public Float getCpuFrequency() {
		return cpuFrequency;
	}

	/**
	 * 设置主机CPU频率
	 * 
	 * @param cpuFrequency
	 *            主机CPU频率
	 */
	public void setCpuFrequency(Float cpuFrequency) {
		this.cpuFrequency = cpuFrequency;
	}

	/**
	 * 获取主机CPU负载
	 * 
	 * @return 主机CPU负载
	 */
	public Float getCpuLoad() {
		return cpuLoad;
	}

	/**
	 * 设置主机CPU负载
	 * 
	 * @param cpuLoad
	 *            主机CPU负载
	 */
	public void setCpuLoad(Float cpuLoad) {
		this.cpuLoad = cpuLoad;
	}

	/**
	 * 获取主机CPU空闲百分比
	 * 
	 * @return 主机CPU空闲百分比
	 */
	public Float getCpuIdlePercent() {
		return cpuIdlePercent;
	}

	/**
	 * 设置主机CPU空闲百分比
	 * 
	 * @param cpuIdlePercent
	 *            主机CPU空闲百分比
	 */
	public void setCpuIdlePercent(Float cpuIdlePercent) {
		this.cpuIdlePercent = cpuIdlePercent;
	}

	/**
	 * 获取主机CPU用户百分比
	 * 
	 * @return 主机CPU用户百分比
	 */
	public Float getCpuUserPercent() {
		return cpuUserPercent;
	}

	/**
	 * 设置主机CPU用户百分比
	 * 
	 * @param cpuUserPercent
	 *            主机CPU用户百分比
	 */
	public void setCpuUserPercent(Float cpuUserPercent) {
		this.cpuUserPercent = cpuUserPercent;
	}

	/**
	 * 获取主机CPU系统百分比
	 * 
	 * @return 主机CPU系统百分比
	 */
	public Float getCpuSystemPercent() {
		return cpuSystemPercent;
	}

	/**
	 * 设置主机CPU系统百分比
	 * 
	 * @param cpuSystemPercent
	 *            主机CPU系统百分比
	 */
	public void setCpuSystemPercent(Float cpuSystemPercent) {
		this.cpuSystemPercent = cpuSystemPercent;
	}

	/**
	 * 获取主机物理内存大小
	 * 
	 * @return 主机物理内存大小
	 */
	public Integer getTotalMemorySize() {
		return totalMemorySize;
	}

	/**
	 * 设置主机物理内存大小
	 * 
	 * @param totalMemorySize
	 *            主机物理内存大小
	 */
	public void setTotalMemorySize(Integer totalMemorySize) {
		this.totalMemorySize = totalMemorySize;
	}

	/**
	 * 获取主机空闲内存大小
	 * 
	 * @return 主机空闲内存大小
	 */
	public Integer getFreeMemorySize() {
		return freeMemorySize;
	}

	/**
	 * 设置主机空闲内存大小
	 * 
	 * @param freeMemorySize
	 *            主机空闲内存大小
	 */
	public void setFreeMemorySize(Integer freeMemorySize) {
		this.freeMemorySize = freeMemorySize;
	}

	/**
	 * 获取主机物理磁盘大小
	 * 
	 * @return 主机物理磁盘大小
	 */
	public Float getTotalDiskSize() {
		return totalDiskSize;
	}

	/**
	 * 设置主机物理磁盘大小
	 * 
	 * @param totalDiskSize
	 *            主机物理磁盘大小
	 */
	public void setTotalDiskSize(Float totalDiskSize) {
		this.totalDiskSize = totalDiskSize;
	}

	/**
	 * 获取主机空闲磁盘大小
	 * 
	 * @return 主机空闲磁盘大小
	 */
	public Float getFreeDiskSize() {
		return freeDiskSize;
	}

	/**
	 * 设置主机空闲磁盘大小
	 * 
	 * @param freeDiskSize
	 *            主机空闲磁盘大小
	 */
	public void setFreeDiskSize(Float freeDiskSize) {
		this.freeDiskSize = freeDiskSize;
	}

	/**
	 * 获取网络下载流量
	 * 
	 * @return 网络下载流量
	 */
	public Float getInBytes() {
		return inBytes;
	}

	/**
	 * 设置网络下载流量
	 * 
	 * @param inBytes
	 *            网络下载流量
	 */
	public void setInBytes(Float inBytes) {
		this.inBytes = inBytes;
	}

	/**
	 * 获取网络上传流量
	 * 
	 * @return 网络上传流量
	 */
	public Float getOutBytes() {
		return outBytes;
	}

	/**
	 * 设置网络上传流量
	 * 
	 * @param outBytes
	 *            网络上传流量
	 */
	public void setOutBytes(Float outBytes) {
		this.outBytes = outBytes;
	}

	/**
	 * 获取软件名称
	 * 
	 * @return 软件名称
	 */
	public String getSoftwareName() {
		return softwareName;
	}

	/**
	 * 设置软件名称
	 * 
	 * @param softwareName
	 *            软件名称
	 */
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	/**
	 * 获取主机信息更新时间
	 * 
	 * @return 主机信息更新时间
	 */
	public Timestamp getModifiedTime() {
		return modifiedTime;
	}

	/**
	 * 设置主机信息更新时间
	 * 
	 * @param modifiedTime
	 *            主机信息更新时间
	 */
	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
}
