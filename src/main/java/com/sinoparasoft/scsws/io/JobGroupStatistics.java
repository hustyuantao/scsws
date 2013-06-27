package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 作业分组统计
 * 
 * @author 袁涛
 */
@XmlRootElement(name = "Data")
@XmlType(propOrder = { "groupValue", "softwareName", "totalJobNum",
		"totalUsedTime", "totalCpuTime" })
public class JobGroupStatistics {
	/**
	 * 分组属性值
	 */
	private String groupValue;
	/**
	 * 软件名称
	 */
	private String softwareName;
	/**
	 * 作业总数
	 */
	private Integer totalJobNum;
	/**
	 * 总的使用时间
	 */
	private Float totalUsedTime;
	/**
	 * 总的CPU时间
	 */
	private Float totalCpuTime;

	/**
	 * 获取分组属性值
	 * 
	 * @return 分组属性值
	 */
	@XmlElement(name = "CountObj")
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
	 * 获取总的使用时间
	 * 
	 * @return 总的使用时间
	 */
	@XmlElement(name = "TotalUsingTime")
	public Float getTotalUsedTime() {
		return totalUsedTime;
	}

	/**
	 * 设置总的使用时间
	 * 
	 * @param totalUsedTime
	 *            总的使用时间
	 */
	public void setTotalUsedTime(Float totalUsedTime) {
		this.totalUsedTime = totalUsedTime;
	}

	/**
	 * 获取总的CPU时间
	 * 
	 * @return 总的CPU时间
	 */
	@XmlElement(name = "TotalCPUTime")
	public Float getTotalCpuTime() {
		return totalCpuTime;
	}

	/**
	 * 设置总的CPU时间
	 * 
	 * @param totalCpuTime
	 *            总的CPU时间
	 */
	public void setTotalCpuTime(Float totalCpuTime) {
		this.totalCpuTime = totalCpuTime;
	}
}
