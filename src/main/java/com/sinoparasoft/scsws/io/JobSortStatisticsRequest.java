package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 作业分组排序统计请求类
 * 
 * @author 袁涛
 * @version 1.0
 */
@XmlRootElement(name = "GetSortOfResourceUtilizationAnalysis")
public class JobSortStatisticsRequest {
	/**
	 * 时间单位
	 */
	private String timeUnit;
	/**
	 * 开始时间
	 */
	private String startTime;
	/**
	 * 结束时间
	 */
	private String endTime;
	/**
	 * 分组属性名称
	 */
	private String groupName;
	/**
	 * 排序属性名称
	 */
	private String orderName;

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

	/**
	 * 获取分组属性名称
	 * 
	 * @return 分组属性名称
	 */
	@XmlElement(name = "Name")
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
	 * 获取排序属性名称
	 * 
	 * @return 排序属性名称
	 */
	@XmlElement(name = "Order")
	public String getOrderName() {
		return orderName;
	}

	/**
	 * 设置排序属性名称
	 * 
	 * @param orderName
	 *            排序属性名称
	 */
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
}
