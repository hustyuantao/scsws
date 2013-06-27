package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 作业时段分组统计请求
 * 
 * @author 袁涛
 * @version 1.0
 */
@XmlRootElement(name = "GetSoftwareResourceUtilizationAnalysis")
public class JobTimeStatisticsRequest {
	/**
	 * 分组属性名称
	 */
	private String groupName;
	/**
	 * 分组属性值
	 */
	private String groupValue;
	/**
	 * 时间单位
	 */
	private String timeUnit;
	/**
	 * 时间数值
	 */
	private Integer timeValue;
	/**
	 * 开始时间
	 */
	private String startTime;
	/**
	 * 结束时间
	 */
	private String endTime;

	/**
	 * 获取分组属性名称
	 * 
	 * @return 分组属性名称
	 */
	@XmlElement(name = "GroupBy")
	public String getGroupName() {
		return groupName;
	}

	/**
	 * 设置分组属性名称
	 * 
	 * @param groupName
	 *            分组属性名称
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * 获取分组属性值
	 * 
	 * @return 分组属性值
	 */
	@XmlElement(name = "Filter")
	public String getGroupValue() {
		return groupValue;
	}

	/**
	 * 设置分组属性值
	 * 
	 * @param groupValue
	 *            分组属性值
	 */
	public void setGroupValue(String groupValue) {
		this.groupValue = groupValue;
	}

	/**
	 * 获取时间单位
	 * 
	 * @return 时间单位
	 */
	@XmlElement(name = "TimeUnit")
	public String getTimeUnit() {
		return timeUnit;
	}

	/**
	 * 设置时间单位
	 * 
	 * @param timeUnit
	 *            时间单位
	 */
	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
	}

	/**
	 * 获取时间数值
	 * 
	 * @return 时间数值
	 */
	@XmlElement(name = "TimeUnitNumber")
	public Integer getTimeValue() {
		return timeValue;
	}

	/**
	 * 设置时间数值
	 * 
	 * @param timeValue
	 *            时间数值
	 */
	public void setTimeValue(Integer timeValue) {
		this.timeValue = timeValue;
	}

	/**
	 * 获取开始时间
	 * 
	 * @return 开始时间
	 */
	@XmlElement(name = "StartDate")
	public String getStartTime() {
		return startTime;
	}

	/**
	 * 设置开始时间
	 * 
	 * @param startTime
	 *            开始时间
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * 获取结束时间
	 * 
	 * @return 结束时间
	 */
	@XmlElement(name = "EndDate")
	public String getEndTime() {
		return endTime;
	}

	/**
	 * 设置结束时间
	 * 
	 * @param endTime
	 *            结束时间
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
}
