package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 队列详细信息响应类
 * 
 * @author 袁涛
 */
@XmlRootElement(name = "GetQueueInformationResult")
@XmlType(propOrder = { "name", "type", "enabled", "started", "specified",
		"nodeList" })
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class QueueDetailInformationResponse {
	/**
	 * 响应状态
	 */
	private Integer exitStatus;
	/**
	 * 响应消息
	 */
	private String message;
	/**
	 * 队列名称
	 */
	private String name;
	/**
	 * 队列类型
	 */
	private String type;
	/**
	 * 是否可用
	 */
	private Integer enabled;
	/**
	 * 是否开始
	 */
	private Integer started;
	/**
	 * 是否显示指明队列和节点的映射关系
	 */
	private Integer specified;
	/**
	 * 节点名称列表
	 */
	private String nodeList;

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
	 * 获取队列名称
	 * 
	 * @return 队列名称
	 */
	@XmlElement(name = "Name")
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
	 * 获取队列类型
	 * 
	 * @return 队列类型
	 */
	@XmlElement(name = "Type")
	public String getType() {
		return type;
	}

	/**
	 * 设置队列类型
	 * 
	 * @param type
	 *            队列类型
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 是否可用
	 * 
	 * @return 是或否
	 */
	@XmlElement(name = "Enabled")
	public Integer getEnabled() {
		return enabled;
	}

	/**
	 * 设置是否可用
	 * 
	 * @param enabled
	 *            是或否
	 */
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	/**
	 * 是否开始
	 * 
	 * @return 是或否
	 */
	@XmlElement(name = "Started")
	public Integer getStarted() {
		return started;
	}

	/**
	 * 设置是或否
	 * 
	 * @param started
	 *            是或否
	 */
	public void setStarted(Integer started) {
		this.started = started;
	}

	/**
	 * 是否显示指明队列和节点的映射关系
	 * 
	 * @return 是或否
	 */
	@XmlElement(name = "ExplicitlySpecifyNode")
	public Integer getSpecified() {
		return specified;
	}

	/**
	 * 设置是否显示指明队列和节点的映射关系
	 * 
	 * @param specified
	 *            是或否
	 */
	public void setSpecified(Integer specified) {
		this.specified = specified;
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
}
