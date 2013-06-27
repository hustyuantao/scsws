package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 作业时段分组统计
 * 
 * @author 袁涛
 */
@XmlRootElement(name = "Data")
@XmlType(propOrder = { "startTime", "endTime", "groupValue", "totalJobNum",
		"totalDayNum", "avgRunTime", "avgWaitTime" })
public class JobTimeStatistics {
	/**
	 * 开始时间
	 */
	private String startTime;
	/**
	 * 结束时间
	 */
	private String endTime;
	/**
	 * 分组属性值
	 */
	private String groupValue;
	/**
	 * 作业总数
	 */
	private Integer totalJobNum;
	/**
	 * 总天数
	 */
	private Integer totalDayNum;
	/**
	 * 平均运行时间
	 */
	private Float avgRunTime;
	/**
	 * 平均等待时间
	 */
	private Float avgWaitTime;

	/**
	 * 获取开始时间
	 * 
	 * @return 开始时间
	 */
	@XmlElement(name = "TimeUnitStartDate")
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
	@XmlElement(name = "TimeUnitEndDate")
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

	/**
	 * 获取分组属性值
	 * 
	 * @return 分组属性值
	 */
	@XmlElement(name = "FilterName")
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
	 * 获取作业总数
	 * 
	 * @return 作业总数
	 */
	@XmlElement(name = "JobNum")
	public Integer getTotalJobNum() {
		return totalJobNum;
	}

	/**
	 * 设置作业总数
	 * 
	 * @param totalJobNum
	 *            作业总数
	 */
	public void setTotalJobNum(Integer totalJobNum) {
		this.totalJobNum = totalJobNum;
	}

	/**
	 * 获取总天数
	 * 
	 * @return 总天数
	 */
	@XmlElement(name = "DayNum")
	public Integer getTotalDayNum() {
		return totalDayNum;
	}

	/**
	 * 设置总天数
	 * 
	 * @param totalDayNum
	 *            总天数
	 */
	public void setTotalDayNum(Integer totalDayNum) {
		this.totalDayNum = totalDayNum;
	}

	/**
	 * 获取平均运行时间
	 * 
	 * @return 平均运行时间
	 */
	@XmlElement(name = "avgRunTime")
	public Float getAvgRunTime() {
		return avgRunTime;
	}

	/**
	 * 设置平均运行时间
	 * 
	 * @param avgRunTime
	 *            平均运行时间
	 */
	public void setAvgRunTime(Float avgRunTime) {
		this.avgRunTime = avgRunTime;
	}

	/**
	 * 获取平均等待时间
	 * 
	 * @return 平均等待时间
	 */
	@XmlElement(name = "avgWaitTime")
	public Float getAvgWaitTime() {
		return avgWaitTime;
	}

	/**
	 * 设置平均等待时间
	 * 
	 * @param avgWaitTime
	 *            平均等待时间
	 */
	public void setAvgWaitTime(Float avgWaitTime) {
		this.avgWaitTime = avgWaitTime;
	}
}
