package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * ��ҵ��������ͳ����
 * 
 * @author Ԭ��
 */
@XmlRootElement(name = "Data")
@XmlType(propOrder = { "groupValue", "totalCpuTime", "totalWaitTime",
		"totalJobNum" })
public class JobSortStatistics {
	/**
	 * ��������ֵ
	 */
	private String groupValue;
	/**
	 * �ܵ�CPUʱ��
	 */
	private Float totalCpuTime;
	/**
	 * �ܵĵȴ�ʱ��
	 */
	private Float totalWaitTime;
	/**
	 * ��ҵ����
	 */
	private Integer totalJobNum;

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
	 * ��ȡ�ܵ�CPUʱ��
	 * 
	 * @return �ܵ�CPUʱ��
	 */
	@XmlElement(name = "TotalComputeTime")
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
}
