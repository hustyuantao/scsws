package com.sinoparasoft.scsws.io;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 队列列表响应类
 * 
 * @author 袁涛
 * @version 1.0
 */
@XmlRootElement(name = "GetQueueListResult")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class QueueListResponse {
	/**
	 * 响应状态
	 */
	private Integer exitStatus;
	/**
	 * 响应消息
	 */
	private String message;
	/**
	 * 队列列表
	 */
	private List<QueueBriefInformation> queueList;

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
	 * 获取队列列表
	 * 
	 * @return 队列列表
	 */
	@XmlElement(name = "Queue")
	public List<QueueBriefInformation> getQueueList() {
		return queueList;
	}

	/**
	 * 设置队列列表
	 * 
	 * @param queueList
	 *            队列列表
	 */
	public void setQueueList(List<QueueBriefInformation> queueList) {
		this.queueList = queueList;
	}
}
