package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 节点简略信息类
 * 
 * @author 袁涛
 * @version 1.0
 */
@XmlRootElement(name = "Node")
@XmlType(propOrder = { "name", "state", "coresNum", "cpuFrequency", "cpuLoad",
		"cpuIdlePercent", "cpuUserPercent", "cpuSystemPercent",
		"totalMemorySize", "freeMemorySize", "totalDiskSize", "freeDiskSize",
		"runningSoftwareName" })
public class NodeBriefInformation {
	/**
	 * 节点名称
	 */
	private String name;
	/**
	 * 节点状态
	 */
	private String state;
	/**
	 * 处理器核数
	 */
	private Integer coresNum;
	/**
	 * 处理器主频
	 */
	private Float cpuFrequency;
	/**
	 * 处理器负载
	 */
	private Float cpuLoad;
	/**
	 * 处理器空闲百分比
	 */
	private Float cpuIdlePercent;
	/**
	 * 处理器用户占用百分比
	 */
	private Float cpuUserPercent;
	/**
	 * 处理器系统占用百分比
	 */
	private Float cpuSystemPercent;
	/**
	 * 节点总内存大小
	 */
	private Integer totalMemorySize;
	/**
	 * 节点空闲内存大小
	 */
	private Integer freeMemorySize;
	/**
	 * 节点总磁盘大小
	 */
	private Float totalDiskSize;
	/**
	 * 节点空闲磁盘大小
	 */
	private Float freeDiskSize;
	/**
	 * 节点正在运行作业所使用的软件名称
	 */
	private String runningSoftwareName;

	/**
	 * 获取节点名称
	 * 
	 * @return 节点名称
	 */
	@XmlElement(name = "NodeName")
	public String getName() {
		return name;
	}

	/**
	 * 设置节点名称
	 * 
	 * @param name
	 *            节点名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取节点状态
	 * 
	 * @return 节点状态
	 */
	@XmlElement(name = "State")
	public String getState() {
		return state;
	}

	/**
	 * 设置节点状态
	 * 
	 * @param state
	 *            节点状态
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 获取处理器核数
	 * 
	 * @return 处理器核数
	 */
	@XmlElement(name = "NumberOfCores")
	public Integer getCoresNum() {
		return coresNum;
	}

	/**
	 * 设置处理器核数
	 * 
	 * @param coresNum
	 *            处理器核数
	 */
	public void setCoresNum(Integer coresNum) {
		this.coresNum = coresNum;
	}

	/**
	 * 获取处理器主频
	 * 
	 * @return 处理器主频
	 */
	@XmlElement(name = "CpuFrequency")
	public Float getCpuFrequency() {
		return cpuFrequency;
	}

	/**
	 * 设置处理器主频
	 * 
	 * @param cpuFrequency
	 *            处理器主频
	 */
	public void setCpuFrequency(Float cpuFrequency) {
		this.cpuFrequency = cpuFrequency;
	}

	/**
	 * 获取处理器负载
	 * 
	 * @return 处理器负载
	 */
	@XmlElement(name = "CpuLoad")
	public Float getCpuLoad() {
		return cpuLoad;
	}

	/**
	 * 设置处理器负载
	 * 
	 * @param cpuLoad
	 *            处理器负载
	 */
	public void setCpuLoad(Float cpuLoad) {
		this.cpuLoad = cpuLoad;
	}

	/**
	 * 获取处理器空闲百分比
	 * 
	 * @return 处理器空闲百分比
	 */
	@XmlElement(name = "CpuIdle")
	public Float getCpuIdlePercent() {
		return cpuIdlePercent;
	}

	/**
	 * 设置处理器空闲百分比
	 * 
	 * @param cpuIdlePercent
	 *            处理器空闲百分比
	 */
	public void setCpuIdlePercent(Float cpuIdlePercent) {
		this.cpuIdlePercent = cpuIdlePercent;
	}

	/**
	 * 获取处理器用户占用百分比
	 * 
	 * @return 处理器用户占用百分比
	 */
	@XmlElement(name = "CpuUser")
	public Float getCpuUserPercent() {
		return cpuUserPercent;
	}

	/**
	 * 设置处理器用户占用百分比
	 * 
	 * @param cpuUserPercent
	 *            处理器用户占用百分比
	 */
	public void setCpuUserPercent(Float cpuUserPercent) {
		this.cpuUserPercent = cpuUserPercent;
	}

	/**
	 * 获取处理器系统占用百分比
	 * 
	 * @return 处理器系统占用百分比
	 */
	@XmlElement(name = "CpuSystem")
	public Float getCpuSystemPercent() {
		return cpuSystemPercent;
	}

	/**
	 * 设置处理器系统占用百分比
	 * 
	 * @param cpuSystemPercent
	 *            处理器系统占用百分比
	 */
	public void setCpuSystemPercent(Float cpuSystemPercent) {
		this.cpuSystemPercent = cpuSystemPercent;
	}

	/**
	 * 获取节点总内存大小
	 * 
	 * @return 节点总内存大小
	 */
	@XmlElement(name = "PhysicalMemory")
	public Integer getTotalMemorySize() {
		return totalMemorySize;
	}

	/**
	 * 设置节点总内存大小
	 * 
	 * @param totalMemorySize
	 *            节点总内存大小
	 */
	public void setTotalMemorySize(Integer totalMemorySize) {
		this.totalMemorySize = totalMemorySize;
	}

	/**
	 * 获取节点空闲内存大小
	 * 
	 * @return 节点空闲内存大小
	 */
	@XmlElement(name = "AvailableMemory")
	public Integer getFreeMemorySize() {
		return freeMemorySize;
	}

	/**
	 * 设置节点空闲内存大小
	 * 
	 * @param freeMemorySize
	 *            节点空闲内存大小
	 */
	public void setFreeMemorySize(Integer freeMemorySize) {
		this.freeMemorySize = freeMemorySize;
	}

	/**
	 * 获取节点总磁盘大小
	 * 
	 * @return 节点总磁盘大小
	 */
	@XmlElement(name = "TotalDisk")
	public Float getTotalDiskSize() {
		return totalDiskSize;
	}

	/**
	 * 设置节点总磁盘大小
	 * 
	 * @param totalDiskSize
	 *            节点总磁盘大小
	 */
	public void setTotalDiskSize(Float totalDiskSize) {
		this.totalDiskSize = totalDiskSize;
	}

	/**
	 * 获取节点空闲磁盘大小
	 * 
	 * @return 节点空闲磁盘大小
	 */
	@XmlElement(name = "FreeDisk")
	public Float getFreeDiskSize() {
		return freeDiskSize;
	}

	/**
	 * 设置节点空闲磁盘大小
	 * 
	 * @param freeDiskSize
	 *            节点空闲磁盘大小
	 */
	public void setFreeDiskSize(Float freeDiskSize) {
		this.freeDiskSize = freeDiskSize;
	}

	/**
	 * 获取节点正在运行作业所使用的软件名称
	 * 
	 * @return 软件名称
	 */
	@XmlElement(name = "RunningSoftware")
	public String getRunningSoftwareName() {
		return runningSoftwareName;
	}

	/**
	 * 设置节点正在运行作业所使用的软件名称
	 * 
	 * @param runningSoftwareName
	 *            软件名称
	 */
	public void setRunningSoftwareName(String runningSoftwareName) {
		this.runningSoftwareName = runningSoftwareName;
	}
}
