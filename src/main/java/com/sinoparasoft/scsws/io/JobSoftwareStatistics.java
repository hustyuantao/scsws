package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 作业软件使用统计类
 * 
 * @author 袁涛
 */
@XmlRootElement(name = "Data")
@XmlType(propOrder = { "softwareName", "totalUsedTime", "totalCpuTime",
		"totalWaitTime" })
public class JobSoftwareStatistics {
	/**
	 * 软件名称
	 */
	private String softwareName;
	/**
	 * 总的使用时间
	 */
	private Float totalUsedTime;
	/**
	 * 总的CPU时间
	 */
	private Float totalCpuTime;
	/**
	 * 总的等待时间
	 */
	private Float totalWaitTime;

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
	 * 获取总的使用时间
	 * 
	 * @return 总的使用时间
	 */
	@XmlElement(name = "TotalUseTime")
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
}
