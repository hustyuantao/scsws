package com.sinoparasoft.scsws.entity;

import java.sql.Timestamp;

/**
 * ���ݿ��job��ʵ����
 * 
 * @author Ԭ��
 */
public class TableJob {
	/**
	 * ��ҵ״̬����
	 */
	public static final String STAT_QUEUED = "Queued";
	public static final String STAT_FINISHED = "Finished";
	public static final String STAT_RUNNING = "Running";
	public static final String STAT_FAILED = "Failed";
	public static final String STAT_CANCELED = "Canceled";
	public static final String STAT_UNKNOWN = "Unknown";
	/**
	 * ��ҵ���
	 */
	private Integer id;
	/**
	 * ��ҵ����
	 */
	private String name;
	/**
	 * ��ҵִ���û�����
	 */
	private String execUser;
	/**
	 * ��ҵ�ύ�û�����
	 */
	private String submitUser;
	/**
	 * �û�������
	 */
	private String group;
	/**
	 * ������
	 */
	private String command;
	/**
	 * ��Ŀ����
	 */
	private String project;
	/**
	 * ��ҵ���ȼ�
	 */
	private Integer priority;
	/**
	 * ��������
	 */
	private String queue;
	/**
	 * ��ҵ�Ƿ��ռ�ڵ�
	 */
	private Boolean exclusive;
	/**
	 * ��ҵִ�й���Ŀ¼
	 */
	private String execWorkDirectory;
	/**
	 * ��ҵ�ύ����Ŀ¼
	 */
	private String submitWorkDirectory;
	/**
	 * ��ҵ������Ŀ¼
	 */
	private String sambaWorkDirectory;
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
	 * ��ҵʹ�õĴ���������
	 */
	private Integer coresNum;
	/**
	 * ��ҵ����Ľڵ��б�
	 */
	private String requestedNodes;
	/**
	 * ��ҵ״̬
	 */
	private String status;
	/**
	 * ��ҵʹ�õ�CPUʱ��
	 */
	private Float cpuTime;
	/**
	 * ��ҵʹ�õ�ǽ��ʱ��
	 */
	private Float wallTime;
	/**
	 * ��ҵʹ�õ��ڴ��С
	 */
	private Integer memory;
	/**
	 * ��ҵ����Ľڵ��б�
	 */
	private String allocatedNodes;
	/**
	 * ��ҵ�˳�״̬��
	 */
	private Integer exitStatus;
	/**
	 * ��ҵ�ύʱ��
	 */
	private Timestamp submitTime;
	/**
	 * ��ҵ��ʼʱ��
	 */
	private Timestamp startTime;
	/**
	 * ��ҵ���ʱ��
	 */
	private Timestamp endTime;
	/**
	 * ��ҵ��Ϣ����ʱ��
	 */
	private Timestamp modifiedTime;
	/**
	 * ��ҵɾ�����
	 */
	private Boolean deletedFlag;

	/**
	 * ��ȡ��ҵ���
	 * 
	 * @return ��ҵ���
	 */
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
	 * ��ȡ��ҵִ���û�����
	 * 
	 * @return ��ҵִ���û�����
	 */
	public String getExecUser() {
		return execUser;
	}

	/**
	 * ������ҵִ���û�����
	 * 
	 * @param execUser
	 *            ��ҵִ���û�����
	 */
	public void setExecUser(String execUser) {
		this.execUser = execUser;
	}

	/**
	 * ��ȡ��ҵ�ύ�û�����
	 * 
	 * @return ��ҵ�ύ�û�����
	 */
	public String getSubmitUser() {
		return submitUser;
	}

	/**
	 * ������ҵ�ύ�û�����
	 * 
	 * @param submitUser
	 *            ��ҵ�ύ�û�����
	 */
	public void setSubmitUser(String submitUser) {
		this.submitUser = submitUser;
	}

	/**
	 * ��ȡ�û�������
	 * 
	 * @return �û�������
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * �����û�������
	 * 
	 * @param group
	 *            �û�������
	 */
	public void setGroup(String group) {
		this.group = group;
	}

	/**
	 * ��ȡ������
	 * 
	 * @return ������
	 */
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
	 * ��ȡ��Ŀ����
	 * 
	 * @return ��Ŀ����
	 */
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
	 * ��ȡ��������
	 * 
	 * @return ��������
	 */
	public String getQueue() {
		return queue;
	}

	/**
	 * ���ö�������
	 * 
	 * @param queue
	 *            ��������
	 */
	public void setQueue(String queue) {
		this.queue = queue;
	}

	/**
	 * ��ȡ��ҵ�Ƿ��ռ�ڵ�
	 * 
	 * @return �ǻ��
	 */
	public Boolean getExclusive() {
		return exclusive;
	}

	/**
	 * ������ҵ�Ƿ��ռ�ڵ�
	 * 
	 * @param exclusive
	 *            �ǻ��
	 */
	public void setExclusive(Boolean exclusive) {
		this.exclusive = exclusive;
	}

	/**
	 * ��ȡ��ҵִ�й���Ŀ¼
	 * 
	 * @return ��ҵִ�й���Ŀ¼
	 */
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
	 * ��ȡ��ҵ�ύ����Ŀ¼
	 * 
	 * @return ��ҵ�ύ����Ŀ¼
	 */
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
	 * ��ȡ��ҵ������Ŀ¼
	 * 
	 * @return ��ҵ������Ŀ¼
	 */
	public String getSambaWorkDirectory() {
		return sambaWorkDirectory;
	}

	/**
	 * ������ҵ������Ŀ¼
	 * 
	 * @param sambaWorkDirectory
	 *            ��ҵ������Ŀ¼
	 */
	public void setSambaWorkDirectory(String sambaWorkDirectory) {
		this.sambaWorkDirectory = sambaWorkDirectory;
	}

	/**
	 * ��ȡ�������
	 * 
	 * @return �������
	 */
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
	 * ��ȡ��ҵʹ�õĴ���������
	 * 
	 * @return ��ҵʹ�õĴ���������
	 */
	public Integer getCoresNum() {
		return coresNum;
	}

	/**
	 * ������ҵʹ�õĴ���������
	 * 
	 * @param coresNum
	 *            ��ҵʹ�õĴ���������
	 */
	public void setCoresNum(Integer coresNum) {
		this.coresNum = coresNum;
	}

	/**
	 * ��ȡ��ҵ����Ľڵ��б�
	 * 
	 * @return ��ҵ����Ľڵ��б�
	 */
	public String getRequestedNodes() {
		return requestedNodes;
	}

	/**
	 * ������ҵ����Ľڵ��б�
	 * 
	 * @param requestedNodes
	 *            ��ҵ����Ľڵ��б�
	 */
	public void setRequestedNodes(String requestedNodes) {
		this.requestedNodes = requestedNodes;
	}

	/**
	 * ��ȡ��ҵ״̬
	 * 
	 * @return ��ҵ״̬
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * ������ҵ״̬
	 * 
	 * @param status
	 *            ��ҵ״̬
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * ��ȡ��ҵʹ�õ�CPUʱ��
	 * 
	 * @return ��ҵʹ�õ�CPUʱ��
	 */
	public Float getCpuTime() {
		return cpuTime;
	}

	/**
	 * ������ҵʹ�õ�CPUʱ��
	 * 
	 * @param cpuTime
	 *            ��ҵʹ�õ�CPUʱ��
	 */
	public void setCpuTime(Float cpuTime) {
		this.cpuTime = cpuTime;
	}

	/**
	 * ��ȡ��ҵʹ�õ�ǽ��ʱ��
	 * 
	 * @return ��ҵʹ�õ�ǽ��ʱ��
	 */
	public Float getWallTime() {
		return wallTime;
	}

	/**
	 * ������ҵʹ�õ�ǽ��ʱ��
	 * 
	 * @param wallTime
	 *            ��ҵʹ�õ�ǽ��ʱ��
	 */
	public void setWallTime(Float wallTime) {
		this.wallTime = wallTime;
	}

	/**
	 * ��ȡ��ҵʹ�õ��ڴ��С
	 * 
	 * @return ��ҵʹ�õ��ڴ��С
	 */
	public Integer getMemory() {
		return memory;
	}

	/**
	 * ������ҵʹ�õ��ڴ��С
	 * 
	 * @param memory
	 *            ��ҵʹ�õ��ڴ��С
	 */
	public void setMemory(Integer memory) {
		this.memory = memory;
	}

	/**
	 * ��ȡ��ҵ����Ľڵ��б�
	 * 
	 * @return ��ҵ����Ľڵ��б�
	 */
	public String getAllocatedNodes() {
		return allocatedNodes;
	}

	/**
	 * ������ҵ����Ľڵ��б�
	 * 
	 * @param allocatedNodes
	 *            ��ҵ����Ľڵ��б�
	 */
	public void setAllocatedNodes(String allocatedNodes) {
		this.allocatedNodes = allocatedNodes;
	}

	/**
	 * ��ȡ��ҵ�˳�״̬��
	 * 
	 * @return ��ҵ�˳�״̬��
	 */
	public Integer getExitStatus() {
		return exitStatus;
	}

	/**
	 * ������ҵ�˳�״̬��
	 * 
	 * @param exitStatus
	 *            ��ҵ�˳�״̬��
	 */
	public void setExitStatus(Integer exitStatus) {
		this.exitStatus = exitStatus;
	}

	/**
	 * ��ȡ��ҵ�ύʱ��
	 * 
	 * @return ��ҵ�ύʱ��
	 */
	public Timestamp getSubmitTime() {
		return submitTime;
	}

	/**
	 * ������ҵ�ύʱ��
	 * 
	 * @param submitTime
	 *            ��ҵ�ύʱ��
	 */
	public void setSubmitTime(Timestamp submitTime) {
		this.submitTime = submitTime;
	}

	/**
	 * ��ȡ��ҵ��ʼʱ��
	 * 
	 * @return ��ҵ��ʼʱ��
	 */
	public Timestamp getStartTime() {
		return startTime;
	}

	/**
	 * ������ҵ��ʼʱ��
	 * 
	 * @param startTime
	 *            ��ҵ��ʼʱ��
	 */
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	/**
	 * ��ȡ��ҵ���ʱ��
	 * 
	 * @return ��ҵ���ʱ��
	 */
	public Timestamp getEndTime() {
		return endTime;
	}

	/**
	 * ������ҵ���ʱ��
	 * 
	 * @param endTime
	 *            ��ҵ���ʱ��
	 */
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	/**
	 * ��ȡ��ҵ��Ϣ����ʱ��
	 * 
	 * @return ��ҵ��Ϣ����ʱ��
	 */
	public Timestamp getModifiedTime() {
		return modifiedTime;
	}

	/**
	 * ������ҵ��Ϣ����ʱ��
	 * 
	 * @param modifiedTime
	 *            ��ҵ��Ϣ����ʱ��
	 */
	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	/**
	 * ��ȡ��ҵɾ�����
	 * 
	 * @return ��ҵɾ�����
	 */
	public Boolean getDeletedFlag() {
		return deletedFlag;
	}

	/**
	 * ������ҵɾ�����
	 * 
	 * @param deletedFlag
	 *            ��ҵɾ�����
	 */
	public void setDeletedFlag(Boolean deletedFlag) {
		this.deletedFlag = deletedFlag;
	}
}
