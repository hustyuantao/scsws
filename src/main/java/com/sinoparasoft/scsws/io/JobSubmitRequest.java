package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ��ҵ�ύ������
 * 
 * @author Ԭ��
 */
@XmlRootElement(name = "SubmitJob")
public class JobSubmitRequest {
	/**
	 * ��ҵ����
	 */
	private String name;
	/**
	 * ��ҵ�ύ�û�����
	 */
	private String submitUserName;
	/**
	 * �û�������
	 */
	private String groupName;
	/**
	 * ��ҵִ���û�����
	 */
	private String execUserName;
	/**
	 * ��Ŀ����
	 */
	private String project;
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
	 * ������
	 */
	private String softwareLicense;
	/**
	 * ������
	 */
	private String command;
	/**
	 * ����Ĵ���������
	 */
	private Integer coresNum;
	/**
	 * �Ƿ��ռ�ڵ�
	 */
	private String exclusive;
	/**
	 * �Ƿ񽻻�
	 */
	private String interactive;
	/**
	 * ����Ŀ¼
	 */
	private String workDirectory;
	/**
	 * ��������
	 */
	private String queueName;

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
	 * ��ȡ��ҵ�ύ�û�����
	 * 
	 * @return ��ҵ�ύ�û�����
	 */
	@XmlElement(name = "UserName")
	public String getSubmitUserName() {
		return submitUserName;
	}

	/**
	 * ������ҵ�ύ�û�����
	 * 
	 * @param submitUserName
	 *            ��ҵ�ύ�û�����
	 */
	public void setSubmitUserName(String submitUserName) {
		this.submitUserName = submitUserName;
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
	 * ��ȡ��ҵִ���û�����
	 * 
	 * @return ��ҵִ���û�����
	 */
	@XmlElement(name = "RunAs")
	public String getExecUserName() {
		return execUserName;
	}

	/**
	 * ������ҵִ���û�����
	 * 
	 * @param execUserName
	 *            ��ҵִ���û�����
	 */
	public void setExecUserName(String execUserName) {
		this.execUserName = execUserName;
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
	 * ��ȡ������
	 * 
	 * @return ������
	 */
	@XmlElement(name = "SoftwareLicense")
	public String getSoftwareLicense() {
		return softwareLicense;
	}

	/**
	 * ����������
	 * 
	 * @param softwareLicense
	 *            ������
	 */
	public void setSoftwareLicense(String softwareLicense) {
		this.softwareLicense = softwareLicense;
	}

	/**
	 * ��ȡ������
	 * 
	 * @return ������
	 */
	@XmlElement(name = "CommandLine")
	public String getCommand() {
		return command;
	}

	/**
	 * ����������
	 * 
	 * @param command
	 *            ������
	 */
	public void setCommand(String command) {
		this.command = command;
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
	 * �Ƿ��ռ�ڵ�
	 * 
	 * @return �ǻ��
	 */
	@XmlElement(name = "Exclusive")
	public String getExclusive() {
		return exclusive;
	}

	/**
	 * �����Ƿ��ռ�ڵ�
	 * 
	 * @param exclusive
	 *            �ǻ��
	 */
	public void setExclusive(String exclusive) {
		this.exclusive = exclusive;
	}

	/**
	 * �Ƿ񽻻�
	 * 
	 * @return �ǻ��
	 */
	@XmlElement(name = "Interactive")
	public String getInteractive() {
		return interactive;
	}

	/**
	 * �����Ƿ񽻻�
	 * 
	 * @param interactive
	 *            �ǻ��
	 */
	public void setInteractive(String interactive) {
		this.interactive = interactive;
	}

	/**
	 * ��ȡ����Ŀ¼
	 * 
	 * @return ����Ŀ¼
	 */
	@XmlElement(name = "WorkDirectory")
	public String getWorkDirectory() {
		return workDirectory;
	}

	/**
	 * ���ù���Ŀ¼
	 * 
	 * @param workDirectory
	 *            ����Ŀ¼
	 */
	public void setWorkDirectory(String workDirectory) {
		this.workDirectory = workDirectory;
	}

	/**
	 * ��ȡ��������
	 * 
	 * @return ��������
	 */
	@XmlElement(name = "Queue")
	public String getQueueName() {
		return queueName;
	}

	/**
	 * ���ö�������
	 * 
	 * @param queueName
	 *            ��������
	 */
	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}
}
