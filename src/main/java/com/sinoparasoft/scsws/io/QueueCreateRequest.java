package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 队列创建请求类
 * 
 * @author 袁涛
 * @version 1.0
 */
@XmlRootElement(name = "CreateQueue")
public class QueueCreateRequest {
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
	 * 是否启用
	 */
	private Integer started;

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
	 * 获取队列类型
	 * 
	 * @return 队列类型
	 */
	@XmlElement(name = "QueueType")
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
	 * 获取是否可用
	 * 
	 * @return 是否可用
	 */
	@XmlElement(name = "Enabled")
	public Integer getEnabled() {
		return enabled;
	}

	/**
	 * 设置是否可用
	 * 
	 * @param enabled
	 *            是否可用
	 */
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	/**
	 * 获取是否启用
	 * 
	 * @return 是否启用
	 */
	@XmlElement(name = "Started")
	public Integer getStarted() {
		return started;
	}

	/**
	 * 设置是否启用
	 * 
	 * @param started
	 *            是否启用
	 */
	public void setStarted(Integer started) {
		this.started = started;
	}
}
