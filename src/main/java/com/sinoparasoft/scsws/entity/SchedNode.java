package com.sinoparasoft.scsws.entity;

/**
 * 任务调度器主机类
 * 
 * @author 袁涛
 */
public class SchedNode {
	/**
	 * 主机名称
	 */
	private String name;
	/**
	 * 主机状态
	 */
	private Integer status;

	/**
	 * 获取主机名称
	 * 
	 * @return 主机名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置主机名称
	 * 
	 * @param name
	 *            主机名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取主机状态
	 * 
	 * @return 主机状态
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 设置主机状态
	 * 
	 * @param status
	 *            主机状态
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
}
