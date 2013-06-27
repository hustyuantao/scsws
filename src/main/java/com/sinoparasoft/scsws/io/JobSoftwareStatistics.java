package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * ��ҵ���ʹ��ͳ����
 * 
 * @author Ԭ��
 */
@XmlRootElement(name = "Data")
@XmlType(propOrder = { "softwareName", "totalUsedTime", "totalCpuTime",
		"totalWaitTime" })
public class JobSoftwareStatistics {
	/**
	 * �������
	 */
	private String softwareName;
	/**
	 * �ܵ�ʹ��ʱ��
	 */
	private Float totalUsedTime;
	/**
	 * �ܵ�CPUʱ��
	 */
	private Float totalCpuTime;
	/**
	 * �ܵĵȴ�ʱ��
	 */
	private Float totalWaitTime;

	/**
	 * ��ȡ�������
	 * 
	 * @return �������
	 */
	@XmlElement(name = "SolverName")
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
	 * ��ȡ�ܵ�ʹ��ʱ��
	 * 
	 * @return �ܵ�ʹ��ʱ��
	 */
	@XmlElement(name = "TotalUseTime")
	public Float getTotalUsedTime() {
		return totalUsedTime;
	}

	/**
	 * �����ܵ�ʹ��ʱ��
	 * 
	 * @param totalUsedTime
	 *            �ܵ�ʹ��ʱ��
	 */
	public void setTotalUsedTime(Float totalUsedTime) {
		this.totalUsedTime = totalUsedTime;
	}

	/**
	 * ��ȡ�ܵ�CPUʱ��
	 * 
	 * @return �ܵ�CPUʱ��
	 */
	@XmlElement(name = "TotalCPUTime")
	public Float getTotalCpuTime() {
		return totalCpuTime;
	}

	/**
	 * �����ܵ�CPUʱ��
	 * 
	 * @param totalCpuTime
	 *            �ܵ�CPUʱ��
	 */
	public void setTotalCpuTime(Float totalCpuTime) {
		this.totalCpuTime = totalCpuTime;
	}

	/**
	 * ��ȡ�ܵĵȴ�ʱ��
	 * 
	 * @return �ܵĵȴ�ʱ��
	 */
	@XmlElement(name = "TotalWaitTime")
	public Float getTotalWaitTime() {
		return totalWaitTime;
	}

	/**
	 * �����ܵĵȴ�ʱ��
	 * 
	 * @param totalWaitTime
	 *            �ܵĵȴ�ʱ��
	 */
	public void setTotalWaitTime(Float totalWaitTime) {
		this.totalWaitTime = totalWaitTime;
	}
}
