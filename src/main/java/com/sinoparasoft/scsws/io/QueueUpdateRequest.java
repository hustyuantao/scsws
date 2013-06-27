package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 队列修改请求
 * 
 * @author 袁涛
 */
@XmlRootElement(name = "SetQueueNodeMapping")
public class QueueUpdateRequest {
	/**
	 * 队列名称
	 */
	private String name;
	/**
	 * 节点名称列表
	 */
	private String nodeList;
	/**
	 * 操作名称
	 */
	private String operation;

	/**
	 * 获取队列名称
	 * 
	 * @return 队列名称
	 */
	@XmlElement(name = "QueueName")
	public String getName() {
		return name;
	}

	/**
	 * 设置队列名称
	 * 
	 * @param name
	 *            队列名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取节点名称列表
	 * 
	 * @return 节点名称列表
	 */
	@XmlElement(name = "Nodes")
	public String getNodeList() {
		return nodeList;
	}

	/**
	 * 设置节点名称列表
	 * 
	 * @param nodeList
	 *            节点名称列表
	 */
	public void setNodeList(String nodeList) {
		this.nodeList = nodeList;
	}

	/**
	 * 获取操作名称
	 * 
	 * @return 操作名称
	 */
	@XmlElement(name = "Operation")
	public String getOperation() {
		return operation;
	}

	/**
	 * 设置操作名称
	 * 
	 * @param operation
	 *            操作名称
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}
}
