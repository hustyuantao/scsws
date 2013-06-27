package com.sinoparasoft.scsws.entity;

/**
 * 数据库表queue的实体类
 * 
 * @author 袁涛
 */
public class TableQueue {
	/**
	 * 队列名称
	 */
	private String name;
	/**
	 * 队列类型
	 */
	private String type;
	/**
	 * 队列使能
	 */
	private Boolean enabled;
	/**
	 * 队列开关
	 */
	private Boolean started;
	/**
	 * 队列是否指定节点
	 */
	private Boolean specified;
	/**
	 * 队列节点列表
	 */
	private String nodeList;

	/**
	 * 获取队列名称
	 * 
	 * @return 队列名称
	 */
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
	 * 获取队列使能
	 * 
	 * @return 是或否
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * 设置队列使能
	 * 
	 * @param enabled
	 *            是或否
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * 获取队列开关
	 * 
	 * @return 是或否
	 */
	public Boolean getStarted() {
		return started;
	}

	/**
	 * 设置是或否
	 * 
	 * @param started
	 *            是或否
	 */
	public void setStarted(Boolean started) {
		this.started = started;
	}

	/**
	 * 获取队列是否指定节点
	 * 
	 * @return 是或否
	 */
	public Boolean getSpecified() {
		return specified;
	}

	/**
	 * 设置队列是否指定节点
	 * 
	 * @param specified
	 *            是或否
	 */
	public void setSpecified(Boolean specified) {
		this.specified = specified;
	}

	/**
	 * 获取队列节点列表
	 * 
	 * @return 队列节点列表
	 */
	public String getNodeList() {
		return nodeList;
	}

	/**
	 * 设置队列节点列表
	 * 
	 * @param nodeList
	 *            队列节点列表
	 */
	public void setNodeList(String nodeList) {
		this.nodeList = nodeList;
	}
}
