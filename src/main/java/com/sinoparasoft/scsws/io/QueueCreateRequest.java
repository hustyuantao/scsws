package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ���д���������
 * 
 * @author Ԭ��
 * @version 1.0
 */
@XmlRootElement(name = "CreateQueue")
public class QueueCreateRequest {
	/**
	 * ��������
	 */
	private String name;
	/**
	 * ��������
	 */
	private String type;
	/**
	 * �Ƿ����
	 */
	private Integer enabled;
	/**
	 * �Ƿ�����
	 */
	private Integer started;

	/**
	 * ��ȡ��������
	 * 
	 * @return ��������
	 */
	@XmlElement(name = "QueueName")
	public String getName() {
		return name;
	}

	/**
	 * ���ö�������
	 * 
	 * @param name
	 *            ��������
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ��ȡ��������
	 * 
	 * @return ��������
	 */
	@XmlElement(name = "QueueType")
	public String getType() {
		return type;
	}

	/**
	 * ���ö�������
	 * 
	 * @param type
	 *            ��������
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * ��ȡ�Ƿ����
	 * 
	 * @return �Ƿ����
	 */
	@XmlElement(name = "Enabled")
	public Integer getEnabled() {
		return enabled;
	}

	/**
	 * �����Ƿ����
	 * 
	 * @param enabled
	 *            �Ƿ����
	 */
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	/**
	 * ��ȡ�Ƿ�����
	 * 
	 * @return �Ƿ�����
	 */
	@XmlElement(name = "Started")
	public Integer getStarted() {
		return started;
	}

	/**
	 * �����Ƿ�����
	 * 
	 * @param started
	 *            �Ƿ�����
	 */
	public void setStarted(Integer started) {
		this.started = started;
	}
}
