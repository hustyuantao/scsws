package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * ��ҵ��ϸ��Ϣ��Ӧ��
 * 
 * @author Ԭ��
 * @version 1.0
 */
@XmlRootElement(name = "GetJobInformationResult")
@XmlType(propOrder = { "id", "name", "submitUserName", "groupName",
		"execUserName", "state", "priority", "project", "softwareName",
		"softwareVersion", "coresNum", "interactive", "nodeList", "submitTime",
		"startTime", "endTime", "cpuTime", "memeorySize", "execWorkDirectory",
		"sambaWorkDirectory", "submitWorkDirectory", "command" })
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class JobDetailInformationResponse {
	/**
	 * ��Ӧ״̬
	 */
	private Integer exitStatus;
	/**
	 * ��Ӧ��Ϣ
	 */
	private String message;
	/**
	 * ��ҵ���
	 */
	private Integer id;
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
	 * ��ҵ״̬
	 */
	private String state;
	/**
	 * ��ҵ���ȼ�
	 */
	private Integer priority;
	/**
	 * ��Ŀ����
	 */
	private String project;
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
	 * �Ƿ񽻻�
	 */
	private Boolean interactive;
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
	 * ��ҵʹ�õ�CPUʱ��
	 */
	private Integer cpuTime;
	/**
	 * ��ҵʹ�õ��ڴ��С
	 */
	private Integer memeorySize;
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
	 * ��ҵ������
	 */
	private String command;

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
	 * �Ƿ񽻻�
	 * 
	 * @return �ǻ��
	 */
	@XmlElement(name = "Interactive")
	public Boolean getInteractive() {
		return interactive;
	}

	/**
	 * �����Ƿ񽻻�
	 * 
	 * @param interactive
	 *            �ǻ��
	 */
	public void setInteractive(Boolean interactive) {
		this.interactive = interactive;
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
	 * ��ȡ��ҵʹ�õ�CPUʱ��
	 * 
	 * @return ��ҵʹ�õ�CPUʱ��
	 */
	@XmlElement(name = "CpuTime")
	public Integer getCpuTime() {
		return cpuTime;
	}

	/**
	 * ������ҵʹ�õ�CPUʱ��
	 * 
	 * @param cpuTime
	 *            ��ҵʹ�õ�CPUʱ��
	 */
	public void setCpuTime(Integer cpuTime) {
		this.cpuTime = cpuTime;
	}

	/**
	 * ��ȡ��ҵʹ�õ��ڴ��С
	 * 
	 * @return ��ҵʹ�õ��ڴ��С
	 */
	@XmlElement(name = "Memory")
	public Integer getMemeorySize() {
		return memeorySize;
	}

	/**
	 * ������ҵʹ�õ��ڴ��С
	 * 
	 * @param memeorySize
	 *            ��ҵʹ�õ��ڴ��С
	 */
	public void setMemeorySize(Integer memeorySize) {
		this.memeorySize = memeorySize;
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

	/**
	 * ��ȡ��ҵ������
	 * 
	 * @return ��ҵ������
	 */
	@XmlElement(name = "CommandLine")
	public String getCommand() {
		return command;
	}

	/**
	 * ������ҵ������
	 * 
	 * @param command
	 *            ��ҵ������
	 */
	public void setCommand(String command) {
		this.command = command;
	}
}
