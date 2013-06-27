package com.sinoparasoft.scsws.entity;

import java.util.Date;
import java.util.Map;

/**
 * 主机度量
 * 
 * @author 袁涛
 */
public class NodeMetric {
	/**
	 * 主机名称
	 */
	private String name;
	/**
	 * 主机IP地址
	 */
	private String ip;
	/**
	 * 主机位置
	 */
	private String location;
	/**
	 * 报告时间
	 */
	private Date reportedTime;
	/**
	 * 主机GMOND开始时间
	 */
	private Date gmondStartedTime;

	/**
	 * 操作系统发布版本
	 */
	private String osRelease;
	/**
	 * 操作系统名称
	 */
	private String osName;
	/**
	 * 最后一次系统启动时间
	 */
	private Date lastBootTime;
	/**
	 * 主机系统架构
	 */
	private String machineType;

	/**
	 * 一分钟内平均负载
	 */
	private Float avgOneMinuteLoad;
	/**
	 * 五分钟内平均负载
	 */
	private Float avgFiveMinuteLoad;
	/**
	 * 十五分钟内平均负载
	 */
	private Float avgFifteenMinuteLoad;

	/**
	 * 总内存大小，单位：KB
	 */
	private Float totalMemorySize;
	/**
	 * 空闲内存大小
	 */
	private Float freeMemorySize;
	/**
	 * cached内存大小
	 */
	private Float cachedMemorySize;
	/**
	 * buffered内存大小
	 */
	private Float bufferedMemorySize;
	/**
	 * 共享内存大小
	 */
	private Float sharedMemorySize;
	/**
	 * 交换分区总大小，单位： KB
	 */
	private Float totalSwapSize;
	/**
	 * 可用交换分区大小，单位：KB
	 */
	private Float freeSwapSize;

	/**
	 * 总进程数
	 */
	private Integer totalProcessesNum;
	/**
	 * 正在运行进程总数
	 */
	private Integer runningProcessesNum;

	/**
	 * 系统Gexec状态
	 */
	private Boolean gexecAvailable;

	/**
	 * 硬盘空间总大小
	 */
	private Float totalDiskSize;
	/**
	 * 硬盘空闲空间大小
	 */
	private Float freeDiskSize;
	/**
	 * 硬盘所有分区最大使用百分比
	 */
	private Float maxUsedDiskSpacePercent;
	/**
	 * 硬盘分区使用百分比
	 */
	private Map<String, Float> usedDiskMap;
	/**
	 * 硬盘分区空闲百分比
	 */
	private Map<String, Float> totalDiskMap;

	/**
	 * CPU空闲百分比
	 */
	private Float cpuIdlePercent;
	/**
	 * CPU Nice百分比
	 */
	private Float cpuNicePercent;
	/**
	 * CPU用户百分比
	 */
	private Float cpuUserPercent;
	/**
	 * CPU Aidle百分比
	 */
	private Float cpuAidlePercent;
	/**
	 * CPU系统百分比
	 */
	private Float cpuSystemPercent;
	/**
	 * CPU Wio百分比
	 */
	private Float cpuWioPercent;
	/**
	 * CPU个数
	 */
	private Integer cpuNum;
	/**
	 * CPU频率，单位：MHz
	 */
	private Integer cpuFrequency;

	/**
	 * TCP连结建立总数
	 */
	private Integer establishedTcpConnectionsNum;
	/**
	 * TCP连结监听总数
	 */
	private Integer listeningTcpConnectionsNum;
	/**
	 * TCP连接阻塞等待总数
	 */
	private Integer syncWaitTcpConnectionsNum;
	/**
	 * TCP连接阻塞发送总数
	 */
	private Integer syncSentTcpConnectionsNum;
	/**
	 * TCP连接阻塞接收总数
	 */
	private Integer syncRecvTcpConnectionsNum;
	/**
	 * TCP连接last_ack总数
	 */
	private Integer lastAckTcpConnectionsNum;
	/**
	 * TCP连接fin_wait1总数
	 */
	private Integer finWait1TcpConnectionsNum;
	/**
	 * TCP连接time_wait总数
	 */
	private Integer timeWaitTcpConnectionsNum;
	/**
	 * TCP连接fin_wait2总数
	 */
	private Integer finWait2TcpConnectionsNum;
	/**
	 * TCP连接close_wait总数
	 */
	private Integer closeWaitTcpConnectionsNum;
	/**
	 * TCP连接正在关闭总数
	 */
	private Integer closingTcpConnectionsNum;
	/**
	 * TCP连接已关闭总数
	 */
	private Integer closedTcpConnectionsNum;
	/**
	 * TCP连接未知状态总数
	 */
	private Integer unknownTcpConnectionsNum;
	/**
	 * 每秒接收数据包数
	 */
	private Float receivedPacketsPerSecond;
	/**
	 * 每秒发送数据包数
	 */
	private Float sentPacketsPerSecond;
	/**
	 * 每秒接收字节数
	 */
	private Float receivedBytesPerSecond;
	/**
	 * 每秒发送字节数
	 */
	private Float sentBytesPerSecond;

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
	 * 获取主机IP地址
	 * 
	 * @return 主机IP地址
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * 设置主机IP地址
	 * 
	 * @param ip
	 *            主机IP地址
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * 获取主机位置
	 * 
	 * @return 主机位置
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * 设置主机位置
	 * 
	 * @param location
	 *            主机位置
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * 获取报告时间
	 * 
	 * @return 报告时间
	 */
	public Date getReportedTime() {
		return reportedTime;
	}

	/**
	 * 设置报告时间
	 * 
	 * @param reportedTime
	 *            报告时间
	 */
	public void setReportedTime(Date reportedTime) {
		this.reportedTime = reportedTime;
	}

	/**
	 * 获取主机GMOND开始时间
	 * 
	 * @return 主机GMOND开始时间
	 */
	public Date getGmondStartedTime() {
		return gmondStartedTime;
	}

	/**
	 * 设置主机GMOND开始时间
	 * 
	 * @param gmondStartedTime
	 *            主机GMOND开始时间
	 */
	public void setGmondStartedTime(Date gmondStartedTime) {
		this.gmondStartedTime = gmondStartedTime;
	}

	/**
	 * 获取操作系统发布版本
	 * 
	 * @return 操作系统发布版本
	 */
	public String getOsRelease() {
		return osRelease;
	}

	/**
	 * 设置操作系统发布版本
	 * 
	 * @param osRelease
	 *            操作系统发布版本
	 */
	public void setOsRelease(String osRelease) {
		this.osRelease = osRelease;
	}

	/**
	 * 获取操作系统名称
	 * 
	 * @return 操作系统名称
	 */
	public String getOsName() {
		return osName;
	}

	/**
	 * 设置操作系统名称
	 * 
	 * @param osName
	 *            操作系统名称
	 */
	public void setOsName(String osName) {
		this.osName = osName;
	}

	/**
	 * 获取最后一次系统启动时间
	 * 
	 * @return 最后一次系统启动时间
	 */
	public Date getLastBootTime() {
		return lastBootTime;
	}

	/**
	 * 设置最后一次系统启动时间
	 * 
	 * @param lastBootTime
	 *            最后一次系统启动时间
	 */
	public void setLastBootTime(Date lastBootTime) {
		this.lastBootTime = lastBootTime;
	}

	/**
	 * 获取主机系统架构
	 * 
	 * @return 主机系统架构
	 */
	public String getMachineType() {
		return machineType;
	}

	/**
	 * 设置主机系统架构
	 * 
	 * @param machineType
	 *            主机系统架构
	 */
	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

	/**
	 * 获取一分钟内平均负载
	 * 
	 * @return 一分钟内平均负载
	 */
	public Float getAvgOneMinuteLoad() {
		return avgOneMinuteLoad;
	}

	/**
	 * 设置一分钟内平均负载
	 * 
	 * @param avgOneMinuteLoad
	 *            一分钟内平均负载
	 */
	public void setAvgOneMinuteLoad(Float avgOneMinuteLoad) {
		this.avgOneMinuteLoad = avgOneMinuteLoad;
	}

	/**
	 * 获取五分钟内平均负载
	 * 
	 * @return 五分钟内平均负载
	 */
	public Float getAvgFiveMinuteLoad() {
		return avgFiveMinuteLoad;
	}

	/**
	 * 设置五分钟内平均负载
	 * 
	 * @param avgFiveMinuteLoad
	 *            五分钟内平均负载
	 */
	public void setAvgFiveMinuteLoad(Float avgFiveMinuteLoad) {
		this.avgFiveMinuteLoad = avgFiveMinuteLoad;
	}

	/**
	 * 获取十五分钟内平均负载
	 * 
	 * @return 十五分钟内平均负载
	 */
	public Float getAvgFifteenMinuteLoad() {
		return avgFifteenMinuteLoad;
	}

	/**
	 * 设置十五分钟内平均负载
	 * 
	 * @param avgFifteenMinuteLoad
	 *            十五分钟内平均负载
	 */
	public void setAvgFifteenMinuteLoad(Float avgFifteenMinuteLoad) {
		this.avgFifteenMinuteLoad = avgFifteenMinuteLoad;
	}

	/**
	 * 获取总内存大小，单位：KB
	 * 
	 * @return 总内存大小，单位：KB
	 */
	public Float getTotalMemorySize() {
		return totalMemorySize;
	}

	/**
	 * 设置总内存大小，单位：KB
	 * 
	 * @param totalMemorySize
	 *            总内存大小，单位：KB
	 */
	public void setTotalMemorySize(Float totalMemorySize) {
		this.totalMemorySize = totalMemorySize;
	}

	/**
	 * 获取空闲内存大小
	 * 
	 * @return 空闲内存大小
	 */
	public Float getFreeMemorySize() {
		return freeMemorySize;
	}

	/**
	 * 设置空闲内存大小
	 * 
	 * @param freeMemorySize
	 *            空闲内存大小
	 */
	public void setFreeMemorySize(Float freeMemorySize) {
		this.freeMemorySize = freeMemorySize;
	}

	/**
	 * 获取cached内存大小
	 * 
	 * @return cached内存大小
	 */
	public Float getCachedMemorySize() {
		return cachedMemorySize;
	}

	/**
	 * 设置cached内存大小
	 * 
	 * @param cachedMemorySize
	 *            cached内存大小
	 */
	public void setCachedMemorySize(Float cachedMemorySize) {
		this.cachedMemorySize = cachedMemorySize;
	}

	/**
	 * 获取buffered内存大小
	 * 
	 * @return buffered内存大小
	 */
	public Float getBufferedMemorySize() {
		return bufferedMemorySize;
	}

	/**
	 * 设置buffered内存大小
	 * 
	 * @param bufferedMemorySize
	 *            buffered内存大小
	 */
	public void setBufferedMemorySize(Float bufferedMemorySize) {
		this.bufferedMemorySize = bufferedMemorySize;
	}

	/**
	 * 获取共享内存大小
	 * 
	 * @return 共享内存大小
	 */
	public Float getSharedMemorySize() {
		return sharedMemorySize;
	}

	/**
	 * 设置共享内存大小
	 * 
	 * @param sharedMemorySize
	 *            共享内存大小
	 */
	public void setSharedMemorySize(Float sharedMemorySize) {
		this.sharedMemorySize = sharedMemorySize;
	}

	/**
	 * 获取交换分区总大小，单位： KB
	 * 
	 * @return 交换分区总大小，单位： KB
	 */
	public Float getTotalSwapSize() {
		return totalSwapSize;
	}

	/**
	 * 设置交换分区总大小，单位： KB
	 * 
	 * @param totalSwapSize
	 *            交换分区总大小，单位： KB
	 */
	public void setTotalSwapSize(Float totalSwapSize) {
		this.totalSwapSize = totalSwapSize;
	}

	/**
	 * 获取可用交换分区大小，单位：KB
	 * 
	 * @return 可用交换分区大小，单位：KB
	 */
	public Float getFreeSwapSize() {
		return freeSwapSize;
	}

	/**
	 * 设置可用交换分区大小，单位：KB
	 * 
	 * @param freeSwapSize
	 *            可用交换分区大小，单位：KB
	 */
	public void setFreeSwapSize(Float freeSwapSize) {
		this.freeSwapSize = freeSwapSize;
	}

	/**
	 * 获取总进程数
	 * 
	 * @return 总进程数
	 */
	public Integer getTotalProcessesNum() {
		return totalProcessesNum;
	}

	/**
	 * 设置总进程数
	 * 
	 * @param totalProcessesNum
	 *            总进程数
	 */
	public void setTotalProcessesNum(Integer totalProcessesNum) {
		this.totalProcessesNum = totalProcessesNum;
	}

	/**
	 * 获取正在运行进程总数
	 * 
	 * @return 正在运行进程总数
	 */
	public Integer getRunningProcessesNum() {
		return runningProcessesNum;
	}

	/**
	 * 设置正在运行进程总数
	 * 
	 * @param runningProcessesNum
	 *            正在运行进程总数
	 */
	public void setRunningProcessesNum(Integer runningProcessesNum) {
		this.runningProcessesNum = runningProcessesNum;
	}

	/**
	 * 获取系统Gexec状态
	 * 
	 * @return 系统Gexec状态
	 */
	public Boolean getGexecAvailable() {
		return gexecAvailable;
	}

	/**
	 * 设置系统Gexec状态
	 * 
	 * @param gexecAvailable
	 *            系统Gexec状态
	 */
	public void setGexecAvailable(Boolean gexecAvailable) {
		this.gexecAvailable = gexecAvailable;
	}

	/**
	 * 获取硬盘空间总大小
	 * 
	 * @return 硬盘空间总大小
	 */
	public Float getTotalDiskSize() {
		return totalDiskSize;
	}

	/**
	 * 设置硬盘空间总大小
	 * 
	 * @param totalDiskSize
	 *            硬盘空间总大小
	 */
	public void setTotalDiskSize(Float totalDiskSize) {
		this.totalDiskSize = totalDiskSize;
	}

	/**
	 * 获取硬盘空闲空间大小
	 * 
	 * @return 硬盘空闲空间大小
	 */
	public Float getFreeDiskSize() {
		return freeDiskSize;
	}

	/**
	 * 设置硬盘空闲空间大小
	 * 
	 * @param freeDiskSize
	 *            硬盘空闲空间大小
	 */
	public void setFreeDiskSize(Float freeDiskSize) {
		this.freeDiskSize = freeDiskSize;
	}

	/**
	 * 获取硬盘所有分区最大使用百分比
	 * 
	 * @return 硬盘所有分区最大使用百分比
	 */
	public Float getMaxUsedDiskSpacePercent() {
		return maxUsedDiskSpacePercent;
	}

	/**
	 * 设置硬盘所有分区最大使用百分比
	 * 
	 * @param maxUsedDiskSpacePercent
	 *            硬盘所有分区最大使用百分比
	 */
	public void setMaxUsedDiskSpacePercent(Float maxUsedDiskSpacePercent) {
		this.maxUsedDiskSpacePercent = maxUsedDiskSpacePercent;
	}

	/**
	 * 获取硬盘分区使用百分比
	 * 
	 * @return 硬盘分区使用百分比
	 */
	public Map<String, Float> getUsedDiskMap() {
		return usedDiskMap;
	}

	/**
	 * 设置硬盘分区使用百分比
	 * 
	 * @param usedDiskMap
	 *            硬盘分区使用百分比
	 */
	public void setUsedDiskMap(Map<String, Float> usedDiskMap) {
		this.usedDiskMap = usedDiskMap;
	}

	/**
	 * 获取硬盘分区空闲百分比
	 * 
	 * @return 硬盘分区空闲百分比
	 */
	public Map<String, Float> getTotalDiskMap() {
		return totalDiskMap;
	}

	/**
	 * 设置硬盘分区空闲百分比
	 * 
	 * @param totalDiskMap
	 *            硬盘分区空闲百分比
	 */
	public void setTotalDiskMap(Map<String, Float> totalDiskMap) {
		this.totalDiskMap = totalDiskMap;
	}

	/**
	 * 获取CPU空闲百分比
	 * 
	 * @return CPU空闲百分比
	 */
	public Float getCpuIdlePercent() {
		return cpuIdlePercent;
	}

	/**
	 * 设置CPU空闲百分比
	 * 
	 * @param cpuIdlePercent
	 *            CPU空闲百分比
	 */
	public void setCpuIdlePercent(Float cpuIdlePercent) {
		this.cpuIdlePercent = cpuIdlePercent;
	}

	/**
	 * 获取CPU Nice百分比
	 * 
	 * @return CPU Nice百分比
	 */
	public Float getCpuNicePercent() {
		return cpuNicePercent;
	}

	/**
	 * 设置CPU Nice百分比
	 * 
	 * @param cpuNicePercent
	 *            CPU Nice百分比
	 */
	public void setCpuNicePercent(Float cpuNicePercent) {
		this.cpuNicePercent = cpuNicePercent;
	}

	/**
	 * 获取CPU用户百分比
	 * 
	 * @return CPU用户百分比
	 */
	public Float getCpuUserPercent() {
		return cpuUserPercent;
	}

	/**
	 * 设置CPU用户百分比
	 * 
	 * @param cpuUserPercent
	 *            CPU用户百分比
	 */
	public void setCpuUserPercent(Float cpuUserPercent) {
		this.cpuUserPercent = cpuUserPercent;
	}

	/**
	 * 获取CPU Aidle百分比
	 * 
	 * @return CPU Aidle百分比
	 */
	public Float getCpuAidlePercent() {
		return cpuAidlePercent;
	}

	/**
	 * 设置CPU Aidle百分比
	 * 
	 * @param cpuAidlePercent
	 *            CPU Aidle百分比
	 */
	public void setCpuAidlePercent(Float cpuAidlePercent) {
		this.cpuAidlePercent = cpuAidlePercent;
	}

	/**
	 * 获取CPU系统百分比
	 * 
	 * @return CPU系统百分比
	 */
	public Float getCpuSystemPercent() {
		return cpuSystemPercent;
	}

	/**
	 * 设置CPU系统百分比
	 * 
	 * @param cpuSystemPercent
	 *            CPU系统百分比
	 */
	public void setCpuSystemPercent(Float cpuSystemPercent) {
		this.cpuSystemPercent = cpuSystemPercent;
	}

	/**
	 * 获取CPU Wio百分比
	 * 
	 * @return CPU Wio百分比
	 */
	public Float getCpuWioPercent() {
		return cpuWioPercent;
	}

	/**
	 * 设置CPU Wio百分比
	 * 
	 * @param cpuWioPercent
	 *            CPU Wio百分比
	 */
	public void setCpuWioPercent(Float cpuWioPercent) {
		this.cpuWioPercent = cpuWioPercent;
	}

	/**
	 * 获取CPU个数
	 * 
	 * @return CPU个数
	 */
	public Integer getCpuNum() {
		return cpuNum;
	}

	/**
	 * 设置CPU个数
	 * 
	 * @param cpuNum
	 *            CPU个数
	 */
	public void setCpuNum(Integer cpuNum) {
		this.cpuNum = cpuNum;
	}

	/**
	 * 获取CPU频率，单位：MHz
	 * 
	 * @return CPU频率，单位：MHz
	 */
	public Integer getCpuFrequency() {
		return cpuFrequency;
	}

	/**
	 * 设置CPU频率，单位：MHz
	 * 
	 * @param cpuFrequency
	 *            CPU频率，单位：MHz
	 */
	public void setCpuFrequency(Integer cpuFrequency) {
		this.cpuFrequency = cpuFrequency;
	}

	/**
	 * 获取TCP连结建立总数
	 * 
	 * @return TCP连结建立总数
	 */
	public Integer getEstablishedTcpConnectionsNum() {
		return establishedTcpConnectionsNum;
	}

	/**
	 * 设置TCP连结建立总数
	 * 
	 * @param establishedTcpConnectionsNum
	 *            TCP连结建立总数
	 */
	public void setEstablishedTcpConnectionsNum(
			Integer establishedTcpConnectionsNum) {
		this.establishedTcpConnectionsNum = establishedTcpConnectionsNum;
	}

	/**
	 * 获取TCP连结监听总数
	 * 
	 * @return TCP连结监听总数
	 */
	public Integer getListeningTcpConnectionsNum() {
		return listeningTcpConnectionsNum;
	}

	/**
	 * 设置TCP连结监听总数
	 * 
	 * @param listeningTcpConnectionsNum
	 *            TCP连结监听总数
	 */
	public void setListeningTcpConnectionsNum(Integer listeningTcpConnectionsNum) {
		this.listeningTcpConnectionsNum = listeningTcpConnectionsNum;
	}

	/**
	 * 获取TCP连接阻塞等待总数
	 * 
	 * @return TCP连接阻塞等待总数
	 */
	public Integer getSyncWaitTcpConnectionsNum() {
		return syncWaitTcpConnectionsNum;
	}

	/**
	 * 设置TCP连接阻塞等待总数
	 * 
	 * @param syncWaitTcpConnectionsNum
	 *            TCP连接阻塞等待总数
	 */
	public void setSyncWaitTcpConnectionsNum(Integer syncWaitTcpConnectionsNum) {
		this.syncWaitTcpConnectionsNum = syncWaitTcpConnectionsNum;
	}

	/**
	 * 获取TCP连接阻塞发送总数
	 * 
	 * @return TCP连接阻塞发送总数
	 */
	public Integer getSyncSentTcpConnectionsNum() {
		return syncSentTcpConnectionsNum;
	}

	/**
	 * 设置TCP连接阻塞发送总数
	 * 
	 * @param syncSentTcpConnectionsNum
	 *            TCP连接阻塞发送总数
	 */
	public void setSyncSentTcpConnectionsNum(Integer syncSentTcpConnectionsNum) {
		this.syncSentTcpConnectionsNum = syncSentTcpConnectionsNum;
	}

	/**
	 * 获取TCP连接阻塞接收总数
	 * 
	 * @return TCP连接阻塞接收总数
	 */
	public Integer getSyncRecvTcpConnectionsNum() {
		return syncRecvTcpConnectionsNum;
	}

	/**
	 * 设置TCP连接阻塞接收总数
	 * 
	 * @param syncRecvTcpConnectionsNum
	 *            TCP连接阻塞接收总数
	 */
	public void setSyncRecvTcpConnectionsNum(Integer syncRecvTcpConnectionsNum) {
		this.syncRecvTcpConnectionsNum = syncRecvTcpConnectionsNum;
	}

	/**
	 * 获取TCP连接last_ack总数
	 * 
	 * @return TCP连接last_ack总数
	 */
	public Integer getLastAckTcpConnectionsNum() {
		return lastAckTcpConnectionsNum;
	}

	/**
	 * 设置TCP连接last_ack总数
	 * 
	 * @param lastAckTcpConnectionsNum
	 *            TCP连接last_ack总数
	 */
	public void setLastAckTcpConnectionsNum(Integer lastAckTcpConnectionsNum) {
		this.lastAckTcpConnectionsNum = lastAckTcpConnectionsNum;
	}

	/**
	 * 获取TCP连接fin_wait1总数
	 * 
	 * @return TCP连接fin_wait1总数
	 */
	public Integer getFinWait1TcpConnectionsNum() {
		return finWait1TcpConnectionsNum;
	}

	/**
	 * 设置TCP连接fin_wait1总数
	 * 
	 * @param finWait1TcpConnectionsNum
	 *            TCP连接fin_wait1总数
	 */
	public void setFinWait1TcpConnectionsNum(Integer finWait1TcpConnectionsNum) {
		this.finWait1TcpConnectionsNum = finWait1TcpConnectionsNum;
	}

	/**
	 * 获取TCP连接time_wait总数
	 * 
	 * @return TCP连接time_wait总数
	 */
	public Integer getTimeWaitTcpConnectionsNum() {
		return timeWaitTcpConnectionsNum;
	}

	/**
	 * 设置TCP连接time_wait总数
	 * 
	 * @param timeWaitTcpConnectionsNum
	 *            TCP连接time_wait总数
	 */
	public void setTimeWaitTcpConnectionsNum(Integer timeWaitTcpConnectionsNum) {
		this.timeWaitTcpConnectionsNum = timeWaitTcpConnectionsNum;
	}

	/**
	 * 获取TCP连接fin_wait2总数
	 * 
	 * @return TCP连接fin_wait2总数
	 */
	public Integer getFinWait2TcpConnectionsNum() {
		return finWait2TcpConnectionsNum;
	}

	/**
	 * 设置TCP连接fin_wait2总数
	 * 
	 * @param finWait2TcpConnectionsNum
	 *            TCP连接fin_wait2总数
	 */
	public void setFinWait2TcpConnectionsNum(Integer finWait2TcpConnectionsNum) {
		this.finWait2TcpConnectionsNum = finWait2TcpConnectionsNum;
	}

	/**
	 * 获取TCP连接close_wait总数
	 * 
	 * @return TCP连接close_wait总数
	 */
	public Integer getCloseWaitTcpConnectionsNum() {
		return closeWaitTcpConnectionsNum;
	}

	/**
	 * 设置TCP连接close_wait总数
	 * 
	 * @param closeWaitTcpConnectionsNum
	 *            TCP连接close_wait总数
	 */
	public void setCloseWaitTcpConnectionsNum(Integer closeWaitTcpConnectionsNum) {
		this.closeWaitTcpConnectionsNum = closeWaitTcpConnectionsNum;
	}

	/**
	 * 获取TCP连接正在关闭总数
	 * 
	 * @return TCP连接正在关闭总数
	 */
	public Integer getClosingTcpConnectionsNum() {
		return closingTcpConnectionsNum;
	}

	/**
	 * 设置TCP连接正在关闭总数
	 * 
	 * @param closingTcpConnectionsNum
	 *            TCP连接正在关闭总数
	 */
	public void setClosingTcpConnectionsNum(Integer closingTcpConnectionsNum) {
		this.closingTcpConnectionsNum = closingTcpConnectionsNum;
	}

	/**
	 * 获取TCP连接已关闭总数
	 * 
	 * @return TCP连接已关闭总数
	 */
	public Integer getClosedTcpConnectionsNum() {
		return closedTcpConnectionsNum;
	}

	/**
	 * 设置TCP连接已关闭总数
	 * 
	 * @param closedTcpConnectionsNum
	 *            TCP连接已关闭总数
	 */
	public void setClosedTcpConnectionsNum(Integer closedTcpConnectionsNum) {
		this.closedTcpConnectionsNum = closedTcpConnectionsNum;
	}

	/**
	 * 获取TCP连接未知状态总数
	 * 
	 * @return TCP连接未知状态总数
	 */
	public Integer getUnknownTcpConnectionsNum() {
		return unknownTcpConnectionsNum;
	}

	/**
	 * 设置TCP连接未知状态总数
	 * 
	 * @param unknownTcpConnectionsNum
	 *            TCP连接未知状态总数
	 */
	public void setUnknownTcpConnectionsNum(Integer unknownTcpConnectionsNum) {
		this.unknownTcpConnectionsNum = unknownTcpConnectionsNum;
	}

	/**
	 * 获取每秒接收数据包数
	 * 
	 * @return 每秒接收数据包数
	 */
	public Float getReceivedPacketsPerSecond() {
		return receivedPacketsPerSecond;
	}

	/**
	 * 设置每秒接收数据包数
	 * 
	 * @param receivedPacketsPerSecond
	 *            每秒接收数据包数
	 */
	public void setReceivedPacketsPerSecond(Float receivedPacketsPerSecond) {
		this.receivedPacketsPerSecond = receivedPacketsPerSecond;
	}

	/**
	 * 获取每秒发送数据包数
	 * 
	 * @return 每秒发送数据包数
	 */
	public Float getSentPacketsPerSecond() {
		return sentPacketsPerSecond;
	}

	/**
	 * 设置每秒发送数据包数
	 * 
	 * @param sentPacketsPerSecond
	 *            每秒发送数据包数
	 */
	public void setSentPacketsPerSecond(Float sentPacketsPerSecond) {
		this.sentPacketsPerSecond = sentPacketsPerSecond;
	}

	/**
	 * 获取每秒接收字节数
	 * 
	 * @return 每秒接收字节数
	 */
	public Float getReceivedBytesPerSecond() {
		return receivedBytesPerSecond;
	}

	/**
	 * 设置每秒接收字节数
	 * 
	 * @param receivedBytesPerSecond
	 *            每秒接收字节数
	 */
	public void setReceivedBytesPerSecond(Float receivedBytesPerSecond) {
		this.receivedBytesPerSecond = receivedBytesPerSecond;
	}

	/**
	 * 获取每秒发送字节数
	 * 
	 * @return 每秒发送字节数
	 */
	public Float getSentBytesPerSecond() {
		return sentBytesPerSecond;
	}

	/**
	 * 设置每秒发送字节数
	 * 
	 * @param sentBytesPerSecond
	 *            每秒发送字节数
	 */
	public void setSentBytesPerSecond(Float sentBytesPerSecond) {
		this.sentBytesPerSecond = sentBytesPerSecond;
	}
}
