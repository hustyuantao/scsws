package com.sinoparasoft.scsws.io;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ��Ⱥ������Ӧ��
 * 
 * @author Ԭ��
 */
@XmlRootElement(name = "GetClusterNodeUseTimeResult")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class NodeLoadListResponse {
	/**
	 * ��Ӧ״̬
	 */
	private Integer exitStatus;
	/**
	 * ��Ӧ��Ϣ
	 */
	private String message;
	/**
	 * ��Ⱥ������Ϣ
	 */
	private List<NodeLoad> loadList;

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
	 * ��ȡ��Ⱥ������Ϣ
	 * 
	 * @return ��Ⱥ������Ϣ
	 */
	@XmlElement(name = "Data")
	public List<NodeLoad> getLoadList() {
		return loadList;
	}

	/**
	 * ���ü�Ⱥ������Ϣ
	 * 
	 * @param loadList
	 *            ��Ⱥ������Ϣ
	 */
	public void setLoadList(List<NodeLoad> loadList) {
		this.loadList = loadList;
	}
}
