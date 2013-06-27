package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 作业修改请求类
 * 
 * @author 袁涛
 * @version 1.0
 */
@XmlRootElement(name = "ChangeJobPriority")
public class JobUpdateRequest {
	/**
	 * 作业编号
	 */
	private Integer id;
	/**
	 * 作业优先级
	 */
	private Integer priority;

	/**
	 * 获取作业编号
	 * 
	 * @return 作业编号
	 */
	@XmlElement(name = "JobId")
	public Integer getId() {
		return id;
	}

	/**
	 * 设置作业编号
	 * 
	 * @param id
	 *            作业编号
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取作业优先级
	 * 
	 * @return 作业优先级
	 */
	@XmlElement(name = "Priority")
	public Integer getPriority() {
		return priority;
	}

	/**
	 * 设置作业优先级
	 * 
	 * @param priority
	 *            作业优先级
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
}
