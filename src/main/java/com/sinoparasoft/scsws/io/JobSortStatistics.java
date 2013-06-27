package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 作业分组排序统计类
 * 
 * @author 袁涛
 */
@XmlRootElement(name = "Data")
@XmlType(propOrder = { "groupValue", "totalCpuTime", "totalWaitTime",
		"totalJobNum" })
public class JobSortStatistics {
	/**
	 * 分组属性值
	 */
	private String groupValue;
	/**
	 * 总的CPU时间
	 */
	private Float totalCpuTime;
	/**
	 * 总的等待时间
	 */
	private Float totalWaitTime;
	/**
	 * 作业总数
	 */
	private Integer totalJobNum;

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
	 * 获取总的CPU时间
	 * 
	 * @return 总的CPU时间
	 */
	@XmlElement(name = "TotalComputeTime")
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

	/**
	 * 获取总的等待时间
	 * 
	 * @return 总的等待时间
	 */
	@XmlElement(name = "TotalWaitTime")
	public Float getTotalWaitTime() {
		return totalWaitTime;
	}

	/**
	 * 设置总的等待时间
	 * 
	 * @param totalWaitTime
	 *            总的等待时间
	 */
	public void setTotalWaitTime(Float totalWaitTime) {
		this.totalWaitTime = totalWaitTime;
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
}
