package com.sinoparasoft.scsws.entity;

/**
 * ���������������
 * 
 * @author Ԭ��
 */
public class SchedQueue {
	/**
	 * ��������
	 */
	private String name;
	/**
	 * ��������
	 */
	private String description;
	/**
	 * �������ȼ�
	 */
	private Integer priority;
	/**
	 * ����������ҵ����������
	 */
	private String allowedHosts;
	/**
	 * ����״̬
	 */
	private Integer status;

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
	public String getDescription() {
		return description;
	}

	/**
	 * ���ö�������
	 * 
	 * @param description
	 *            ��������
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * ��ȡ�������ȼ�
	 * 
	 * @return �������ȼ�
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * ���ö������ȼ�
	 * 
	 * @param priority
	 *            �������ȼ�
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	/**
	 * ��ȡ����������ҵ����������
	 * 
	 * @return ����������ҵ����������
	 */
	public String getAllowedHosts() {
		return allowedHosts;
	}

	/**
	 * ��������������ҵ����������
	 * 
	 * @param allowedHosts
	 *            ����������ҵ����������
	 */
	public void setAllowedHosts(String allowedHosts) {
		this.allowedHosts = allowedHosts;
	}

	/**
	 * ��ȡ����״̬
	 * 
	 * @return ����״̬
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * ���ö���״̬
	 * 
	 * @param status
	 *            ����״̬
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
}
