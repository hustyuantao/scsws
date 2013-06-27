package com.sinoparasoft.scsws.entity;

import java.util.Date;
import java.util.Map;

/**
 * ��������
 * 
 * @author Ԭ��
 */
public class NodeMetric {
	/**
	 * ��������
	 */
	private String name;
	/**
	 * ����IP��ַ
	 */
	private String ip;
	/**
	 * ����λ��
	 */
	private String location;
	/**
	 * ����ʱ��
	 */
	private Date reportedTime;
	/**
	 * ����GMOND��ʼʱ��
	 */
	private Date gmondStartedTime;

	/**
	 * ����ϵͳ�����汾
	 */
	private String osRelease;
	/**
	 * ����ϵͳ����
	 */
	private String osName;
	/**
	 * ���һ��ϵͳ����ʱ��
	 */
	private Date lastBootTime;
	/**
	 * ����ϵͳ�ܹ�
	 */
	private String machineType;

	/**
	 * һ������ƽ������
	 */
	private Float avgOneMinuteLoad;
	/**
	 * �������ƽ������
	 */
	private Float avgFiveMinuteLoad;
	/**
	 * ʮ�������ƽ������
	 */
	private Float avgFifteenMinuteLoad;

	/**
	 * ���ڴ��С����λ��KB
	 */
	private Float totalMemorySize;
	/**
	 * �����ڴ��С
	 */
	private Float freeMemorySize;
	/**
	 * cached�ڴ��С
	 */
	private Float cachedMemorySize;
	/**
	 * buffered�ڴ��С
	 */
	private Float bufferedMemorySize;
	/**
	 * �����ڴ��С
	 */
	private Float sharedMemorySize;
	/**
	 * ���������ܴ�С����λ�� KB
	 */
	private Float totalSwapSize;
	/**
	 * ���ý���������С����λ��KB
	 */
	private Float freeSwapSize;

	/**
	 * �ܽ�����
	 */
	private Integer totalProcessesNum;
	/**
	 * �������н�������
	 */
	private Integer runningProcessesNum;

	/**
	 * ϵͳGexec״̬
	 */
	private Boolean gexecAvailable;

	/**
	 * Ӳ�̿ռ��ܴ�С
	 */
	private Float totalDiskSize;
	/**
	 * Ӳ�̿��пռ��С
	 */
	private Float freeDiskSize;
	/**
	 * Ӳ�����з������ʹ�ðٷֱ�
	 */
	private Float maxUsedDiskSpacePercent;
	/**
	 * Ӳ�̷���ʹ�ðٷֱ�
	 */
	private Map<String, Float> usedDiskMap;
	/**
	 * Ӳ�̷������аٷֱ�
	 */
	private Map<String, Float> totalDiskMap;

	/**
	 * CPU���аٷֱ�
	 */
	private Float cpuIdlePercent;
	/**
	 * CPU Nice�ٷֱ�
	 */
	private Float cpuNicePercent;
	/**
	 * CPU�û��ٷֱ�
	 */
	private Float cpuUserPercent;
	/**
	 * CPU Aidle�ٷֱ�
	 */
	private Float cpuAidlePercent;
	/**
	 * CPUϵͳ�ٷֱ�
	 */
	private Float cpuSystemPercent;
	/**
	 * CPU Wio�ٷֱ�
	 */
	private Float cpuWioPercent;
	/**
	 * CPU����
	 */
	private Integer cpuNum;
	/**
	 * CPUƵ�ʣ���λ��MHz
	 */
	private Integer cpuFrequency;

	/**
	 * TCP���Ὠ������
	 */
	private Integer establishedTcpConnectionsNum;
	/**
	 * TCP�����������
	 */
	private Integer listeningTcpConnectionsNum;
	/**
	 * TCP���������ȴ�����
	 */
	private Integer syncWaitTcpConnectionsNum;
	/**
	 * TCP����������������
	 */
	private Integer syncSentTcpConnectionsNum;
	/**
	 * TCP����������������
	 */
	private Integer syncRecvTcpConnectionsNum;
	/**
	 * TCP����last_ack����
	 */
	private Integer lastAckTcpConnectionsNum;
	/**
	 * TCP����fin_wait1����
	 */
	private Integer finWait1TcpConnectionsNum;
	/**
	 * TCP����time_wait����
	 */
	private Integer timeWaitTcpConnectionsNum;
	/**
	 * TCP����fin_wait2����
	 */
	private Integer finWait2TcpConnectionsNum;
	/**
	 * TCP����close_wait����
	 */
	private Integer closeWaitTcpConnectionsNum;
	/**
	 * TCP�������ڹر�����
	 */
	private Integer closingTcpConnectionsNum;
	/**
	 * TCP�����ѹر�����
	 */
	private Integer closedTcpConnectionsNum;
	/**
	 * TCP����δ֪״̬����
	 */
	private Integer unknownTcpConnectionsNum;
	/**
	 * ÿ��������ݰ���
	 */
	private Float receivedPacketsPerSecond;
	/**
	 * ÿ�뷢�����ݰ���
	 */
	private Float sentPacketsPerSecond;
	/**
	 * ÿ������ֽ���
	 */
	private Float receivedBytesPerSecond;
	/**
	 * ÿ�뷢���ֽ���
	 */
	private Float sentBytesPerSecond;

	/**
	 * ��ȡ��������
	 * 
	 * @return ��������
	 */
	public String getName() {
		return name;
	}

	/**
	 * ������������
	 * 
	 * @param name
	 *            ��������
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ��ȡ����IP��ַ
	 * 
	 * @return ����IP��ַ
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * ��������IP��ַ
	 * 
	 * @param ip
	 *            ����IP��ַ
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * ��ȡ����λ��
	 * 
	 * @return ����λ��
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * ��������λ��
	 * 
	 * @param location
	 *            ����λ��
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * ��ȡ����ʱ��
	 * 
	 * @return ����ʱ��
	 */
	public Date getReportedTime() {
		return reportedTime;
	}

	/**
	 * ���ñ���ʱ��
	 * 
	 * @param reportedTime
	 *            ����ʱ��
	 */
	public void setReportedTime(Date reportedTime) {
		this.reportedTime = reportedTime;
	}

	/**
	 * ��ȡ����GMOND��ʼʱ��
	 * 
	 * @return ����GMOND��ʼʱ��
	 */
	public Date getGmondStartedTime() {
		return gmondStartedTime;
	}

	/**
	 * ��������GMOND��ʼʱ��
	 * 
	 * @param gmondStartedTime
	 *            ����GMOND��ʼʱ��
	 */
	public void setGmondStartedTime(Date gmondStartedTime) {
		this.gmondStartedTime = gmondStartedTime;
	}

	/**
	 * ��ȡ����ϵͳ�����汾
	 * 
	 * @return ����ϵͳ�����汾
	 */
	public String getOsRelease() {
		return osRelease;
	}

	/**
	 * ���ò���ϵͳ�����汾
	 * 
	 * @param osRelease
	 *            ����ϵͳ�����汾
	 */
	public void setOsRelease(String osRelease) {
		this.osRelease = osRelease;
	}

	/**
	 * ��ȡ����ϵͳ����
	 * 
	 * @return ����ϵͳ����
	 */
	public String getOsName() {
		return osName;
	}

	/**
	 * ���ò���ϵͳ����
	 * 
	 * @param osName
	 *            ����ϵͳ����
	 */
	public void setOsName(String osName) {
		this.osName = osName;
	}

	/**
	 * ��ȡ���һ��ϵͳ����ʱ��
	 * 
	 * @return ���һ��ϵͳ����ʱ��
	 */
	public Date getLastBootTime() {
		return lastBootTime;
	}

	/**
	 * �������һ��ϵͳ����ʱ��
	 * 
	 * @param lastBootTime
	 *            ���һ��ϵͳ����ʱ��
	 */
	public void setLastBootTime(Date lastBootTime) {
		this.lastBootTime = lastBootTime;
	}

	/**
	 * ��ȡ����ϵͳ�ܹ�
	 * 
	 * @return ����ϵͳ�ܹ�
	 */
	public String getMachineType() {
		return machineType;
	}

	/**
	 * ��������ϵͳ�ܹ�
	 * 
	 * @param machineType
	 *            ����ϵͳ�ܹ�
	 */
	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

	/**
	 * ��ȡһ������ƽ������
	 * 
	 * @return һ������ƽ������
	 */
	public Float getAvgOneMinuteLoad() {
		return avgOneMinuteLoad;
	}

	/**
	 * ����һ������ƽ������
	 * 
	 * @param avgOneMinuteLoad
	 *            һ������ƽ������
	 */
	public void setAvgOneMinuteLoad(Float avgOneMinuteLoad) {
		this.avgOneMinuteLoad = avgOneMinuteLoad;
	}

	/**
	 * ��ȡ�������ƽ������
	 * 
	 * @return �������ƽ������
	 */
	public Float getAvgFiveMinuteLoad() {
		return avgFiveMinuteLoad;
	}

	/**
	 * �����������ƽ������
	 * 
	 * @param avgFiveMinuteLoad
	 *            �������ƽ������
	 */
	public void setAvgFiveMinuteLoad(Float avgFiveMinuteLoad) {
		this.avgFiveMinuteLoad = avgFiveMinuteLoad;
	}

	/**
	 * ��ȡʮ�������ƽ������
	 * 
	 * @return ʮ�������ƽ������
	 */
	public Float getAvgFifteenMinuteLoad() {
		return avgFifteenMinuteLoad;
	}

	/**
	 * ����ʮ�������ƽ������
	 * 
	 * @param avgFifteenMinuteLoad
	 *            ʮ�������ƽ������
	 */
	public void setAvgFifteenMinuteLoad(Float avgFifteenMinuteLoad) {
		this.avgFifteenMinuteLoad = avgFifteenMinuteLoad;
	}

	/**
	 * ��ȡ���ڴ��С����λ��KB
	 * 
	 * @return ���ڴ��С����λ��KB
	 */
	public Float getTotalMemorySize() {
		return totalMemorySize;
	}

	/**
	 * �������ڴ��С����λ��KB
	 * 
	 * @param totalMemorySize
	 *            ���ڴ��С����λ��KB
	 */
	public void setTotalMemorySize(Float totalMemorySize) {
		this.totalMemorySize = totalMemorySize;
	}

	/**
	 * ��ȡ�����ڴ��С
	 * 
	 * @return �����ڴ��С
	 */
	public Float getFreeMemorySize() {
		return freeMemorySize;
	}

	/**
	 * ���ÿ����ڴ��С
	 * 
	 * @param freeMemorySize
	 *            �����ڴ��С
	 */
	public void setFreeMemorySize(Float freeMemorySize) {
		this.freeMemorySize = freeMemorySize;
	}

	/**
	 * ��ȡcached�ڴ��С
	 * 
	 * @return cached�ڴ��С
	 */
	public Float getCachedMemorySize() {
		return cachedMemorySize;
	}

	/**
	 * ����cached�ڴ��С
	 * 
	 * @param cachedMemorySize
	 *            cached�ڴ��С
	 */
	public void setCachedMemorySize(Float cachedMemorySize) {
		this.cachedMemorySize = cachedMemorySize;
	}

	/**
	 * ��ȡbuffered�ڴ��С
	 * 
	 * @return buffered�ڴ��С
	 */
	public Float getBufferedMemorySize() {
		return bufferedMemorySize;
	}

	/**
	 * ����buffered�ڴ��С
	 * 
	 * @param bufferedMemorySize
	 *            buffered�ڴ��С
	 */
	public void setBufferedMemorySize(Float bufferedMemorySize) {
		this.bufferedMemorySize = bufferedMemorySize;
	}

	/**
	 * ��ȡ�����ڴ��С
	 * 
	 * @return �����ڴ��С
	 */
	public Float getSharedMemorySize() {
		return sharedMemorySize;
	}

	/**
	 * ���ù����ڴ��С
	 * 
	 * @param sharedMemorySize
	 *            �����ڴ��С
	 */
	public void setSharedMemorySize(Float sharedMemorySize) {
		this.sharedMemorySize = sharedMemorySize;
	}

	/**
	 * ��ȡ���������ܴ�С����λ�� KB
	 * 
	 * @return ���������ܴ�С����λ�� KB
	 */
	public Float getTotalSwapSize() {
		return totalSwapSize;
	}

	/**
	 * ���ý��������ܴ�С����λ�� KB
	 * 
	 * @param totalSwapSize
	 *            ���������ܴ�С����λ�� KB
	 */
	public void setTotalSwapSize(Float totalSwapSize) {
		this.totalSwapSize = totalSwapSize;
	}

	/**
	 * ��ȡ���ý���������С����λ��KB
	 * 
	 * @return ���ý���������С����λ��KB
	 */
	public Float getFreeSwapSize() {
		return freeSwapSize;
	}

	/**
	 * ���ÿ��ý���������С����λ��KB
	 * 
	 * @param freeSwapSize
	 *            ���ý���������С����λ��KB
	 */
	public void setFreeSwapSize(Float freeSwapSize) {
		this.freeSwapSize = freeSwapSize;
	}

	/**
	 * ��ȡ�ܽ�����
	 * 
	 * @return �ܽ�����
	 */
	public Integer getTotalProcessesNum() {
		return totalProcessesNum;
	}

	/**
	 * �����ܽ�����
	 * 
	 * @param totalProcessesNum
	 *            �ܽ�����
	 */
	public void setTotalProcessesNum(Integer totalProcessesNum) {
		this.totalProcessesNum = totalProcessesNum;
	}

	/**
	 * ��ȡ�������н�������
	 * 
	 * @return �������н�������
	 */
	public Integer getRunningProcessesNum() {
		return runningProcessesNum;
	}

	/**
	 * �����������н�������
	 * 
	 * @param runningProcessesNum
	 *            �������н�������
	 */
	public void setRunningProcessesNum(Integer runningProcessesNum) {
		this.runningProcessesNum = runningProcessesNum;
	}

	/**
	 * ��ȡϵͳGexec״̬
	 * 
	 * @return ϵͳGexec״̬
	 */
	public Boolean getGexecAvailable() {
		return gexecAvailable;
	}

	/**
	 * ����ϵͳGexec״̬
	 * 
	 * @param gexecAvailable
	 *            ϵͳGexec״̬
	 */
	public void setGexecAvailable(Boolean gexecAvailable) {
		this.gexecAvailable = gexecAvailable;
	}

	/**
	 * ��ȡӲ�̿ռ��ܴ�С
	 * 
	 * @return Ӳ�̿ռ��ܴ�С
	 */
	public Float getTotalDiskSize() {
		return totalDiskSize;
	}

	/**
	 * ����Ӳ�̿ռ��ܴ�С
	 * 
	 * @param totalDiskSize
	 *            Ӳ�̿ռ��ܴ�С
	 */
	public void setTotalDiskSize(Float totalDiskSize) {
		this.totalDiskSize = totalDiskSize;
	}

	/**
	 * ��ȡӲ�̿��пռ��С
	 * 
	 * @return Ӳ�̿��пռ��С
	 */
	public Float getFreeDiskSize() {
		return freeDiskSize;
	}

	/**
	 * ����Ӳ�̿��пռ��С
	 * 
	 * @param freeDiskSize
	 *            Ӳ�̿��пռ��С
	 */
	public void setFreeDiskSize(Float freeDiskSize) {
		this.freeDiskSize = freeDiskSize;
	}

	/**
	 * ��ȡӲ�����з������ʹ�ðٷֱ�
	 * 
	 * @return Ӳ�����з������ʹ�ðٷֱ�
	 */
	public Float getMaxUsedDiskSpacePercent() {
		return maxUsedDiskSpacePercent;
	}

	/**
	 * ����Ӳ�����з������ʹ�ðٷֱ�
	 * 
	 * @param maxUsedDiskSpacePercent
	 *            Ӳ�����з������ʹ�ðٷֱ�
	 */
	public void setMaxUsedDiskSpacePercent(Float maxUsedDiskSpacePercent) {
		this.maxUsedDiskSpacePercent = maxUsedDiskSpacePercent;
	}

	/**
	 * ��ȡӲ�̷���ʹ�ðٷֱ�
	 * 
	 * @return Ӳ�̷���ʹ�ðٷֱ�
	 */
	public Map<String, Float> getUsedDiskMap() {
		return usedDiskMap;
	}

	/**
	 * ����Ӳ�̷���ʹ�ðٷֱ�
	 * 
	 * @param usedDiskMap
	 *            Ӳ�̷���ʹ�ðٷֱ�
	 */
	public void setUsedDiskMap(Map<String, Float> usedDiskMap) {
		this.usedDiskMap = usedDiskMap;
	}

	/**
	 * ��ȡӲ�̷������аٷֱ�
	 * 
	 * @return Ӳ�̷������аٷֱ�
	 */
	public Map<String, Float> getTotalDiskMap() {
		return totalDiskMap;
	}

	/**
	 * ����Ӳ�̷������аٷֱ�
	 * 
	 * @param totalDiskMap
	 *            Ӳ�̷������аٷֱ�
	 */
	public void setTotalDiskMap(Map<String, Float> totalDiskMap) {
		this.totalDiskMap = totalDiskMap;
	}

	/**
	 * ��ȡCPU���аٷֱ�
	 * 
	 * @return CPU���аٷֱ�
	 */
	public Float getCpuIdlePercent() {
		return cpuIdlePercent;
	}

	/**
	 * ����CPU���аٷֱ�
	 * 
	 * @param cpuIdlePercent
	 *            CPU���аٷֱ�
	 */
	public void setCpuIdlePercent(Float cpuIdlePercent) {
		this.cpuIdlePercent = cpuIdlePercent;
	}

	/**
	 * ��ȡCPU Nice�ٷֱ�
	 * 
	 * @return CPU Nice�ٷֱ�
	 */
	public Float getCpuNicePercent() {
		return cpuNicePercent;
	}

	/**
	 * ����CPU Nice�ٷֱ�
	 * 
	 * @param cpuNicePercent
	 *            CPU Nice�ٷֱ�
	 */
	public void setCpuNicePercent(Float cpuNicePercent) {
		this.cpuNicePercent = cpuNicePercent;
	}

	/**
	 * ��ȡCPU�û��ٷֱ�
	 * 
	 * @return CPU�û��ٷֱ�
	 */
	public Float getCpuUserPercent() {
		return cpuUserPercent;
	}

	/**
	 * ����CPU�û��ٷֱ�
	 * 
	 * @param cpuUserPercent
	 *            CPU�û��ٷֱ�
	 */
	public void setCpuUserPercent(Float cpuUserPercent) {
		this.cpuUserPercent = cpuUserPercent;
	}

	/**
	 * ��ȡCPU Aidle�ٷֱ�
	 * 
	 * @return CPU Aidle�ٷֱ�
	 */
	public Float getCpuAidlePercent() {
		return cpuAidlePercent;
	}

	/**
	 * ����CPU Aidle�ٷֱ�
	 * 
	 * @param cpuAidlePercent
	 *            CPU Aidle�ٷֱ�
	 */
	public void setCpuAidlePercent(Float cpuAidlePercent) {
		this.cpuAidlePercent = cpuAidlePercent;
	}

	/**
	 * ��ȡCPUϵͳ�ٷֱ�
	 * 
	 * @return CPUϵͳ�ٷֱ�
	 */
	public Float getCpuSystemPercent() {
		return cpuSystemPercent;
	}

	/**
	 * ����CPUϵͳ�ٷֱ�
	 * 
	 * @param cpuSystemPercent
	 *            CPUϵͳ�ٷֱ�
	 */
	public void setCpuSystemPercent(Float cpuSystemPercent) {
		this.cpuSystemPercent = cpuSystemPercent;
	}

	/**
	 * ��ȡCPU Wio�ٷֱ�
	 * 
	 * @return CPU Wio�ٷֱ�
	 */
	public Float getCpuWioPercent() {
		return cpuWioPercent;
	}

	/**
	 * ����CPU Wio�ٷֱ�
	 * 
	 * @param cpuWioPercent
	 *            CPU Wio�ٷֱ�
	 */
	public void setCpuWioPercent(Float cpuWioPercent) {
		this.cpuWioPercent = cpuWioPercent;
	}

	/**
	 * ��ȡCPU����
	 * 
	 * @return CPU����
	 */
	public Integer getCpuNum() {
		return cpuNum;
	}

	/**
	 * ����CPU����
	 * 
	 * @param cpuNum
	 *            CPU����
	 */
	public void setCpuNum(Integer cpuNum) {
		this.cpuNum = cpuNum;
	}

	/**
	 * ��ȡCPUƵ�ʣ���λ��MHz
	 * 
	 * @return CPUƵ�ʣ���λ��MHz
	 */
	public Integer getCpuFrequency() {
		return cpuFrequency;
	}

	/**
	 * ����CPUƵ�ʣ���λ��MHz
	 * 
	 * @param cpuFrequency
	 *            CPUƵ�ʣ���λ��MHz
	 */
	public void setCpuFrequency(Integer cpuFrequency) {
		this.cpuFrequency = cpuFrequency;
	}

	/**
	 * ��ȡTCP���Ὠ������
	 * 
	 * @return TCP���Ὠ������
	 */
	public Integer getEstablishedTcpConnectionsNum() {
		return establishedTcpConnectionsNum;
	}

	/**
	 * ����TCP���Ὠ������
	 * 
	 * @param establishedTcpConnectionsNum
	 *            TCP���Ὠ������
	 */
	public void setEstablishedTcpConnectionsNum(
			Integer establishedTcpConnectionsNum) {
		this.establishedTcpConnectionsNum = establishedTcpConnectionsNum;
	}

	/**
	 * ��ȡTCP�����������
	 * 
	 * @return TCP�����������
	 */
	public Integer getListeningTcpConnectionsNum() {
		return listeningTcpConnectionsNum;
	}

	/**
	 * ����TCP�����������
	 * 
	 * @param listeningTcpConnectionsNum
	 *            TCP�����������
	 */
	public void setListeningTcpConnectionsNum(Integer listeningTcpConnectionsNum) {
		this.listeningTcpConnectionsNum = listeningTcpConnectionsNum;
	}

	/**
	 * ��ȡTCP���������ȴ�����
	 * 
	 * @return TCP���������ȴ�����
	 */
	public Integer getSyncWaitTcpConnectionsNum() {
		return syncWaitTcpConnectionsNum;
	}

	/**
	 * ����TCP���������ȴ�����
	 * 
	 * @param syncWaitTcpConnectionsNum
	 *            TCP���������ȴ�����
	 */
	public void setSyncWaitTcpConnectionsNum(Integer syncWaitTcpConnectionsNum) {
		this.syncWaitTcpConnectionsNum = syncWaitTcpConnectionsNum;
	}

	/**
	 * ��ȡTCP����������������
	 * 
	 * @return TCP����������������
	 */
	public Integer getSyncSentTcpConnectionsNum() {
		return syncSentTcpConnectionsNum;
	}

	/**
	 * ����TCP����������������
	 * 
	 * @param syncSentTcpConnectionsNum
	 *            TCP����������������
	 */
	public void setSyncSentTcpConnectionsNum(Integer syncSentTcpConnectionsNum) {
		this.syncSentTcpConnectionsNum = syncSentTcpConnectionsNum;
	}

	/**
	 * ��ȡTCP����������������
	 * 
	 * @return TCP����������������
	 */
	public Integer getSyncRecvTcpConnectionsNum() {
		return syncRecvTcpConnectionsNum;
	}

	/**
	 * ����TCP����������������
	 * 
	 * @param syncRecvTcpConnectionsNum
	 *            TCP����������������
	 */
	public void setSyncRecvTcpConnectionsNum(Integer syncRecvTcpConnectionsNum) {
		this.syncRecvTcpConnectionsNum = syncRecvTcpConnectionsNum;
	}

	/**
	 * ��ȡTCP����last_ack����
	 * 
	 * @return TCP����last_ack����
	 */
	public Integer getLastAckTcpConnectionsNum() {
		return lastAckTcpConnectionsNum;
	}

	/**
	 * ����TCP����last_ack����
	 * 
	 * @param lastAckTcpConnectionsNum
	 *            TCP����last_ack����
	 */
	public void setLastAckTcpConnectionsNum(Integer lastAckTcpConnectionsNum) {
		this.lastAckTcpConnectionsNum = lastAckTcpConnectionsNum;
	}

	/**
	 * ��ȡTCP����fin_wait1����
	 * 
	 * @return TCP����fin_wait1����
	 */
	public Integer getFinWait1TcpConnectionsNum() {
		return finWait1TcpConnectionsNum;
	}

	/**
	 * ����TCP����fin_wait1����
	 * 
	 * @param finWait1TcpConnectionsNum
	 *            TCP����fin_wait1����
	 */
	public void setFinWait1TcpConnectionsNum(Integer finWait1TcpConnectionsNum) {
		this.finWait1TcpConnectionsNum = finWait1TcpConnectionsNum;
	}

	/**
	 * ��ȡTCP����time_wait����
	 * 
	 * @return TCP����time_wait����
	 */
	public Integer getTimeWaitTcpConnectionsNum() {
		return timeWaitTcpConnectionsNum;
	}

	/**
	 * ����TCP����time_wait����
	 * 
	 * @param timeWaitTcpConnectionsNum
	 *            TCP����time_wait����
	 */
	public void setTimeWaitTcpConnectionsNum(Integer timeWaitTcpConnectionsNum) {
		this.timeWaitTcpConnectionsNum = timeWaitTcpConnectionsNum;
	}

	/**
	 * ��ȡTCP����fin_wait2����
	 * 
	 * @return TCP����fin_wait2����
	 */
	public Integer getFinWait2TcpConnectionsNum() {
		return finWait2TcpConnectionsNum;
	}

	/**
	 * ����TCP����fin_wait2����
	 * 
	 * @param finWait2TcpConnectionsNum
	 *            TCP����fin_wait2����
	 */
	public void setFinWait2TcpConnectionsNum(Integer finWait2TcpConnectionsNum) {
		this.finWait2TcpConnectionsNum = finWait2TcpConnectionsNum;
	}

	/**
	 * ��ȡTCP����close_wait����
	 * 
	 * @return TCP����close_wait����
	 */
	public Integer getCloseWaitTcpConnectionsNum() {
		return closeWaitTcpConnectionsNum;
	}

	/**
	 * ����TCP����close_wait����
	 * 
	 * @param closeWaitTcpConnectionsNum
	 *            TCP����close_wait����
	 */
	public void setCloseWaitTcpConnectionsNum(Integer closeWaitTcpConnectionsNum) {
		this.closeWaitTcpConnectionsNum = closeWaitTcpConnectionsNum;
	}

	/**
	 * ��ȡTCP�������ڹر�����
	 * 
	 * @return TCP�������ڹر�����
	 */
	public Integer getClosingTcpConnectionsNum() {
		return closingTcpConnectionsNum;
	}

	/**
	 * ����TCP�������ڹر�����
	 * 
	 * @param closingTcpConnectionsNum
	 *            TCP�������ڹر�����
	 */
	public void setClosingTcpConnectionsNum(Integer closingTcpConnectionsNum) {
		this.closingTcpConnectionsNum = closingTcpConnectionsNum;
	}

	/**
	 * ��ȡTCP�����ѹر�����
	 * 
	 * @return TCP�����ѹر�����
	 */
	public Integer getClosedTcpConnectionsNum() {
		return closedTcpConnectionsNum;
	}

	/**
	 * ����TCP�����ѹر�����
	 * 
	 * @param closedTcpConnectionsNum
	 *            TCP�����ѹر�����
	 */
	public void setClosedTcpConnectionsNum(Integer closedTcpConnectionsNum) {
		this.closedTcpConnectionsNum = closedTcpConnectionsNum;
	}

	/**
	 * ��ȡTCP����δ֪״̬����
	 * 
	 * @return TCP����δ֪״̬����
	 */
	public Integer getUnknownTcpConnectionsNum() {
		return unknownTcpConnectionsNum;
	}

	/**
	 * ����TCP����δ֪״̬����
	 * 
	 * @param unknownTcpConnectionsNum
	 *            TCP����δ֪״̬����
	 */
	public void setUnknownTcpConnectionsNum(Integer unknownTcpConnectionsNum) {
		this.unknownTcpConnectionsNum = unknownTcpConnectionsNum;
	}

	/**
	 * ��ȡÿ��������ݰ���
	 * 
	 * @return ÿ��������ݰ���
	 */
	public Float getReceivedPacketsPerSecond() {
		return receivedPacketsPerSecond;
	}

	/**
	 * ����ÿ��������ݰ���
	 * 
	 * @param receivedPacketsPerSecond
	 *            ÿ��������ݰ���
	 */
	public void setReceivedPacketsPerSecond(Float receivedPacketsPerSecond) {
		this.receivedPacketsPerSecond = receivedPacketsPerSecond;
	}

	/**
	 * ��ȡÿ�뷢�����ݰ���
	 * 
	 * @return ÿ�뷢�����ݰ���
	 */
	public Float getSentPacketsPerSecond() {
		return sentPacketsPerSecond;
	}

	/**
	 * ����ÿ�뷢�����ݰ���
	 * 
	 * @param sentPacketsPerSecond
	 *            ÿ�뷢�����ݰ���
	 */
	public void setSentPacketsPerSecond(Float sentPacketsPerSecond) {
		this.sentPacketsPerSecond = sentPacketsPerSecond;
	}

	/**
	 * ��ȡÿ������ֽ���
	 * 
	 * @return ÿ������ֽ���
	 */
	public Float getReceivedBytesPerSecond() {
		return receivedBytesPerSecond;
	}

	/**
	 * ����ÿ������ֽ���
	 * 
	 * @param receivedBytesPerSecond
	 *            ÿ������ֽ���
	 */
	public void setReceivedBytesPerSecond(Float receivedBytesPerSecond) {
		this.receivedBytesPerSecond = receivedBytesPerSecond;
	}

	/**
	 * ��ȡÿ�뷢���ֽ���
	 * 
	 * @return ÿ�뷢���ֽ���
	 */
	public Float getSentBytesPerSecond() {
		return sentBytesPerSecond;
	}

	/**
	 * ����ÿ�뷢���ֽ���
	 * 
	 * @param sentBytesPerSecond
	 *            ÿ�뷢���ֽ���
	 */
	public void setSentBytesPerSecond(Float sentBytesPerSecond) {
		this.sentBytesPerSecond = sentBytesPerSecond;
	}
}