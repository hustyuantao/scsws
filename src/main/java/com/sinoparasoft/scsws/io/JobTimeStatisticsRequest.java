package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ��ҵʱ�η���ͳ������
 * 
 * @author Ԭ��
 * @version 1.0
 */
@XmlRootElement(name = "GetSoftwareResourceUtilizationAnalysis")
public class JobTimeStatisticsRequest {
	/**
	 * ������������
	 */
	private String groupName;
	/**
	 * ��������ֵ
	 */
	private String groupValue;
	/**
	 * ʱ�䵥λ
	 */
	private String timeUnit;
	/**
	 * ʱ����ֵ
	 */
	private Integer timeValue;
	/**
	 * ��ʼʱ��
	 */
	private String startTime;
	/**
	 * ����ʱ��
	 */
	private String endTime;

	/**
	 * ��ȡ������������
	 * 
	 * @return ������������
	 */
	@XmlElement(name = "GroupBy")
	public String getGroupName() {
		return groupName;
	}

	/**
	 * ���÷�����������
	 * 
	 * @param groupName
	 *            ������������
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * ��ȡ��������ֵ
	 * 
	 * @return ��������ֵ
	 */
	@XmlElement(name = "Filter")
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
	 * ��ȡʱ�䵥λ
	 * 
	 * @return ʱ�䵥λ
	 */
	@XmlElement(name = "TimeUnit")
	public String getTimeUnit() {
		return timeUnit;
	}

	/**
	 * ����ʱ�䵥λ
	 * 
	 * @param timeUnit
	 *            ʱ�䵥λ
	 */
	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
	}

	/**
	 * ��ȡʱ����ֵ
	 * 
	 * @return ʱ����ֵ
	 */
	@XmlElement(name = "TimeUnitNumber")
	public Integer getTimeValue() {
		return timeValue;
	}

	/**
	 * ����ʱ����ֵ
	 * 
	 * @param timeValue
	 *            ʱ����ֵ
	 */
	public void setTimeValue(Integer timeValue) {
		this.timeValue = timeValue;
	}

	/**
	 * ��ȡ��ʼʱ��
	 * 
	 * @return ��ʼʱ��
	 */
	@XmlElement(name = "StartDate")
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
	@XmlElement(name = "EndDate")
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
}
