package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 节点负载类
 * 
 * @author 袁涛
 * @version 1.0
 */
@XmlRootElement(name = "Data")
@XmlType(propOrder = { "nodeName", "totalTime", "totalFreeTime", "totalRunTime" })
public class NodeLoad {
	/**
	 * 主机名称
	 */
	private String nodeName;
	/**
	 * 总时间
	 */
	private Float totalTime;
	/**
	 * 总的空闲时间
	 */
	private Float totalFreeTime;
	/**
	 * 总的运行时间
	 */
	private Float totalRunTime;

	/**
	 * 获取主机名称
	 * 
	 * @return 主机名称
	 */
	@XmlElement(name = "NodeName")
	public String getNodeName() {
		return nodeName;
	}

	/**
	 * 设置主机名称
	 * 
	 * @param nodeName
	 *            主机名称
	 */
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	/**
	 * 获取总时间
	 * 
	 * @return 总时间
	 */
	@XmlElement(name = "TotalTime")
	public Float getTotalTime() {
		return totalTime;
	}

	/**
	 * 设置总时间
	 * 
	 * @param totalTime
	 *            总时间
	 */
	public void setTotalTime(Float totalTime) {
		this.totalTime = totalTime;
	}

	/**
	 * 获取总的空闲时间
	 * 
	 * @return 总的空闲时间
	 */
	@XmlElement(name = "FreeTime")
	public Float getTotalFreeTime() {
		return totalFreeTime;
	}

	/**
	 * 设置总的空闲时间
	 * 
	 * @param totalFreeTime
	 *            总的空闲时间
	 */
	public void setTotalFreeTime(Float totalFreeTime) {
		this.totalFreeTime = totalFreeTime;
	}

	/**
	 * 获取总的运行时间
	 * 
	 * @return 总的运行时间
	 */
	@XmlElement(name = "TotalUseTime")
	public Float getTotalRunTime() {
		return totalRunTime;
	}

	/**
	 * 设置总的运行时间
	 * 
	 * @param totalRunTime
	 *            总的运行时间
	 */
	public void setTotalRunTime(Float totalRunTime) {
		this.totalRunTime = totalRunTime;
	}
}
