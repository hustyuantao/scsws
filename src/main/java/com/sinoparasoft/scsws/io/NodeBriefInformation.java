package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * �ڵ������Ϣ��
 * 
 * @author Ԭ��
 * @version 1.0
 */
@XmlRootElement(name = "Node")
@XmlType(propOrder = { "name", "state", "coresNum", "cpuFrequency", "cpuLoad",
		"cpuIdlePercent", "cpuUserPercent", "cpuSystemPercent",
		"totalMemorySize", "freeMemorySize", "totalDiskSize", "freeDiskSize",
		"runningSoftwareName" })
public class NodeBriefInformation {
	/**
	 * �ڵ�����
	 */
	private String name;
	/**
	 * �ڵ�״̬
	 */
	private String state;
	/**
	 * ����������
	 */
	private Integer coresNum;
	/**
	 * ��������Ƶ
	 */
	private Float cpuFrequency;
	/**
	 * ����������
	 */
	private Float cpuLoad;
	/**
	 * ���������аٷֱ�
	 */
	private Float cpuIdlePercent;
	/**
	 * �������û�ռ�ðٷֱ�
	 */
	private Float cpuUserPercent;
	/**
	 * ������ϵͳռ�ðٷֱ�
	 */
	private Float cpuSystemPercent;
	/**
	 * �ڵ����ڴ��С
	 */
	private Integer totalMemorySize;
	/**
	 * �ڵ�����ڴ��С
	 */
	private Integer freeMemorySize;
	/**
	 * �ڵ��ܴ��̴�С
	 */
	private Float totalDiskSize;
	/**
	 * �ڵ���д��̴�С
	 */
	private Float freeDiskSize;
	/**
	 * �ڵ�����������ҵ��ʹ�õ��������
	 */
	private String runningSoftwareName;

	/**
	 * ��ȡ�ڵ�����
	 * 
	 * @return �ڵ�����
	 */
	@XmlElement(name = "NodeName")
	public String getName() {
		return name;
	}

	/**
	 * ���ýڵ�����
	 * 
	 * @param name
	 *            �ڵ�����
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ��ȡ�ڵ�״̬
	 * 
	 * @return �ڵ�״̬
	 */
	@XmlElement(name = "State")
	public String getState() {
		return state;
	}

	/**
	 * ���ýڵ�״̬
	 * 
	 * @param state
	 *            �ڵ�״̬
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * ��ȡ����������
	 * 
	 * @return ����������
	 */
	@XmlElement(name = "NumberOfCores")
	public Integer getCoresNum() {
		return coresNum;
	}

	/**
	 * ���ô���������
	 * 
	 * @param coresNum
	 *            ����������
	 */
	public void setCoresNum(Integer coresNum) {
		this.coresNum = coresNum;
	}

	/**
	 * ��ȡ��������Ƶ
	 * 
	 * @return ��������Ƶ
	 */
	@XmlElement(name = "CpuFrequency")
	public Float getCpuFrequency() {
		return cpuFrequency;
	}

	/**
	 * ���ô�������Ƶ
	 * 
	 * @param cpuFrequency
	 *            ��������Ƶ
	 */
	public void setCpuFrequency(Float cpuFrequency) {
		this.cpuFrequency = cpuFrequency;
	}

	/**
	 * ��ȡ����������
	 * 
	 * @return ����������
	 */
	@XmlElement(name = "CpuLoad")
	public Float getCpuLoad() {
		return cpuLoad;
	}

	/**
	 * ���ô���������
	 * 
	 * @param cpuLoad
	 *            ����������
	 */
	public void setCpuLoad(Float cpuLoad) {
		this.cpuLoad = cpuLoad;
	}

	/**
	 * ��ȡ���������аٷֱ�
	 * 
	 * @return ���������аٷֱ�
	 */
	@XmlElement(name = "CpuIdle")
	public Float getCpuIdlePercent() {
		return cpuIdlePercent;
	}

	/**
	 * ���ô��������аٷֱ�
	 * 
	 * @param cpuIdlePercent
	 *            ���������аٷֱ�
	 */
	public void setCpuIdlePercent(Float cpuIdlePercent) {
		this.cpuIdlePercent = cpuIdlePercent;
	}

	/**
	 * ��ȡ�������û�ռ�ðٷֱ�
	 * 
	 * @return �������û�ռ�ðٷֱ�
	 */
	@XmlElement(name = "CpuUser")
	public Float getCpuUserPercent() {
		return cpuUserPercent;
	}

	/**
	 * ���ô������û�ռ�ðٷֱ�
	 * 
	 * @param cpuUserPercent
	 *            �������û�ռ�ðٷֱ�
	 */
	public void setCpuUserPercent(Float cpuUserPercent) {
		this.cpuUserPercent = cpuUserPercent;
	}

	/**
	 * ��ȡ������ϵͳռ�ðٷֱ�
	 * 
	 * @return ������ϵͳռ�ðٷֱ�
	 */
	@XmlElement(name = "CpuSystem")
	public Float getCpuSystemPercent() {
		return cpuSystemPercent;
	}

	/**
	 * ���ô�����ϵͳռ�ðٷֱ�
	 * 
	 * @param cpuSystemPercent
	 *            ������ϵͳռ�ðٷֱ�
	 */
	public void setCpuSystemPercent(Float cpuSystemPercent) {
		this.cpuSystemPercent = cpuSystemPercent;
	}

	/**
	 * ��ȡ�ڵ����ڴ��С
	 * 
	 * @return �ڵ����ڴ��С
	 */
	@XmlElement(name = "PhysicalMemory")
	public Integer getTotalMemorySize() {
		return totalMemorySize;
	}

	/**
	 * ���ýڵ����ڴ��С
	 * 
	 * @param totalMemorySize
	 *            �ڵ����ڴ��С
	 */
	public void setTotalMemorySize(Integer totalMemorySize) {
		this.totalMemorySize = totalMemorySize;
	}

	/**
	 * ��ȡ�ڵ�����ڴ��С
	 * 
	 * @return �ڵ�����ڴ��С
	 */
	@XmlElement(name = "AvailableMemory")
	public Integer getFreeMemorySize() {
		return freeMemorySize;
	}

	/**
	 * ���ýڵ�����ڴ��С
	 * 
	 * @param freeMemorySize
	 *            �ڵ�����ڴ��С
	 */
	public void setFreeMemorySize(Integer freeMemorySize) {
		this.freeMemorySize = freeMemorySize;
	}

	/**
	 * ��ȡ�ڵ��ܴ��̴�С
	 * 
	 * @return �ڵ��ܴ��̴�С
	 */
	@XmlElement(name = "TotalDisk")
	public Float getTotalDiskSize() {
		return totalDiskSize;
	}

	/**
	 * ���ýڵ��ܴ��̴�С
	 * 
	 * @param totalDiskSize
	 *            �ڵ��ܴ��̴�С
	 */
	public void setTotalDiskSize(Float totalDiskSize) {
		this.totalDiskSize = totalDiskSize;
	}

	/**
	 * ��ȡ�ڵ���д��̴�С
	 * 
	 * @return �ڵ���д��̴�С
	 */
	@XmlElement(name = "FreeDisk")
	public Float getFreeDiskSize() {
		return freeDiskSize;
	}

	/**
	 * ���ýڵ���д��̴�С
	 * 
	 * @param freeDiskSize
	 *            �ڵ���д��̴�С
	 */
	public void setFreeDiskSize(Float freeDiskSize) {
		this.freeDiskSize = freeDiskSize;
	}

	/**
	 * ��ȡ�ڵ�����������ҵ��ʹ�õ��������
	 * 
	 * @return �������
	 */
	@XmlElement(name = "RunningSoftware")
	public String getRunningSoftwareName() {
		return runningSoftwareName;
	}

	/**
	 * ���ýڵ�����������ҵ��ʹ�õ��������
	 * 
	 * @param runningSoftwareName
	 *            �������
	 */
	public void setRunningSoftwareName(String runningSoftwareName) {
		this.runningSoftwareName = runningSoftwareName;
	}
}
