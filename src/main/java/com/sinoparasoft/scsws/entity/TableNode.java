package com.sinoparasoft.scsws.entity;

import java.sql.Timestamp;

/**
 * ���ݿ��node��ʵ����
 * 
 * @author Ԭ��
 */
public class TableNode {
	/**
	 * �ڵ�״̬����
	 */
	public static final String STAT_ONLINE = "Online";
	public static final String STAT_OFFLINE = "Offline";
	public static final String STAT_DOWN = "Down";
	/**
	 * ��������
	 */
	private String name;
	/**
	 * ����״̬
	 */
	private String status;
	/**
	 * ��������ϵͳ����
	 */
	private String osName;
	/**
	 * ��������������
	 */
	private Integer coresNum;
	/**
	 * ����CPUƵ��
	 */
	private Float cpuFrequency;
	/**
	 * ����CPU����
	 */
	private Float cpuLoad;
	/**
	 * ����CPU���аٷֱ�
	 */
	private Float cpuIdlePercent;
	/**
	 * ����CPU�û��ٷֱ�
	 */
	private Float cpuUserPercent;
	/**
	 * ����CPUϵͳ�ٷֱ�
	 */
	private Float cpuSystemPercent;
	/**
	 * ���������ڴ��С
	 */
	private Integer totalMemorySize;
	/**
	 * ���������ڴ��С
	 */
	private Integer freeMemorySize;
	/**
	 * ����������̴�С
	 */
	private Float totalDiskSize;
	/**
	 * �������д��̴�С
	 */
	private Float freeDiskSize;
	/**
	 * ������������
	 */
	private Float inBytes;
	/**
	 * �����ϴ�����
	 */
	private Float outBytes;
	/**
	 * �������
	 */
	private String softwareName;
	/**
	 * ������Ϣ����ʱ��
	 */
	private Timestamp modifiedTime;

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
	 * ��ȡ����״̬
	 * 
	 * @return ����״̬
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * ��������״̬
	 * 
	 * @param status
	 *            ����״̬
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * ��ȡ��������ϵͳ����
	 * 
	 * @return ��������ϵͳ����
	 */
	public String getOsName() {
		return osName;
	}

	/**
	 * ������������ϵͳ����
	 * 
	 * @param osName
	 *            ��������ϵͳ����
	 */
	public void setOsName(String osName) {
		this.osName = osName;
	}

	/**
	 * ��ȡ��������������
	 * 
	 * @return ��������������
	 */
	public Integer getCoresNum() {
		return coresNum;
	}

	/**
	 * ������������������
	 * 
	 * @param coresNum
	 *            ��������������
	 */
	public void setCoresNum(Integer coresNum) {
		this.coresNum = coresNum;
	}

	/**
	 * ��ȡ����CPUƵ��
	 * 
	 * @return ����CPUƵ��
	 */
	public Float getCpuFrequency() {
		return cpuFrequency;
	}

	/**
	 * ��������CPUƵ��
	 * 
	 * @param cpuFrequency
	 *            ����CPUƵ��
	 */
	public void setCpuFrequency(Float cpuFrequency) {
		this.cpuFrequency = cpuFrequency;
	}

	/**
	 * ��ȡ����CPU����
	 * 
	 * @return ����CPU����
	 */
	public Float getCpuLoad() {
		return cpuLoad;
	}

	/**
	 * ��������CPU����
	 * 
	 * @param cpuLoad
	 *            ����CPU����
	 */
	public void setCpuLoad(Float cpuLoad) {
		this.cpuLoad = cpuLoad;
	}

	/**
	 * ��ȡ����CPU���аٷֱ�
	 * 
	 * @return ����CPU���аٷֱ�
	 */
	public Float getCpuIdlePercent() {
		return cpuIdlePercent;
	}

	/**
	 * ��������CPU���аٷֱ�
	 * 
	 * @param cpuIdlePercent
	 *            ����CPU���аٷֱ�
	 */
	public void setCpuIdlePercent(Float cpuIdlePercent) {
		this.cpuIdlePercent = cpuIdlePercent;
	}

	/**
	 * ��ȡ����CPU�û��ٷֱ�
	 * 
	 * @return ����CPU�û��ٷֱ�
	 */
	public Float getCpuUserPercent() {
		return cpuUserPercent;
	}

	/**
	 * ��������CPU�û��ٷֱ�
	 * 
	 * @param cpuUserPercent
	 *            ����CPU�û��ٷֱ�
	 */
	public void setCpuUserPercent(Float cpuUserPercent) {
		this.cpuUserPercent = cpuUserPercent;
	}

	/**
	 * ��ȡ����CPUϵͳ�ٷֱ�
	 * 
	 * @return ����CPUϵͳ�ٷֱ�
	 */
	public Float getCpuSystemPercent() {
		return cpuSystemPercent;
	}

	/**
	 * ��������CPUϵͳ�ٷֱ�
	 * 
	 * @param cpuSystemPercent
	 *            ����CPUϵͳ�ٷֱ�
	 */
	public void setCpuSystemPercent(Float cpuSystemPercent) {
		this.cpuSystemPercent = cpuSystemPercent;
	}

	/**
	 * ��ȡ���������ڴ��С
	 * 
	 * @return ���������ڴ��С
	 */
	public Integer getTotalMemorySize() {
		return totalMemorySize;
	}

	/**
	 * �������������ڴ��С
	 * 
	 * @param totalMemorySize
	 *            ���������ڴ��С
	 */
	public void setTotalMemorySize(Integer totalMemorySize) {
		this.totalMemorySize = totalMemorySize;
	}

	/**
	 * ��ȡ���������ڴ��С
	 * 
	 * @return ���������ڴ��С
	 */
	public Integer getFreeMemorySize() {
		return freeMemorySize;
	}

	/**
	 * �������������ڴ��С
	 * 
	 * @param freeMemorySize
	 *            ���������ڴ��С
	 */
	public void setFreeMemorySize(Integer freeMemorySize) {
		this.freeMemorySize = freeMemorySize;
	}

	/**
	 * ��ȡ����������̴�С
	 * 
	 * @return ����������̴�С
	 */
	public Float getTotalDiskSize() {
		return totalDiskSize;
	}

	/**
	 * ��������������̴�С
	 * 
	 * @param totalDiskSize
	 *            ����������̴�С
	 */
	public void setTotalDiskSize(Float totalDiskSize) {
		this.totalDiskSize = totalDiskSize;
	}

	/**
	 * ��ȡ�������д��̴�С
	 * 
	 * @return �������д��̴�С
	 */
	public Float getFreeDiskSize() {
		return freeDiskSize;
	}

	/**
	 * �����������д��̴�С
	 * 
	 * @param freeDiskSize
	 *            �������д��̴�С
	 */
	public void setFreeDiskSize(Float freeDiskSize) {
		this.freeDiskSize = freeDiskSize;
	}

	/**
	 * ��ȡ������������
	 * 
	 * @return ������������
	 */
	public Float getInBytes() {
		return inBytes;
	}

	/**
	 * ����������������
	 * 
	 * @param inBytes
	 *            ������������
	 */
	public void setInBytes(Float inBytes) {
		this.inBytes = inBytes;
	}

	/**
	 * ��ȡ�����ϴ�����
	 * 
	 * @return �����ϴ�����
	 */
	public Float getOutBytes() {
		return outBytes;
	}

	/**
	 * ���������ϴ�����
	 * 
	 * @param outBytes
	 *            �����ϴ�����
	 */
	public void setOutBytes(Float outBytes) {
		this.outBytes = outBytes;
	}

	/**
	 * ��ȡ�������
	 * 
	 * @return �������
	 */
	public String getSoftwareName() {
		return softwareName;
	}

	/**
	 * �����������
	 * 
	 * @param softwareName
	 *            �������
	 */
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	/**
	 * ��ȡ������Ϣ����ʱ��
	 * 
	 * @return ������Ϣ����ʱ��
	 */
	public Timestamp getModifiedTime() {
		return modifiedTime;
	}

	/**
	 * ����������Ϣ����ʱ��
	 * 
	 * @param modifiedTime
	 *            ������Ϣ����ʱ��
	 */
	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
}
