package com.sinoparasoft.scsws.entity;

import java.sql.Timestamp;

/**
 * 数据库表cluster的实体类
 * 
 * @author 袁涛
 */
public class TableCluster {
	/**
	 * 集群总核数
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
	 * 集群信息更新时间
	 */
	private Timestamp modifiedTime;

	/**
	 * 获取集群总核数
	 * 
	 * @return 集群总核数
	 */
	public Integer getTotalCoresNum() {
		return totalCoresNum;
	}

	/**
	 * 设置集群总核数
	 * 
	 * @param totalCoresNum
	 *            集群总核数
	 */
	public void setTotalCoresNum(Integer totalCoresNum) {
		this.totalCoresNum = totalCoresNum;
	}

	/**
	 * 获取不明状态节点的核数
	 * 
	 * @return 不明状态节点的核数
	 */
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

	/**
	 * 获取集群信息更新时间
	 * 
	 * @return 集群信息更新时间
	 */
	public Timestamp getModifiedTime() {
		return modifiedTime;
	}

	/**
	 * 设置集群信息更新时间
	 * 
	 * @param modifiedTime
	 *            集群信息更新时间
	 */
	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
}
