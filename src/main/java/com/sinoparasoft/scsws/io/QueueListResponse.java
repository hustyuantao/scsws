package com.sinoparasoft.scsws.io;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * �����б���Ӧ��
 * 
 * @author Ԭ��
 * @version 1.0
 */
@XmlRootElement(name = "GetQueueListResult")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class QueueListResponse {
	/**
	 * ��Ӧ״̬
	 */
	private Integer exitStatus;
	/**
	 * ��Ӧ��Ϣ
	 */
	private String message;
	/**
	 * �����б�
	 */
	private List<QueueBriefInformation> queueList;

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
	 * ��ȡ�����б�
	 * 
	 * @return �����б�
	 */
	@XmlElement(name = "Queue")
	public List<QueueBriefInformation> getQueueList() {
		return queueList;
	}

	/**
	 * ���ö����б�
	 * 
	 * @param queueList
	 *            �����б�
	 */
	public void setQueueList(List<QueueBriefInformation> queueList) {
		this.queueList = queueList;
	}
}
