package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * ��ҵ����ͳ��
 * 
 * @author Ԭ��
 */
@XmlRootElement(name = "Data")
@XmlType(propOrder = { "groupValue", "softwareName", "totalJobNum",
		"totalUsedTime", "totalCpuTime" })
public class JobGroupStatistics {
	/**
	 * ��������ֵ
	 */
	private String groupValue;
	/**
	 * �������
	 */
	private String softwareName;
	/**
	 * ��ҵ����
	 */
	private Integer totalJobNum;
	/**
	 * �ܵ�ʹ��ʱ��
	 */
	private Float totalUsedTime;
	/**
	 * �ܵ�CPUʱ��
	 */
	private Float totalCpuTime;

	/**
	 * ��ȡ��������ֵ
	 * 
	 * @return ��������ֵ
	 */
	@XmlElement(name = "CountObj")
	public String getGroupValue() {
		return groupValue;
	}

	/**
	 * ���÷�������ֵ
	 * 
	 * @param groupValue
	 *            ��������ֵ
	 */
	public void setGroupValue(String groupValue) {
		this.groupValue = groupValue;
	}

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
	 * ��ȡ��ҵ����
	 * 
	 * @return ��ҵ����
	 */
	@XmlElement(name = "JobNum")
	public Integer getTotalJobNum() {
		return totalJobNum;
	}

	/**
	 * ������ҵ����
	 * 
	 * @param totalJobNum
	 *            ��ҵ����
	 */
	public void setTotalJobNum(Integer totalJobNum) {
		this.totalJobNum = totalJobNum;
	}

	/**
	 * ��ȡ�ܵ�ʹ��ʱ��
	 * 
	 * @return �ܵ�ʹ��ʱ��
	 */
	@XmlElement(name = "TotalUsingTime")
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
}
