package com.sinoparasoft.scsws.entity;

/**
 * 任务调度器队列类
 * 
 * @author 袁涛
 */
public class SchedQueue {
	/**
	 * 队列名称
	 */
	private String name;
	/**
	 * 队列描述
	 */
	private String description;
	/**
	 * 队列优先级
	 */
	private Integer priority;
	/**
	 * 允许运行作业的主机集合
	 */
	private String allowedHosts;
	/**
	 * 队列状态
	 */
	private Integer status;

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
	 * 获取队列描述
	 * 
	 * @return 队列描述
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 设置队列描述
	 * 
	 * @param description
	 *            队列描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 获取队列优先级
	 * 
	 * @return 队列优先级
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * 设置队列优先级
	 * 
	 * @param priority
	 *            队列优先级
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	/**
	 * 获取允许运行作业的主机集合
	 * 
	 * @return 允许运行作业的主机集合
	 */
	public String getAllowedHosts() {
		return allowedHosts;
	}

	/**
	 * 设置允许运行作业的主机集合
	 * 
	 * @param allowedHosts
	 *            允许运行作业的主机集合
	 */
	public void setAllowedHosts(String allowedHosts) {
		this.allowedHosts = allowedHosts;
	}

	/**
	 * 获取队列状态
	 * 
	 * @return 队列状态
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 设置队列状态
	 * 
	 * @param status
	 *            队列状态
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
}
