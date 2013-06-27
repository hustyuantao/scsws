package com.sinoparasoft.scsws.entity;

import java.util.Date;

/**
 * 任务调度器作业类
 * 
 * @author 袁涛
 */
public class SchedJob {
	/**
	 * 作业编号
	 */
	private Integer id;
	/**
	 * 作业名称
	 */
	private String name;
	/**
	 * 作业描述
	 */
	private String description;
	/**
	 * 队列名称
	 */
	private String queue;
	/**
	 * 处理器核数
	 */
	private Integer coresNum;
	/**
	 * 标准输入文件路径
	 */
	private String inputFilePath;
	/**
	 * 标准输出文件路径
	 */
	private String outputFilePath;
	/**
	 * 错误输出文件路径
	 */
	private String errorFilePath;
	/**
	 * 作业执行预处理命令
	 */
	private String preCommand;
	/**
	 * 命令行
	 */
	private String command;
	/**
	 * 作业执行后处理命令
	 */
	private String postCommand;
	/**
	 * 项目名称
	 */
	private String project;
	/**
	 * 作业优先级
	 */
	private Integer priority;
	/**
	 * 提交用户名称
	 */
	private String submitUserName;
	/**
	 * 邮件用户名称
	 */
	private String mailUserName;
	/**
	 * 作业组名称
	 */
	private String jobGroupName;
	/**
	 * 用户组名称
	 */
	private String userGroupName;
	/**
	 * 作业状态
	 */
	private Integer status;
	/**
	 * 登录Shell
	 */
	private String loginShell;
	/**
	 * 作业进程编号
	 */
	private Integer processId;
	/**
	 * 作业提交时间
	 */
	private Date submitTime;
	/**
	 * 作业预留时间
	 */
	private Date reserveTime;
	/**
	 * 作业开始时间
	 */
	private Date startTime;
	/**
	 * 作业预计开始时间
	 */
	private Date predictedStartTime;
	/**
	 * 作业完成时间
	 */
	private Date endTime;
	/**
	 * 作业持续时间
	 */
	private Integer duration;
	/**
	 * 作业CPU时间
	 */
	private Float cpuTime;
	/**
	 * 作业内存大小
	 */
	private Integer memorySize;
	/**
	 * 作业提交工作目录
	 */
	private String submitWorkDirectory;
	/**
	 * 作业提交HOME目录
	 */
	private String submitHomeDirectory;
	/**
	 * 作业提交主机名称
	 */
	private String submitHost;
	/**
	 * 作业执行主机集合
	 */
	private String execHosts;
	/**
	 * 第一执行主机的CPU因子
	 */
	private Float cpuFactor;
	/**
	 * 作业退出状态
	 */
	private Integer exitStatus;
	/**
	 * 作业执行用户编号
	 */
	private Integer execUserId;
	/**
	 * 作业执行HOME目录
	 */
	private String execHomeDirectory;
	/**
	 * 作业执行工作目录
	 */
	private String execWorkDirectory;
	/**
	 * 作业执行用户名称
	 */
	private String execUserName;
	/**
	 * 作业参数更新时间
	 */
	private Date updateTime;
	/**
	 * 是否为独占作业
	 */
	private Boolean exclusive;

	/**
	 * 获取作业编号
	 * 
	 * @return 作业编号
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置作业编号
	 * 
	 * @param id
	 *            作业编号
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取作业名称
	 * 
	 * @return 作业名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置作业名称
	 * 
	 * @param name
	 *            作业名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取作业描述
	 * 
	 * @return 作业描述
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 设置作业描述
	 * 
	 * @param description
	 *            作业描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 获取队列名称
	 * 
	 * @return 队列名称
	 */
	public String getQueue() {
		return queue;
	}

	/**
	 * 设置队列名称
	 * 
	 * @param queue
	 *            队列名称
	 */
	public void setQueue(String queue) {
		this.queue = queue;
	}

	/**
	 * 获取处理器核数
	 * 
	 * @return 处理器核数
	 */
	public Integer getCoresNum() {
		return coresNum;
	}

	/**
	 * 设置处理器核数
	 * 
	 * @param coresNum
	 *            处理器核数
	 */
	public void setCoresNum(Integer coresNum) {
		this.coresNum = coresNum;
	}

	/**
	 * 获取标准输入文件路径
	 * 
	 * @return 标准输入文件路径
	 */
	public String getInputFilePath() {
		return inputFilePath;
	}

	/**
	 * 设置标准输入文件路径
	 * 
	 * @param inputFilePath
	 *            标准输入文件路径
	 */
	public void setInputFilePath(String inputFilePath) {
		this.inputFilePath = inputFilePath;
	}

	/**
	 * 获取标准输出文件路径
	 * 
	 * @return 标准输出文件路径
	 */
	public String getOutputFilePath() {
		return outputFilePath;
	}

	/**
	 * 设置标准输出文件路径
	 * 
	 * @param outputFilePath
	 *            标准输出文件路径
	 */
	public void setOutputFilePath(String outputFilePath) {
		this.outputFilePath = outputFilePath;
	}

	/**
	 * 获取错误输出文件路径
	 * 
	 * @return 错误输出文件路径
	 */
	public String getErrorFilePath() {
		return errorFilePath;
	}

	/**
	 * 设置错误输出文件路径
	 * 
	 * @param errorFilePath
	 *            错误输出文件路径
	 */
	public void setErrorFilePath(String errorFilePath) {
		this.errorFilePath = errorFilePath;
	}

	/**
	 * 获取作业执行预处理命令
	 * 
	 * @return 作业执行预处理命令
	 */
	public String getPreCommand() {
		return preCommand;
	}

	/**
	 * 设置作业执行预处理命令
	 * 
	 * @param preCommand
	 *            作业执行预处理命令
	 */
	public void setPreCommand(String preCommand) {
		this.preCommand = preCommand;
	}

	/**
	 * 获取命令行
	 * 
	 * @return 命令行
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * 设置命令行
	 * 
	 * @param command
	 *            命令行
	 */
	public void setCommand(String command) {
		this.command = command;
	}

	/**
	 * 获取作业执行后处理命令
	 * 
	 * @return 作业执行后处理命令
	 */
	public String getPostCommand() {
		return postCommand;
	}

	/**
	 * 设置作业执行后处理命令
	 * 
	 * @param postCommand
	 *            作业执行后处理命令
	 */
	public void setPostCommand(String postCommand) {
		this.postCommand = postCommand;
	}

	/**
	 * 获取项目名称
	 * 
	 * @return 项目名称
	 */
	public String getProject() {
		return project;
	}

	/**
	 * 设置项目名称
	 * 
	 * @param project
	 *            项目名称
	 */
	public void setProject(String project) {
		this.project = project;
	}

	/**
	 * 获取作业优先级
	 * 
	 * @return 作业优先级
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * 设置作业优先级
	 * 
	 * @param priority
	 *            作业优先级
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	/**
	 * 获取提交用户名称
	 * 
	 * @return 提交用户名称
	 */
	public String getSubmitUserName() {
		return submitUserName;
	}

	/**
	 * 设置提交用户名称
	 * 
	 * @param submitUserName
	 *            提交用户名称
	 */
	public void setSubmitUserName(String submitUserName) {
		this.submitUserName = submitUserName;
	}

	/**
	 * 获取邮件用户名称
	 * 
	 * @return 邮件用户名称
	 */
	public String getMailUserName() {
		return mailUserName;
	}

	/**
	 * 设置邮件用户名称
	 * 
	 * @param mailUserName
	 *            邮件用户名称
	 */
	public void setMailUserName(String mailUserName) {
		this.mailUserName = mailUserName;
	}

	/**
	 * 获取作业组名称
	 * 
	 * @return 作业组名称
	 */
	public String getJobGroupName() {
		return jobGroupName;
	}

	/**
	 * 设置作业组名称
	 * 
	 * @param jobGroupName
	 *            作业组名称
	 */
	public void setJobGroupName(String jobGroupName) {
		this.jobGroupName = jobGroupName;
	}

	/**
	 * 获取用户组名称
	 * 
	 * @return 用户组名称
	 */
	public String getUserGroupName() {
		return userGroupName;
	}

	/**
	 * 设置用户组名称
	 * 
	 * @param userGroupName
	 *            用户组名称
	 */
	public void setUserGroupName(String userGroupName) {
		this.userGroupName = userGroupName;
	}

	/**
	 * 获取作业状态
	 * 
	 * @return 作业状态
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 设置作业状态
	 * 
	 * @param status
	 *            作业状态
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * 获取登录Shell
	 * 
	 * @return 登录Shell
	 */
	public String getLoginShell() {
		return loginShell;
	}

	/**
	 * 设置登录Shell
	 * 
	 * @param loginShell
	 *            登录Shell
	 */
	public void setLoginShell(String loginShell) {
		this.loginShell = loginShell;
	}

	/**
	 * 获取作业进程编号
	 * 
	 * @return 作业进程编号
	 */
	public Integer getProcessId() {
		return processId;
	}

	/**
	 * 设置作业进程编号
	 * 
	 * @param processId
	 *            作业进程编号
	 */
	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	/**
	 * 获取作业提交时间
	 * 
	 * @return 作业提交时间
	 */
	public Date getSubmitTime() {
		return submitTime;
	}

	/**
	 * 设置作业提交时间
	 * 
	 * @param submitTime
	 *            作业提交时间
	 */
	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

	/**
	 * 获取作业预留时间
	 * 
	 * @return 作业预留时间
	 */
	public Date getReserveTime() {
		return reserveTime;
	}

	/**
	 * 设置作业预留时间
	 * 
	 * @param reserveTime
	 *            作业预留时间
	 */
	public void setReserveTime(Date reserveTime) {
		this.reserveTime = reserveTime;
	}

	/**
	 * 获取作业开始时间
	 * 
	 * @return 作业开始时间
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * 设置作业开始时间
	 * 
	 * @param startTime
	 *            作业开始时间
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * 获取作业预计开始时间
	 * 
	 * @return 作业预计开始时间
	 */
	public Date getPredictedStartTime() {
		return predictedStartTime;
	}

	/**
	 * 设置作业预计开始时间
	 * 
	 * @param predictedStartTime
	 *            作业预计开始时间
	 */
	public void setPredictedStartTime(Date predictedStartTime) {
		this.predictedStartTime = predictedStartTime;
	}

	/**
	 * 获取作业完成时间
	 * 
	 * @return 作业完成时间
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * 设置作业完成时间
	 * 
	 * @param endTime
	 *            作业完成时间
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * 获取作业持续时间
	 * 
	 * @return 作业持续时间
	 */
	public Integer getDuration() {
		return duration;
	}

	/**
	 * 设置作业持续时间
	 * 
	 * @param duration
	 *            作业持续时间
	 */
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	/**
	 * 获取作业CPU时间
	 * 
	 * @return 作业CPU时间
	 */
	public Float getCpuTime() {
		return cpuTime;
	}

	/**
	 * 设置作业CPU时间
	 * 
	 * @param cpuTime
	 *            作业CPU时间
	 */
	public void setCpuTime(Float cpuTime) {
		this.cpuTime = cpuTime;
	}

	/**
	 * 获取作业内存大小
	 * 
	 * @return 作业内存大小
	 */
	public Integer getMemorySize() {
		return memorySize;
	}

	/**
	 * 设置作业内存大小
	 * 
	 * @param memorySize
	 *            作业内存大小
	 */
	public void setMemorySize(Integer memorySize) {
		this.memorySize = memorySize;
	}

	/**
	 * 获取作业提交工作目录
	 * 
	 * @return 作业提交工作目录
	 */
	public String getSubmitWorkDirectory() {
		return submitWorkDirectory;
	}

	/**
	 * 设置作业提交工作目录
	 * 
	 * @param submitWorkDirectory
	 *            作业提交工作目录
	 */
	public void setSubmitWorkDirectory(String submitWorkDirectory) {
		this.submitWorkDirectory = submitWorkDirectory;
	}

	/**
	 * 获取作业提交HOME目录
	 * 
	 * @return 作业提交HOME目录
	 */
	public String getSubmitHomeDirectory() {
		return submitHomeDirectory;
	}

	/**
	 * 设置作业提交HOME目录
	 * 
	 * @param submitHomeDirectory
	 *            作业提交HOME目录
	 */
	public void setSubmitHomeDirectory(String submitHomeDirectory) {
		this.submitHomeDirectory = submitHomeDirectory;
	}

	/**
	 * 获取作业提交主机名称
	 * 
	 * @return 作业提交主机名称
	 */
	public String getSubmitHost() {
		return submitHost;
	}

	/**
	 * 设置作业提交主机名称
	 * 
	 * @param submitHost
	 *            作业提交主机名称
	 */
	public void setSubmitHost(String submitHost) {
		this.submitHost = submitHost;
	}

	/**
	 * 获取作业执行主机集合
	 * 
	 * @return 作业执行主机集合
	 */
	public String getExecHosts() {
		return execHosts;
	}

	/**
	 * 设置作业执行主机集合
	 * 
	 * @param execHosts
	 *            作业执行主机集合
	 */
	public void setExecHosts(String execHosts) {
		this.execHosts = execHosts;
	}

	/**
	 * 获取第一执行主机的CPU因子
	 * 
	 * @return 第一执行主机的CPU因子
	 */
	public Float getCpuFactor() {
		return cpuFactor;
	}

	/**
	 * 设置第一执行主机的CPU因子
	 * 
	 * @param cpuFactor
	 *            第一执行主机的CPU因子
	 */
	public void setCpuFactor(Float cpuFactor) {
		this.cpuFactor = cpuFactor;
	}

	/**
	 * 获取作业退出状态
	 * 
	 * @return 作业退出状态
	 */
	public Integer getExitStatus() {
		return exitStatus;
	}

	/**
	 * 设置作业退出状态
	 * 
	 * @param exitStatus
	 *            作业退出状态
	 */
	public void setExitStatus(Integer exitStatus) {
		this.exitStatus = exitStatus;
	}

	/**
	 * 获取作业执行用户编号
	 * 
	 * @return 作业执行用户编号
	 */
	public Integer getExecUserId() {
		return execUserId;
	}

	/**
	 * 设置作业执行用户编号
	 * 
	 * @param execUserId
	 *            作业执行用户编号
	 */
	public void setExecUserId(Integer execUserId) {
		this.execUserId = execUserId;
	}

	/**
	 * 获取作业执行HOME目录
	 * 
	 * @return 作业执行HOME目录
	 */
	public String getExecHomeDirectory() {
		return execHomeDirectory;
	}

	/**
	 * 设置作业执行HOME目录
	 * 
	 * @param execHomeDirectory
	 *            作业执行HOME目录
	 */
	public void setExecHomeDirectory(String execHomeDirectory) {
		this.execHomeDirectory = execHomeDirectory;
	}

	/**
	 * 获取作业执行工作目录
	 * 
	 * @return 作业执行工作目录
	 */
	public String getExecWorkDirectory() {
		return execWorkDirectory;
	}

	/**
	 * 设置作业执行工作目录
	 * 
	 * @param execWorkDirectory
	 *            作业执行工作目录
	 */
	public void setExecWorkDirectory(String execWorkDirectory) {
		this.execWorkDirectory = execWorkDirectory;
	}

	/**
	 * 获取作业执行用户名称
	 * 
	 * @return 作业执行用户名称
	 */
	public String getExecUserName() {
		return execUserName;
	}

	/**
	 * 设置作业执行用户名称
	 * 
	 * @param execUserName
	 *            作业执行用户名称
	 */
	public void setExecUserName(String execUserName) {
		this.execUserName = execUserName;
	}

	/**
	 * 获取作业参数更新时间
	 * 
	 * @return 作业参数更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 设置作业参数更新时间
	 * 
	 * @param updateTime
	 *            作业参数更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 是否为独占作业
	 * 
	 * @return 是或否
	 */
	public Boolean getExclusive() {
		return exclusive;
	}

	/**
	 * 设置是否为独占作业
	 * 
	 * @param exclusive
	 *            是或否
	 */
	public void setExclusive(Boolean exclusive) {
		this.exclusive = exclusive;
	}
}
