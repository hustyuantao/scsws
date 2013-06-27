package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 作业分组统计视图请求类
 * 
 * @author 袁涛
 */
@XmlRootElement(name = "GetSoftwareResourceUsageSummary")
public class JobGroupStatisticsRequest {
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
	 * 分组属性值
	 */
	private String groupValue;
	/**
	 * 软件名称
	 */
	private String softwareName;

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
	 * 获取软件名称
	 * 
	 * @return 软件名称
	 */
	@XmlElement(name = "SolverName")
	public String getSoftwareName() {
		return softwareName;
	}

	/**
	 * 设置软件名称
	 * 
	 * @param softwareName
	 *            软件名称
	 */
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
}
