package com.sinoparasoft.scsws.entity;

import java.util.Date;

/**
 * �����������ҵ��
 * 
 * @author Ԭ��
 */
public class SchedJob {
	/**
	 * ��ҵ���
	 */
	private Integer id;
	/**
	 * ��ҵ����
	 */
	private String name;
	/**
	 * ��ҵ����
	 */
	private String description;
	/**
	 * ��������
	 */
	private String queue;
	/**
	 * ����������
	 */
	private Integer coresNum;
	/**
	 * ��׼�����ļ�·��
	 */
	private String inputFilePath;
	/**
	 * ��׼����ļ�·��
	 */
	private String outputFilePath;
	/**
	 * ��������ļ�·��
	 */
	private String errorFilePath;
	/**
	 * ��ҵִ��Ԥ��������
	 */
	private String preCommand;
	/**
	 * ������
	 */
	private String command;
	/**
	 * ��ҵִ�к�������
	 */
	private String postCommand;
	/**
	 * ��Ŀ����
	 */
	private String project;
	/**
	 * ��ҵ���ȼ�
	 */
	private Integer priority;
	/**
	 * �ύ�û�����
	 */
	private String submitUserName;
	/**
	 * �ʼ��û�����
	 */
	private String mailUserName;
	/**
	 * ��ҵ������
	 */
	private String jobGroupName;
	/**
	 * �û�������
	 */
	private String userGroupName;
	/**
	 * ��ҵ״̬
	 */
	private Integer status;
	/**
	 * ��¼Shell
	 */
	private String loginShell;
	/**
	 * ��ҵ���̱��
	 */
	private Integer processId;
	/**
	 * ��ҵ�ύʱ��
	 */
	private Date submitTime;
	/**
	 * ��ҵԤ��ʱ��
	 */
	private Date reserveTime;
	/**
	 * ��ҵ��ʼʱ��
	 */
	private Date startTime;
	/**
	 * ��ҵԤ�ƿ�ʼʱ��
	 */
	private Date predictedStartTime;
	/**
	 * ��ҵ���ʱ��
	 */
	private Date endTime;
	/**
	 * ��ҵ����ʱ��
	 */
	private Integer duration;
	/**
	 * ��ҵCPUʱ��
	 */
	private Float cpuTime;
	/**
	 * ��ҵ�ڴ��С
	 */
	private Integer memorySize;
	/**
	 * ��ҵ�ύ����Ŀ¼
	 */
	private String submitWorkDirectory;
	/**
	 * ��ҵ�ύHOMEĿ¼
	 */
	private String submitHomeDirectory;
	/**
	 * ��ҵ�ύ��������
	 */
	private String submitHost;
	/**
	 * ��ҵִ����������
	 */
	private String execHosts;
	/**
	 * ��һִ��������CPU����
	 */
	private Float cpuFactor;
	/**
	 * ��ҵ�˳�״̬
	 */
	private Integer exitStatus;
	/**
	 * ��ҵִ���û����
	 */
	private Integer execUserId;
	/**
	 * ��ҵִ��HOMEĿ¼
	 */
	private String execHomeDirectory;
	/**
	 * ��ҵִ�й���Ŀ¼
	 */
	private String execWorkDirectory;
	/**
	 * ��ҵִ���û�����
	 */
	private String execUserName;
	/**
	 * ��ҵ��������ʱ��
	 */
	private Date updateTime;
	/**
	 * �Ƿ�Ϊ��ռ��ҵ
	 */
	private Boolean exclusive;

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
	 * ��ȡ��ҵ����
	 * 
	 * @return ��ҵ����
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * ������ҵ����
	 * 
	 * @param description
	 *            ��ҵ����
	 */
	public void setDescription(String description) {
		this.description = description;
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
	 * ��ȡ����������
	 * 
	 * @return ����������
	 */
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
	 * ��ȡ��׼�����ļ�·��
	 * 
	 * @return ��׼�����ļ�·��
	 */
	public String getInputFilePath() {
		return inputFilePath;
	}

	/**
	 * ���ñ�׼�����ļ�·��
	 * 
	 * @param inputFilePath
	 *            ��׼�����ļ�·��
	 */
	public void setInputFilePath(String inputFilePath) {
		this.inputFilePath = inputFilePath;
	}

	/**
	 * ��ȡ��׼����ļ�·��
	 * 
	 * @return ��׼����ļ�·��
	 */
	public String getOutputFilePath() {
		return outputFilePath;
	}

	/**
	 * ���ñ�׼����ļ�·��
	 * 
	 * @param outputFilePath
	 *            ��׼����ļ�·��
	 */
	public void setOutputFilePath(String outputFilePath) {
		this.outputFilePath = outputFilePath;
	}

	/**
	 * ��ȡ��������ļ�·��
	 * 
	 * @return ��������ļ�·��
	 */
	public String getErrorFilePath() {
		return errorFilePath;
	}

	/**
	 * ���ô�������ļ�·��
	 * 
	 * @param errorFilePath
	 *            ��������ļ�·��
	 */
	public void setErrorFilePath(String errorFilePath) {
		this.errorFilePath = errorFilePath;
	}

	/**
	 * ��ȡ��ҵִ��Ԥ��������
	 * 
	 * @return ��ҵִ��Ԥ��������
	 */
	public String getPreCommand() {
		return preCommand;
	}

	/**
	 * ������ҵִ��Ԥ��������
	 * 
	 * @param preCommand
	 *            ��ҵִ��Ԥ��������
	 */
	public void setPreCommand(String preCommand) {
		this.preCommand = preCommand;
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
	 * ��ȡ��ҵִ�к�������
	 * 
	 * @return ��ҵִ�к�������
	 */
	public String getPostCommand() {
		return postCommand;
	}

	/**
	 * ������ҵִ�к�������
	 * 
	 * @param postCommand
	 *            ��ҵִ�к�������
	 */
	public void setPostCommand(String postCommand) {
		this.postCommand = postCommand;
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
	 * ��ȡ�ύ�û�����
	 * 
	 * @return �ύ�û�����
	 */
	public String getSubmitUserName() {
		return submitUserName;
	}

	/**
	 * �����ύ�û�����
	 * 
	 * @param submitUserName
	 *            �ύ�û�����
	 */
	public void setSubmitUserName(String submitUserName) {
		this.submitUserName = submitUserName;
	}

	/**
	 * ��ȡ�ʼ��û�����
	 * 
	 * @return �ʼ��û�����
	 */
	public String getMailUserName() {
		return mailUserName;
	}

	/**
	 * �����ʼ��û�����
	 * 
	 * @param mailUserName
	 *            �ʼ��û�����
	 */
	public void setMailUserName(String mailUserName) {
		this.mailUserName = mailUserName;
	}

	/**
	 * ��ȡ��ҵ������
	 * 
	 * @return ��ҵ������
	 */
	public String getJobGroupName() {
		return jobGroupName;
	}

	/**
	 * ������ҵ������
	 * 
	 * @param jobGroupName
	 *            ��ҵ������
	 */
	public void setJobGroupName(String jobGroupName) {
		this.jobGroupName = jobGroupName;
	}

	/**
	 * ��ȡ�û�������
	 * 
	 * @return �û�������
	 */
	public String getUserGroupName() {
		return userGroupName;
	}

	/**
	 * �����û�������
	 * 
	 * @param userGroupName
	 *            �û�������
	 */
	public void setUserGroupName(String userGroupName) {
		this.userGroupName = userGroupName;
	}

	/**
	 * ��ȡ��ҵ״̬
	 * 
	 * @return ��ҵ״̬
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * ������ҵ״̬
	 * 
	 * @param status
	 *            ��ҵ״̬
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * ��ȡ��¼Shell
	 * 
	 * @return ��¼Shell
	 */
	public String getLoginShell() {
		return loginShell;
	}

	/**
	 * ���õ�¼Shell
	 * 
	 * @param loginShell
	 *            ��¼Shell
	 */
	public void setLoginShell(String loginShell) {
		this.loginShell = loginShell;
	}

	/**
	 * ��ȡ��ҵ���̱��
	 * 
	 * @return ��ҵ���̱��
	 */
	public Integer getProcessId() {
		return processId;
	}

	/**
	 * ������ҵ���̱��
	 * 
	 * @param processId
	 *            ��ҵ���̱��
	 */
	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	/**
	 * ��ȡ��ҵ�ύʱ��
	 * 
	 * @return ��ҵ�ύʱ��
	 */
	public Date getSubmitTime() {
		return submitTime;
	}

	/**
	 * ������ҵ�ύʱ��
	 * 
	 * @param submitTime
	 *            ��ҵ�ύʱ��
	 */
	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

	/**
	 * ��ȡ��ҵԤ��ʱ��
	 * 
	 * @return ��ҵԤ��ʱ��
	 */
	public Date getReserveTime() {
		return reserveTime;
	}

	/**
	 * ������ҵԤ��ʱ��
	 * 
	 * @param reserveTime
	 *            ��ҵԤ��ʱ��
	 */
	public void setReserveTime(Date reserveTime) {
		this.reserveTime = reserveTime;
	}

	/**
	 * ��ȡ��ҵ��ʼʱ��
	 * 
	 * @return ��ҵ��ʼʱ��
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * ������ҵ��ʼʱ��
	 * 
	 * @param startTime
	 *            ��ҵ��ʼʱ��
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * ��ȡ��ҵԤ�ƿ�ʼʱ��
	 * 
	 * @return ��ҵԤ�ƿ�ʼʱ��
	 */
	public Date getPredictedStartTime() {
		return predictedStartTime;
	}

	/**
	 * ������ҵԤ�ƿ�ʼʱ��
	 * 
	 * @param predictedStartTime
	 *            ��ҵԤ�ƿ�ʼʱ��
	 */
	public void setPredictedStartTime(Date predictedStartTime) {
		this.predictedStartTime = predictedStartTime;
	}

	/**
	 * ��ȡ��ҵ���ʱ��
	 * 
	 * @return ��ҵ���ʱ��
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * ������ҵ���ʱ��
	 * 
	 * @param endTime
	 *            ��ҵ���ʱ��
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * ��ȡ��ҵ����ʱ��
	 * 
	 * @return ��ҵ����ʱ��
	 */
	public Integer getDuration() {
		return duration;
	}

	/**
	 * ������ҵ����ʱ��
	 * 
	 * @param duration
	 *            ��ҵ����ʱ��
	 */
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	/**
	 * ��ȡ��ҵCPUʱ��
	 * 
	 * @return ��ҵCPUʱ��
	 */
	public Float getCpuTime() {
		return cpuTime;
	}

	/**
	 * ������ҵCPUʱ��
	 * 
	 * @param cpuTime
	 *            ��ҵCPUʱ��
	 */
	public void setCpuTime(Float cpuTime) {
		this.cpuTime = cpuTime;
	}

	/**
	 * ��ȡ��ҵ�ڴ��С
	 * 
	 * @return ��ҵ�ڴ��С
	 */
	public Integer getMemorySize() {
		return memorySize;
	}

	/**
	 * ������ҵ�ڴ��С
	 * 
	 * @param memorySize
	 *            ��ҵ�ڴ��С
	 */
	public void setMemorySize(Integer memorySize) {
		this.memorySize = memorySize;
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
	 * ��ȡ��ҵ�ύHOMEĿ¼
	 * 
	 * @return ��ҵ�ύHOMEĿ¼
	 */
	public String getSubmitHomeDirectory() {
		return submitHomeDirectory;
	}

	/**
	 * ������ҵ�ύHOMEĿ¼
	 * 
	 * @param submitHomeDirectory
	 *            ��ҵ�ύHOMEĿ¼
	 */
	public void setSubmitHomeDirectory(String submitHomeDirectory) {
		this.submitHomeDirectory = submitHomeDirectory;
	}

	/**
	 * ��ȡ��ҵ�ύ��������
	 * 
	 * @return ��ҵ�ύ��������
	 */
	public String getSubmitHost() {
		return submitHost;
	}

	/**
	 * ������ҵ�ύ��������
	 * 
	 * @param submitHost
	 *            ��ҵ�ύ��������
	 */
	public void setSubmitHost(String submitHost) {
		this.submitHost = submitHost;
	}

	/**
	 * ��ȡ��ҵִ����������
	 * 
	 * @return ��ҵִ����������
	 */
	public String getExecHosts() {
		return execHosts;
	}

	/**
	 * ������ҵִ����������
	 * 
	 * @param execHosts
	 *            ��ҵִ����������
	 */
	public void setExecHosts(String execHosts) {
		this.execHosts = execHosts;
	}

	/**
	 * ��ȡ��һִ��������CPU����
	 * 
	 * @return ��һִ��������CPU����
	 */
	public Float getCpuFactor() {
		return cpuFactor;
	}

	/**
	 * ���õ�һִ��������CPU����
	 * 
	 * @param cpuFactor
	 *            ��һִ��������CPU����
	 */
	public void setCpuFactor(Float cpuFactor) {
		this.cpuFactor = cpuFactor;
	}

	/**
	 * ��ȡ��ҵ�˳�״̬
	 * 
	 * @return ��ҵ�˳�״̬
	 */
	public Integer getExitStatus() {
		return exitStatus;
	}

	/**
	 * ������ҵ�˳�״̬
	 * 
	 * @param exitStatus
	 *            ��ҵ�˳�״̬
	 */
	public void setExitStatus(Integer exitStatus) {
		this.exitStatus = exitStatus;
	}

	/**
	 * ��ȡ��ҵִ���û����
	 * 
	 * @return ��ҵִ���û����
	 */
	public Integer getExecUserId() {
		return execUserId;
	}

	/**
	 * ������ҵִ���û����
	 * 
	 * @param execUserId
	 *            ��ҵִ���û����
	 */
	public void setExecUserId(Integer execUserId) {
		this.execUserId = execUserId;
	}

	/**
	 * ��ȡ��ҵִ��HOMEĿ¼
	 * 
	 * @return ��ҵִ��HOMEĿ¼
	 */
	public String getExecHomeDirectory() {
		return execHomeDirectory;
	}

	/**
	 * ������ҵִ��HOMEĿ¼
	 * 
	 * @param execHomeDirectory
	 *            ��ҵִ��HOMEĿ¼
	 */
	public void setExecHomeDirectory(String execHomeDirectory) {
		this.execHomeDirectory = execHomeDirectory;
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
	 * ��ȡ��ҵִ���û�����
	 * 
	 * @return ��ҵִ���û�����
	 */
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
	 * ��ȡ��ҵ��������ʱ��
	 * 
	 * @return ��ҵ��������ʱ��
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * ������ҵ��������ʱ��
	 * 
	 * @param updateTime
	 *            ��ҵ��������ʱ��
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * �Ƿ�Ϊ��ռ��ҵ
	 * 
	 * @return �ǻ��
	 */
	public Boolean getExclusive() {
		return exclusive;
	}

	/**
	 * �����Ƿ�Ϊ��ռ��ҵ
	 * 
	 * @param exclusive
	 *            �ǻ��
	 */
	public void setExclusive(Boolean exclusive) {
		this.exclusive = exclusive;
	}
}
