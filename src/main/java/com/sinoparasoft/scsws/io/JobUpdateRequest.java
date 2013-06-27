package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ��ҵ�޸�������
 * 
 * @author Ԭ��
 * @version 1.0
 */
@XmlRootElement(name = "ChangeJobPriority")
public class JobUpdateRequest {
	/**
	 * ��ҵ���
	 */
	private Integer id;
	/**
	 * ��ҵ���ȼ�
	 */
	private Integer priority;

	/**
	 * ��ȡ��ҵ���
	 * 
	 * @return ��ҵ���
	 */
	@XmlElement(name = "JobId")
	public Integer getId() {
		return id;
	}

	/**
	 * ������ҵ���
	 * 
	 * @param id
	 *            ��ҵ���
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * ��ȡ��ҵ���ȼ�
	 * 
	 * @return ��ҵ���ȼ�
	 */
	@XmlElement(name = "Priority")
	public Integer getPriority() {
		return priority;
	}

	/**
	 * ������ҵ���ȼ�
	 * 
	 * @param priority
	 *            ��ҵ���ȼ�
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
}
