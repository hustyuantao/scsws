package com.sinoparasoft.scsws.entity;

/**
 * ���������������
 * 
 * @author Ԭ��
 */
public class SchedNode {
	/**
	 * ��������
	 */
	private String name;
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
	 * ������������
	 * 
	 * @param name
	 *            ��������
	 */
	public void setName(String name) {
		this.name = name;
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
	 * ��������״̬
	 * 
	 * @param status
	 *            ����״̬
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
}
