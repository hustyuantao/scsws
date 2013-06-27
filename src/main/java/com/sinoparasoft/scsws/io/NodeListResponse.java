package com.sinoparasoft.scsws.io;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 节点列表响应
 * 
 * @author 袁涛
 * @version 1.0
 */
@XmlRootElement(name = "GetNodeListResult")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class NodeListResponse {
	/**
	 * 响应状态
	 */
	private Integer exitStatus;
	/**
	 * 响应消息
	 */
	private String message;
	/**
	 * 节点列表
	 */
	private List<NodeBriefInformation> nodeList;

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
	 * 获取节点列表
	 * 
	 * @return 节点列表
	 */
	@XmlElement(name = "Node")
	public List<NodeBriefInformation> getNodeList() {
		return nodeList;
	}

	/**
	 * 设置节点列表
	 * 
	 * @param nodeList
	 *            节点列表
	 */
	public void setNodeList(List<NodeBriefInformation> nodeList) {
		this.nodeList = nodeList;
	}
}
