package com.sinoparasoft.scsws.entity;

/**
 * ���ݿ��queue��ʵ����
 * 
 * @author Ԭ��
 */
public class TableQueue {
	/**
	 * ��������
	 */
	private String name;
	/**
	 * ��������
	 */
	private String type;
	/**
	 * ����ʹ��
	 */
	private Boolean enabled;
	/**
	 * ���п���
	 */
	private Boolean started;
	/**
	 * �����Ƿ�ָ���ڵ�
	 */
	private Boolean specified;
	/**
	 * ���нڵ��б�
	 */
	private String nodeList;

	/**
	 * ��ȡ��������
	 * 
	 * @return ��������
	 */
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
	 * ��ȡ����ʹ��
	 * 
	 * @return �ǻ��
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * ���ö���ʹ��
	 * 
	 * @param enabled
	 *            �ǻ��
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * ��ȡ���п���
	 * 
	 * @return �ǻ��
	 */
	public Boolean getStarted() {
		return started;
	}

	/**
	 * �����ǻ��
	 * 
	 * @param started
	 *            �ǻ��
	 */
	public void setStarted(Boolean started) {
		this.started = started;
	}

	/**
	 * ��ȡ�����Ƿ�ָ���ڵ�
	 * 
	 * @return �ǻ��
	 */
	public Boolean getSpecified() {
		return specified;
	}

	/**
	 * ���ö����Ƿ�ָ���ڵ�
	 * 
	 * @param specified
	 *            �ǻ��
	 */
	public void setSpecified(Boolean specified) {
		this.specified = specified;
	}

	/**
	 * ��ȡ���нڵ��б�
	 * 
	 * @return ���нڵ��б�
	 */
	public String getNodeList() {
		return nodeList;
	}

	/**
	 * ���ö��нڵ��б�
	 * 
	 * @param nodeList
	 *            ���нڵ��б�
	 */
	public void setNodeList(String nodeList) {
		this.nodeList = nodeList;
	}
}
