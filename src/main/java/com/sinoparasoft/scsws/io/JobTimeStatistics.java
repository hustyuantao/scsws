package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * ��ҵʱ�η���ͳ��
 * 
 * @author Ԭ��
 */
@XmlRootElement(name = "Data")
@XmlType(propOrder = { "startTime", "endTime", "groupValue", "totalJobNum",
		"totalDayNum", "avgRunTime", "avgWaitTime" })
public class JobTimeStatistics {
	/**
	 * ��ʼʱ��
	 */
	private String startTime;
	/**
	 * ����ʱ��
	 */
	private String endTime;
	/**
	 * ��������ֵ
	 */
	private String groupValue;
	/**
	 * ��ҵ����
	 */
	private Integer totalJobNum;
	/**
	 * ������
	 */
	private Integer totalDayNum;
	/**
	 * ƽ������ʱ��
	 */
	private Float avgRunTime;
	/**
	 * ƽ���ȴ�ʱ��
	 */
	private Float avgWaitTime;

	/**
	 * ��ȡ��ʼʱ��
	 * 
	 * @return ��ʼʱ��
	 */
	@XmlElement(name = "TimeUnitStartDate")
	public String getStartTime() {
		return startTime;
	}

	/**
	 * ���ÿ�ʼʱ��
	 * 
	 * @param startTime
	 *            ��ʼʱ��
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * ��ȡ����ʱ��
	 * 
	 * @return ����ʱ��
	 */
	@XmlElement(name = "TimeUnitEndDate")
	public String getEndTime() {
		return endTime;
	}

	/**
	 * ���ý���ʱ��
	 * 
	 * @param endTime
	 *            ����ʱ��
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * ��ȡ��������ֵ
	 * 
	 * @return ��������ֵ
	 */
	@XmlElement(name = "FilterName")
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
	 * ��ȡ������
	 * 
	 * @return ������
	 */
	@XmlElement(name = "DayNum")
	public Integer getTotalDayNum() {
		return totalDayNum;
	}

	/**
	 * ����������
	 * 
	 * @param totalDayNum
	 *            ������
	 */
	public void setTotalDayNum(Integer totalDayNum) {
		this.totalDayNum = totalDayNum;
	}

	/**
	 * ��ȡƽ������ʱ��
	 * 
	 * @return ƽ������ʱ��
	 */
	@XmlElement(name = "avgRunTime")
	public Float getAvgRunTime() {
		return avgRunTime;
	}

	/**
	 * ����ƽ������ʱ��
	 * 
	 * @param avgRunTime
	 *            ƽ������ʱ��
	 */
	public void setAvgRunTime(Float avgRunTime) {
		this.avgRunTime = avgRunTime;
	}

	/**
	 * ��ȡƽ���ȴ�ʱ��
	 * 
	 * @return ƽ���ȴ�ʱ��
	 */
	@XmlElement(name = "avgWaitTime")
	public Float getAvgWaitTime() {
		return avgWaitTime;
	}

	/**
	 * ����ƽ���ȴ�ʱ��
	 * 
	 * @param avgWaitTime
	 *            ƽ���ȴ�ʱ��
	 */
	public void setAvgWaitTime(Float avgWaitTime) {
		this.avgWaitTime = avgWaitTime;
	}
}
