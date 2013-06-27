package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 节点信息修改请求类
 * 
 * @author 袁涛
 */
@XmlRootElement(name = "ChangeNodeState")
public class NodeUpdateRequest {
	/**
	 * 节点名称
	 */
	private String name;
	/**
	 * 节点状态
	 */
	private String state;

	/**
	 * 获取节点名称
	 * 
	 * @return 节点名称
	 */
	@XmlElement(name = "NodeName")
	public String getName() {
		return name;
	}

	/**
	 * 设置节点名称
	 * 
	 * @param name
	 *            节点名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取节点状态
	 * 
	 * @return 节点状态
	 */
	@XmlElement(name = "State")
	public String getState() {
		return state;
	}

	/**
	 * 设置节点状态
	 * 
	 * @param state
	 *            节点状态
	 */
	public void setState(String state) {
		this.state = state;
	}
}
