package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ��ҵ��������ͳ��������
 * 
 * @author Ԭ��
 * @version 1.0
 */
@XmlRootElement(name = "GetSortOfResourceUtilizationAnalysis")
public class JobSortStatisticsRequest {
	/**
	 * ʱ�䵥λ
	 */
	private String timeUnit;
	/**
	 * ��ʼʱ��
	 */
	private String startTime;
	/**
	 * ����ʱ��
	 */
	private String endTime;
	/**
	 * ������������
	 */
	private String groupName;
	/**
	 * ������������
	 */
	private String orderName;

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

	/**
	 * ��ȡ������������
	 * 
	 * @return ������������
	 */
	@XmlElement(name = "Name")
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
	 * ��ȡ������������
	 * 
	 * @return ������������
	 */
	@XmlElement(name = "Order")
	public String getOrderName() {
		return orderName;
	}

	/**
	 * ����������������
	 * 
	 * @param orderName
	 *            ������������
	 */
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
}
