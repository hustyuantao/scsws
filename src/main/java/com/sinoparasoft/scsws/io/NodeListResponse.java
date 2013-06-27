package com.sinoparasoft.scsws.io;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * �ڵ��б���Ӧ
 * 
 * @author Ԭ��
 * @version 1.0
 */
@XmlRootElement(name = "GetNodeListResult")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class NodeListResponse {
	/**
	 * ��Ӧ״̬
	 */
	private Integer exitStatus;
	/**
	 * ��Ӧ��Ϣ
	 */
	private String message;
	/**
	 * �ڵ��б�
	 */
	private List<NodeBriefInformation> nodeList;

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
	 * ��ȡ�ڵ��б�
	 * 
	 * @return �ڵ��б�
	 */
	@XmlElement(name = "Node")
	public List<NodeBriefInformation> getNodeList() {
		return nodeList;
	}

	/**
	 * ���ýڵ��б�
	 * 
	 * @param nodeList
	 *            �ڵ��б�
	 */
	public void setNodeList(List<NodeBriefInformation> nodeList) {
		this.nodeList = nodeList;
	}
}
