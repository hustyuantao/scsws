package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * �ڵ���Ϣ�޸�������
 * 
 * @author Ԭ��
 */
@XmlRootElement(name = "ChangeNodeState")
public class NodeUpdateRequest {
	/**
	 * �ڵ�����
	 */
	private String name;
	/**
	 * �ڵ�״̬
	 */
	private String state;

	/**
	 * ��ȡ�ڵ�����
	 * 
	 * @return �ڵ�����
	 */
	@XmlElement(name = "NodeName")
	public String getName() {
		return name;
	}

	/**
	 * ���ýڵ�����
	 * 
	 * @param name
	 *            �ڵ�����
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ��ȡ�ڵ�״̬
	 * 
	 * @return �ڵ�״̬
	 */
	@XmlElement(name = "State")
	public String getState() {
		return state;
	}

	/**
	 * ���ýڵ�״̬
	 * 
	 * @param state
	 *            �ڵ�״̬
	 */
	public void setState(String state) {
		this.state = state;
	}
}
