package com.sinoparasoft.scsws.io;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 作业列表响应类
 * 
 * @author 袁涛
 * @version 1.0
 */
@XmlRootElement(name = "GetJobListResult")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class JobListResponse {
	/**
	 * 响应状态
	 */
	private Integer exitStatus;
	/**
	 * 响应消息
	 */
	private String message;
	/**
	 * 作业列表
	 */
	private List<JobBriefInformation> jobList;

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
	 * 获取作业列表
	 * 
	 * @return 作业列表
	 */
	@XmlElement(name = "Job")
	public List<JobBriefInformation> getJobList() {
		return jobList;
	}

	/**
	 * 设置作业列表
	 * 
	 * @param jobList
	 *            作业列表
	 */
	public void setJobList(List<JobBriefInformation> jobList) {
		this.jobList = jobList;
	}
}
