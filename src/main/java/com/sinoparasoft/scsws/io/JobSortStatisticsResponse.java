package com.sinoparasoft.scsws.io;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 作业分组排序统计响应类
 * 
 * @author 袁涛
 */
@XmlRootElement(name = "GetSortOfResourceUtilizationAnalysisResult")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class JobSortStatisticsResponse {
	/**
	 * 响应状态
	 */
	private Integer exitStatus;
	/**
	 * 响应消息
	 */
	private String message;
	/**
	 * 作业分组排序统计
	 */
	private List<JobSortStatistics> jobSortStatistics;

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
	 * 获取作业分组排序统计
	 * 
	 * @return 作业分组排序统计
	 */
	@XmlElement(name = "Data")
	public List<JobSortStatistics> getJobSortStatistics() {
		return jobSortStatistics;
	}

	/**
	 * 设置作业分组排序统计
	 * 
	 * @param jobSortStatistics
	 *            作业分组排序统计
	 */
	public void setJobSortStatistics(List<JobSortStatistics> jobSortStatistics) {
		this.jobSortStatistics = jobSortStatistics;
	}
}
