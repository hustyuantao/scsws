package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ��ҵ�б�������
 * 
 * @author Ԭ��
 * @version 1.0
 */
@XmlRootElement(name = "GetJobList")
public class JobListRequest {
	/**
	 * ��ҵ����б�
	 */
	private String idList;
	/**
	 * �û�����
	 */
	private String userName;
	/**
	 * �û�������
	 */
	private String groupName;
	/**
	 * ��ҵ״̬�б�
	 */
	private String stateList;
	/**
	 * ��Ŀ����
	 */
	private String project;
	/**
	 * �������
	 */
	private String softwareName;
	/**
	 * ��ʼʱ��
	 */
	private String startTime;
	/**
	 * ����ʱ��
	 */
	private String endTime;
	/**
	 * ʱ����������
	 */
	private String timeType;

	/**
	 * ��ȡ��ҵ����б�
	 * 
	 * @return ��ҵ����б�
	 */
	@XmlElement(name = "JobId")
	public String getIdList() {
		return idList;
	}

	/**
	 * ������ҵ����б�
	 * 
	 * @param idList
	 *            ��ҵ����б�
	 */
	public void setIdList(String idList) {
		this.idList = idList;
	}

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
	 * ��ȡ��ҵ״̬�б�
	 * 
	 * @return ��ҵ״̬�б�
	 */
	@XmlElement(name = "State")
	public String getStateList() {
		return stateList;
	}

	/**
	 * ������ҵ״̬�б�
	 * 
	 * @param stateList
	 *            ��ҵ״̬�б�
	 */
	public void setStateList(String stateList) {
		this.stateList = stateList;
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

	/**
	 * ��ȡ�������
	 * 
	 * @return �������
	 */
	@XmlElement(name = "SoftwareName")
	public String getSoftwareName() {
		return softwareName;
	}

	/**
	 * �����������
	 * 
	 * @param softwareName
	 *            �������
	 */
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	/**
	 * ��ȡ��ʼʱ��
	 * 
	 * @return ��ʼʱ��
	 */
	@XmlElement(name = "StartTime")
	public String getStartTime() {
		return startTime;
	}

	/**
	 * ���ÿ�ʼʱ��
	 * 
	 * @param startTime
	 *            ��ʼʱ��
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * ��ȡ����ʱ��
	 * 
	 * @return ����ʱ��
	 */
	@XmlElement(name = "EndTime")
	public String getEndTime() {
		return endTime;
	}

	/**
	 * ���ý���ʱ��
	 * 
	 * @param endTime
	 *            ����ʱ��
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * ��ȡʱ����������
	 * 
	 * @return ʱ����������
	 */
	@XmlElement(name = "TimeType")
	public String getTimeType() {
		return timeType;
	}

	/**
	 * ����ʱ����������
	 * 
	 * @param timeType
	 *            ʱ����������
	 */
	public void setTimeType(String timeType) {
		this.timeType = timeType;
	}
}
