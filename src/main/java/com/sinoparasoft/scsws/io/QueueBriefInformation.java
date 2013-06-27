package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * ���м�����Ϣ��
 * 
 * @author Ԭ��
 * @version 1.0
 */
@XmlRootElement(name = "Queue")
@XmlType(propOrder = { "name", "type", "enabled", "started", "specified",
		"nodeList" })
public class QueueBriefInformation {
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
	 * �Ƿ�ʼ
	 */
	private Integer started;
	/**
	 * �Ƿ���ʾָ�����кͽڵ��ӳ���ϵ
	 */
	private Integer specified;
	/**
	 * �ڵ������б�
	 */
	private String nodeList;

	/**
	 * ��ȡ��������
	 * 
	 * @return ��������
	 */
	@XmlElement(name = "Name")
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
	@XmlElement(name = "Type")
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
	 * �Ƿ����
	 * 
	 * @return �ǻ��
	 */
	@XmlElement(name = "Enabled")
	public Integer getEnabled() {
		return enabled;
	}

	/**
	 * �����Ƿ����
	 * 
	 * @param enabled
	 *            �ǻ��
	 */
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	/**
	 * �Ƿ�ʼ
	 * 
	 * @return �ǻ��
	 */
	@XmlElement(name = "Started")
	public Integer getStarted() {
		return started;
	}

	/**
	 * �����Ƿ�ʼ
	 * 
	 * @param started
	 *            �ǻ��
	 */
	public void setStarted(Integer started) {
		this.started = started;
	}

	/**
	 * �Ƿ���ʾָ�����кͽڵ��ӳ���ϵ
	 * 
	 * @return �ǻ��
	 */
	@XmlElement(name = "ExplicitlySpecifyNode")
	public Integer getSpecified() {
		return specified;
	}

	/**
	 * �����Ƿ���ʾָ�����кͽڵ��ӳ���ϵ
	 * 
	 * @param specified
	 *            �ǻ��
	 */
	public void setSpecified(Integer specified) {
		this.specified = specified;
	}

	/**
	 * ��ȡ�ڵ������б�
	 * 
	 * @return �ڵ������б�
	 */
	@XmlElement(name = "Nodes")
	public String getNodeList() {
		return nodeList;
	}

	/**
	 * ���ýڵ������б�
	 * 
	 * @param nodeList
	 *            �ڵ������б�
	 */
	public void setNodeList(String nodeList) {
		this.nodeList = nodeList;
	}
}
