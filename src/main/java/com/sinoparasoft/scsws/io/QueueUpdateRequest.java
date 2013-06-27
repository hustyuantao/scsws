package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * �����޸�����
 * 
 * @author Ԭ��
 */
@XmlRootElement(name = "SetQueueNodeMapping")
public class QueueUpdateRequest {
	/**
	 * ��������
	 */
	private String name;
	/**
	 * �ڵ������б�
	 */
	private String nodeList;
	/**
	 * ��������
	 */
	private String operation;

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

	/**
	 * ��ȡ��������
	 * 
	 * @return ��������
	 */
	@XmlElement(name = "Operation")
	public String getOperation() {
		return operation;
	}

	/**
	 * ���ò�������
	 * 
	 * @param operation
	 *            ��������
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}
}
