package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 集群统计信息响应类
 * 
 * @author 袁涛
 * @version 1.0
 */
@XmlRootElement(name = "GetClusterCounterResult")
@XmlType(propOrder = { "totalCoresNum", "unknownCoresNum", "downCoresNum",
		"offlineCoresNum", "onlineCoresNum", "freeCoresNum", "usedCoresNum" })
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class NodeStatisticsResponse {
	/**
	 * 响应状态
	 */
	private Integer exitStatus;
	/**
	 * 响应消息
	 */
	private String message;
	/**
	 * 集群处理器总核数
	 */
	private Integer totalCoresNum;
	/**
	 * 不明状态节点的核数
	 */
	private Integer unknownCoresNum;
	/**
	 * 关机状态节点的核数
	 */
	private Integer downCoresNum;
	/**
	 * 离线状态节点的核数
	 */
	private Integer offlineCoresNum;
	/**
	 * 在线状态节点的核数
	 */
	private Integer onlineCoresNum;
	/**
	 * 在线状态节点的空闲核数
	 */
	private Integer freeCoresNum;
	/**
	 * 在线状态节点的占用核数
	 */
	private Integer usedCoresNum;

	/**
	 * 获取响应状态
	 * 
	 * @return 响应状态
	 */
	@XmlAttribute(name = "ExitStatus")
	public Integer getExitStatus() {
		return exitStatus;
	}

	/**
	 * 设置响应状态
	 * 
	 * @param exitStatus
	 *            响应状态
	 */
	public void setExitStatus(Integer exitStatus) {
		this.exitStatus = exitStatus;
	}

	/**
	 * 获取响应消息
	 * 
	 * @return 响应消息
	 */
	@XmlAttribute(name = "Message")
	public String getMessage() {
		return message;
	}

	/**
	 * 设置响应消息
	 * 
	 * @param message
	 *            响应消息
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 获取集群处理器总核数
	 * 
	 * @return 集群处理器总核数
	 */
	@XmlElement(name = "TotalCores")
	public Integer getTotalCoresNum() {
		return totalCoresNum;
	}

	/**
	 * 设置集群处理器总核数
	 * 
	 * @param totalCoresNum
	 *            集群处理器总核数
	 */
	public void setTotalCoresNum(Integer totalCoresNum) {
		this.totalCoresNum = totalCoresNum;
	}

	/**
	 * 获取不明状态节点的核数
	 * 
	 * @return 不明状态节点的核数
	 */
	@XmlElement(name = "UnknownCores")
	public Integer getUnknownCoresNum() {
		return unknownCoresNum;
	}

	/**
	 * 设置不明状态节点的核数
	 * 
	 * @param unknownCoresNum
	 *            不明状态节点的核数
	 */
	public void setUnknownCoresNum(Integer unknownCoresNum) {
		this.unknownCoresNum = unknownCoresNum;
	}

	/**
	 * 获取关机状态节点的核数
	 * 
	 * @return 关机状态节点的核数
	 */
	@XmlElement(name = "DownCores")
	public Integer getDownCoresNum() {
		return downCoresNum;
	}

	/**
	 * 设置关机状态节点的核数
	 * 
	 * @param downCoresNum
	 *            关机状态节点的核数
	 */
	public void setDownCoresNum(Integer downCoresNum) {
		this.downCoresNum = downCoresNum;
	}

	/**
	 * 获取离线状态节点的核数
	 * 
	 * @return 离线状态节点的核数
	 */
	@XmlElement(name = "OfflineCores")
	public Integer getOfflineCoresNum() {
		return offlineCoresNum;
	}

	/**
	 * 设置离线状态节点的核数
	 * 
	 * @param offlineCoresNum
	 *            离线状态节点的核数
	 */
	public void setOfflineCoresNum(Integer offlineCoresNum) {
		this.offlineCoresNum = offlineCoresNum;
	}

	/**
	 * 获取在线状态节点的核数
	 * 
	 * @return 在线状态节点的核数
	 */
	@XmlElement(name = "OnlineCores")
	public Integer getOnlineCoresNum() {
		return onlineCoresNum;
	}

	/**
	 * 设置在线状态节点的核数
	 * 
	 * @param onlineCoresNum
	 *            在线状态节点的核数
	 */
	public void setOnlineCoresNum(Integer onlineCoresNum) {
		this.onlineCoresNum = onlineCoresNum;
	}

	/**
	 * 获取在线状态节点的空闲核数
	 * 
	 * @return 在线状态节点的空闲核数
	 */
	@XmlElement(name = "FreeCores")
	public Integer getFreeCoresNum() {
		return freeCoresNum;
	}

	/**
	 * 设置在线状态节点的空闲核数
	 * 
	 * @param freeCoresNum
	 *            在线状态节点的空闲核数
	 */
	public void setFreeCoresNum(Integer freeCoresNum) {
		this.freeCoresNum = freeCoresNum;
	}

	/**
	 * 获取在线状态节点的占用核数
	 * 
	 * @return 在线状态节点的占用核数
	 */
	@XmlElement(name = "UsedCores")
	public Integer getUsedCoresNum() {
		return usedCoresNum;
	}

	/**
	 * 设置在线状态节点的占用核数
	 * 
	 * @param usedCoresNum
	 *            在线状态节点的占用核数
	 */
	public void setUsedCoresNum(Integer usedCoresNum) {
		this.usedCoresNum = usedCoresNum;
	}
}
