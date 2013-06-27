package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * ������ϸ��Ϣ��Ӧ��
 * 
 * @author Ԭ��
 */
@XmlRootElement(name = "GetQueueInformationResult")
@XmlType(propOrder = { "name", "type", "enabled", "started", "specified",
		"nodeList" })
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class QueueDetailInformationResponse {
	/**
	 * ��Ӧ״̬
	 */
	private Integer exitStatus;
	/**
	 * ��Ӧ��Ϣ
	 */
	private String message;
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
	 * ��ȡ��Ӧ״̬
	 * 
	 * @return ��Ӧ״̬
	 */
	@XmlAttribute(name = "ExitStatus")
	public Integer getExitStatus() {
		return exitStatus;
	}

	/**
	 * ������Ӧ״̬
	 * 
	 * @param exitStatus
	 *            ��Ӧ״̬
	 */
	public void setExitStatus(Integer exitStatus) {
		this.exitStatus = exitStatus;
	}

	/**
	 * ��ȡ��Ӧ��Ϣ
	 * 
	 * @return ��Ӧ��Ϣ
	 */
	@XmlAttribute(name = "Message")
	public String getMessage() {
		return message;
	}

	/**
	 * ������Ӧ��Ϣ
	 * 
	 * @param message
	 *            ��Ӧ��Ϣ
	 */
	public void setMessage(String message) {
		this.message = message;
	}

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
	 * �����ǻ��
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
