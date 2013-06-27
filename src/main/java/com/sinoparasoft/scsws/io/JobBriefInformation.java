package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * ��ҵ������Ϣ
 * 
 * @author Ԭ��
 */
@XmlRootElement(name = "Job")
@XmlType(propOrder = { "id", "name", "userName", "state", "priority",
		"softwareName", "softwareVersion", "coresNum", "nodeList",
		"submitTime", "startTime", "endTime", "execWorkDirectory",
		"sambaWorkDirectory", "submitWorkDirectory" })
public class JobBriefInformation {
	/**
	 * ��ҵ���
	 */
	private Integer id;
	/**
	 * ��ҵ����
	 */
	private String name;
	/**
	 * �û�����
	 */
	private String userName;
	/**
	 * ��ҵ״̬
	 */
	private String state;
	/**
	 * ��ҵ���ȼ�
	 */
	private Integer priority;
	/**
	 * �������
	 */
	private String softwareName;
	/**
	 * ����汾
	 */
	private String softwareVersion;
	/**
	 * ����������
	 */
	private Integer coresNum;
	/**
	 * ��ҵ�ڵ��б�
	 */
	private String nodeList;
	/**
	 * ��ҵ�ύʱ��
	 */
	private String submitTime;
	/**
	 * ��ҵ��ʼʱ��
	 */
	private String startTime;
	/**
	 * ��ҵ����ʱ��
	 */
	private String endTime;
	/**
	 * ��ҵִ�й���Ŀ¼
	 */
	private String execWorkDirectory;
	/**
	 * ��ҵִ��Samba����Ŀ¼
	 */
	private String sambaWorkDirectory;
	/**
	 * ��ҵ�ύ����Ŀ¼
	 */
	private String submitWorkDirectory;

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
	 * ��ȡ��ҵ����
	 * 
	 * @return ��ҵ����
	 */
	@XmlElement(name = "JobName")
	public String getName() {
		return name;
	}

	/**
	 * ������ҵ����
	 * 
	 * @param name
	 *            ��ҵ����
	 */
	public void setName(String name) {
		this.name = name;
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
	 * ��ȡ��ҵ״̬
	 * 
	 * @return ��ҵ״̬
	 */
	@XmlElement(name = "State")
	public String getState() {
		return state;
	}

	/**
	 * ������ҵ״̬
	 * 
	 * @param state
	 *            ��ҵ״̬
	 */
	public void setState(String state) {
		this.state = state;
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
	 * ��ȡ����汾
	 * 
	 * @return ����汾
	 */
	@XmlElement(name = "SoftwareVersion")
	public String getSoftwareVersion() {
		return softwareVersion;
	}

	/**
	 * ��������汾
	 * 
	 * @param softwareVersion
	 *            ����汾
	 */
	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

	/**
	 * ��ȡ����������
	 * 
	 * @return ����������
	 */
	@XmlElement(name = "NumberOfCores")
	public Integer getCoresNum() {
		return coresNum;
	}

	/**
	 * ���ô���������
	 * 
	 * @param coresNum
	 *            ����������
	 */
	public void setCoresNum(Integer coresNum) {
		this.coresNum = coresNum;
	}

	/**
	 * ��ȡ��ҵ�ڵ��б�
	 * 
	 * @return ��ҵ�ڵ��б�
	 */
	@XmlElement(name = "AllocatedNodes")
	public String getNodeList() {
		return nodeList;
	}

	/**
	 * ������ҵ�ڵ��б�
	 * 
	 * @param nodeList
	 *            ��ҵ�ڵ��б�
	 */
	public void setNodeList(String nodeList) {
		this.nodeList = nodeList;
	}

	/**
	 * ��ȡ��ҵ�ύʱ��
	 * 
	 * @return ��ҵ�ύʱ��
	 */
	@XmlElement(name = "SubmitTime")
	public String getSubmitTime() {
		return submitTime;
	}

	/**
	 * ������ҵ�ύʱ��
	 * 
	 * @param submitTime
	 *            ��ҵ�ύʱ��
	 */
	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}

	/**
	 * ��ȡ��ҵ��ʼʱ��
	 * 
	 * @return ��ҵ��ʼʱ��
	 */
	@XmlElement(name = "StartTime")
	public String getStartTime() {
		return startTime;
	}

	/**
	 * ������ҵ��ʼʱ��
	 * 
	 * @param startTime
	 *            ��ҵ��ʼʱ��
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * ��ȡ��ҵ����ʱ��
	 * 
	 * @return ��ҵ����ʱ��
	 */
	@XmlElement(name = "EndTime")
	public String getEndTime() {
		return endTime;
	}

	/**
	 * ������ҵ����ʱ��
	 * 
	 * @param endTime
	 *            ��ҵ����ʱ��
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * ��ȡ��ҵִ�й���Ŀ¼
	 * 
	 * @return ��ҵִ�й���Ŀ¼
	 */
	@XmlElement(name = "LinuxWorkDirectory")
	public String getExecWorkDirectory() {
		return execWorkDirectory;
	}

	/**
	 * ������ҵִ�й���Ŀ¼
	 * 
	 * @param execWorkDirectory
	 *            ��ҵִ�й���Ŀ¼
	 */
	public void setExecWorkDirectory(String execWorkDirectory) {
		this.execWorkDirectory = execWorkDirectory;
	}

	/**
	 * ��ȡ��ҵִ��Samba����Ŀ¼
	 * 
	 * @return ��ҵִ��Samba����Ŀ¼
	 */
	@XmlElement(name = "SambaWorkDirectory")
	public String getSambaWorkDirectory() {
		return sambaWorkDirectory;
	}

	/**
	 * ������ҵִ��Samba����Ŀ¼
	 * 
	 * @param sambaWorkDirectory
	 *            ��ҵִ��Samba����Ŀ¼
	 */
	public void setSambaWorkDirectory(String sambaWorkDirectory) {
		this.sambaWorkDirectory = sambaWorkDirectory;
	}

	/**
	 * ��ȡ��ҵ�ύ����Ŀ¼
	 * 
	 * @return ��ҵ�ύ����Ŀ¼
	 */
	@XmlElement(name = "WindowsWorkDirectory")
	public String getSubmitWorkDirectory() {
		return submitWorkDirectory;
	}

	/**
	 * ������ҵ�ύ����Ŀ¼
	 * 
	 * @param submitWorkDirectory
	 *            ��ҵ�ύ����Ŀ¼
	 */
	public void setSubmitWorkDirectory(String submitWorkDirectory) {
		this.submitWorkDirectory = submitWorkDirectory;
	}
}
