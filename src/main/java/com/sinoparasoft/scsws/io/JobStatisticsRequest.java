package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ��ҵͳ��������
 * 
 * @author Ԭ��
 */
@XmlRootElement(name = "GetJobCounter")
public class JobStatisticsRequest {
	/**
	 * �û�����
	 */
	private String userName;
	/**
	 * �û�������
	 */
	private String groupName;
	/**
	 * ��Ŀ����
	 */
	private String project;

	/**
	 * ��ȡ�û�����
	 * 
	 * @return �û�����
	 */
	@XmlElement(name = "UserName")
	public String getUserName() {
		return userName;
	}

	/**
	 * �����û�����
	 * 
	 * @param userName
	 *            �û�����
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * ��ȡ�û�������
	 * 
	 * @return �û�������
	 */
	@XmlElement(name = "GroupName")
	public String getGroupName() {
		return groupName;
	}

	/**
	 * �����û�������
	 * 
	 * @param groupName
	 *            �û�������
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * ��ȡ��Ŀ����
	 * 
	 * @return ��Ŀ����
	 */
	@XmlElement(name = "Project")
	public String getProject() {
		return project;
	}

	/**
	 * ������Ŀ����
	 * 
	 * @param project
	 *            ��Ŀ����
	 */
	public void setProject(String project) {
		this.project = project;
	}
}
