package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 作业统计响应类
 * 
 * @author 袁涛
 */
@XmlRootElement(name = "GetJobCounterResult")
@XmlType(propOrder = { "queuedJobNum", "runningJobNum", "finishedJobNum",
		"failedJobNum", "canceledJobNum", "queuedCoresNum", "runningCoresNum",
		"finishedCoresNum", "failedCoresNum", "canceledCoresNum" })
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class JobStatisticsResponse {
	/**
	 * 响应状态
	 */
	private Integer exitStatus;
	/**
	 * 响应消息
	 */
	private String message;
	/**
	 * 排队作业数
	 */
	private Integer queuedJobNum;
	/**
	 * 运行作业数
	 */
	private Integer runningJobNum;
	/**
	 * 完成作业数
	 */
	private Integer finishedJobNum;
	/**
	 * 失败作业数
	 */
	private Integer failedJobNum;
	/**
	 * 取消作业数
	 */
	private Integer canceledJobNum;
	/**
	 * 排队作业处理器核数统计
	 */
	private Integer queuedCoresNum;
	/**
	 * 运行作业处理器核数统计
	 */
	private Integer runningCoresNum;
	/**
	 * 完成作业处理器核数统计
	 */
	private Integer finishedCoresNum;
	/**
	 * 失败作业处理器核数统计
	 */
	private Integer failedCoresNum;
	/**
	 * 取消作业处理器核数统计
	 */
	private Integer canceledCoresNum;

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
	 * 获取排队作业数
	 * 
	 * @return 排队作业数
	 */
	@XmlElement(name = "QueuedJobs")
	public Integer getQueuedJobNum() {
		return queuedJobNum;
	}

	/**
	 * 设置排队作业数
	 * 
	 * @param queuedJobNum
	 *            排队作业数
	 */
	public void setQueuedJobNum(Integer queuedJobNum) {
		this.queuedJobNum = queuedJobNum;
	}

	/**
	 * 获取运行作业数
	 * 
	 * @return 运行作业数
	 */
	@XmlElement(name = "RunningJobs")
	public Integer getRunningJobNum() {
		return runningJobNum;
	}

	/**
	 * 设置运行作业数
	 * 
	 * @param runningJobNum
	 *            运行作业数
	 */
	public void setRunningJobNum(Integer runningJobNum) {
		this.runningJobNum = runningJobNum;
	}

	/**
	 * 完成作业数
	 * 
	 * @return 完成作业数
	 */
	@XmlElement(name = "FinishedJobs")
	public Integer getFinishedJobNum() {
		return finishedJobNum;
	}

	/**
	 * 设置完成作业数
	 * 
	 * @param finishedJobNum
	 *            完成作业数
	 */
	public void setFinishedJobNum(Integer finishedJobNum) {
		this.finishedJobNum = finishedJobNum;
	}

	/**
	 * 获取失败作业数
	 * 
	 * @return 失败作业数
	 */
	@XmlElement(name = "FailedJobs")
	public Integer getFailedJobNum() {
		return failedJobNum;
	}

	/**
	 * 设置失败作业数
	 * 
	 * @param failedJobNum
	 *            失败作业数
	 */
	public void setFailedJobNum(Integer failedJobNum) {
		this.failedJobNum = failedJobNum;
	}

	/**
	 * 获取取消作业数
	 * 
	 * @return 取消作业数
	 */
	@XmlElement(name = "CanceledJobs")
	public Integer getCanceledJobNum() {
		return canceledJobNum;
	}

	/**
	 * 设置取消作业数
	 * 
	 * @param canceledJobNum
	 *            取消作业数
	 */
	public void setCanceledJobNum(Integer canceledJobNum) {
		this.canceledJobNum = canceledJobNum;
	}

	/**
	 * 获取排队作业处理器核数统计
	 * 
	 * @return 排队作业处理器核数统计
	 */
	@XmlElement(name = "QueuedCores")
	public Integer getQueuedCoresNum() {
		return queuedCoresNum;
	}

	/**
	 * 设置排队作业处理器核数统计
	 * 
	 * @param queuedCoresNum
	 *            排队作业处理器核数统计
	 */
	public void setQueuedCoresNum(Integer queuedCoresNum) {
		this.queuedCoresNum = queuedCoresNum;
	}

	/**
	 * 获取运行作业处理器核数统计
	 * 
	 * @return 运行作业处理器核数统计
	 */
	@XmlElement(name = "RunningCores")
	public Integer getRunningCoresNum() {
		return runningCoresNum;
	}

	/**
	 * 设置运行作业处理器核数统计
	 * 
	 * @param runningCoresNum
	 *            运行作业处理器核数统计
	 */
	public void setRunningCoresNum(Integer runningCoresNum) {
		this.runningCoresNum = runningCoresNum;
	}

	/**
	 * 获取完成作业处理器核数统计
	 * 
	 * @return 完成作业处理器核数统计
	 */
	@XmlElement(name = "FinishedCores")
	public Integer getFinishedCoresNum() {
		return finishedCoresNum;
	}

	/**
	 * 设置完成作业处理器核数统计
	 * 
	 * @param finishedCoresNum
	 *            完成作业处理器核数统计
	 */
	public void setFinishedCoresNum(Integer finishedCoresNum) {
		this.finishedCoresNum = finishedCoresNum;
	}

	/**
	 * 获取失败作业处理器核数统计
	 * 
	 * @return 失败作业处理器核数统计
	 */
	@XmlElement(name = "FailedCores")
	public Integer getFailedCoresNum() {
		return failedCoresNum;
	}

	/**
	 * 设置失败作业处理器核数统计
	 * 
	 * @param failedCoresNum
	 *            失败作业处理器核数统计
	 */
	public void setFailedCoresNum(Integer failedCoresNum) {
		this.failedCoresNum = failedCoresNum;
	}

	/**
	 * 获取取消作业处理器核数统计
	 * 
	 * @return 取消作业处理器核数统计
	 */
	@XmlElement(name = "CanceledCores")
	public Integer getCanceledCoresNum() {
		return canceledCoresNum;
	}

	/**
	 * 设置取消作业处理器核数统计
	 * 
	 * @param canceledCoresNum
	 *            取消作业处理器核数统计
	 */
	public void setCanceledCoresNum(Integer canceledCoresNum) {
		this.canceledCoresNum = canceledCoresNum;
	}
}
