package com.sinoparasoft.scsws.entity;

import java.sql.Timestamp;

/**
 * 数据库表job的实体类
 * 
 * @author 袁涛
 */
public class TableJob {
	/**
	 * 作业状态常量
	 */
	public static final String STAT_QUEUED = "Queued";
	public static final String STAT_FINISHED = "Finished";
	public static final String STAT_RUNNING = "Running";
	public static final String STAT_FAILED = "Failed";
	public static final String STAT_CANCELED = "Canceled";
	public static final String STAT_UNKNOWN = "Unknown";
	/**
	 * 作业编号
	 */
	private Integer id;
	/**
	 * 作业名称
	 */
	private String name;
	/**
	 * 作业执行用户名称
	 */
	private String execUser;
	/**
	 * 作业提交用户名称
	 */
	private String submitUser;
	/**
	 * 用户组名称
	 */
	private String group;
	/**
	 * 命令行
	 */
	private String command;
	/**
	 * 项目名称
	 */
	private String project;
	/**
	 * 作业优先级
	 */
	private Integer priority;
	/**
	 * 队列名称
	 */
	private String queue;
	/**
	 * 作业是否独占节点
	 */
	private Boolean exclusive;
	/**
	 * 作业执行工作目录
	 */
	private String execWorkDirectory;
	/**
	 * 作业提交工作目录
	 */
	private String submitWorkDirectory;
	/**
	 * 作业共享工作目录
	 */
	private String sambaWorkDirectory;
	/**
	 * 软件名称
	 */
	private String softwareName;
	/**
	 * 软件版本
	 */
	private String softwareVersion;
	/**
	 * 软件许可
	 */
	private String softwareLicense;
	/**
	 * 作业使用的处理器个数
	 */
	private Integer coresNum;
	/**
	 * 作业请求的节点列表
	 */
	private String requestedNodes;
	/**
	 * 作业状态
	 */
	private String status;
	/**
	 * 作业使用的CPU时间
	 */
	private Float cpuTime;
	/**
	 * 作业使用的墙钟时间
	 */
	private Float wallTime;
	/**
	 * 作业使用的内存大小
	 */
	private Integer memory;
	/**
	 * 作业分配的节点列表
	 */
	private String allocatedNodes;
	/**
	 * 作业退出状态码
	 */
	private Integer exitStatus;
	/**
	 * 作业提交时间
	 */
	private Timestamp submitTime;
	/**
	 * 作业开始时间
	 */
	private Timestamp startTime;
	/**
	 * 作业完成时间
	 */
	private Timestamp endTime;
	/**
	 * 作业信息更新时间
	 */
	private Timestamp modifiedTime;
	/**
	 * 作业删除标记
	 */
	private Boolean deletedFlag;

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
	 * 获取作业执行用户名称
	 * 
	 * @return 作业执行用户名称
	 */
	public String getExecUser() {
		return execUser;
	}

	/**
	 * 设置作业执行用户名称
	 * 
	 * @param execUser
	 *            作业执行用户名称
	 */
	public void setExecUser(String execUser) {
		this.execUser = execUser;
	}

	/**
	 * 获取作业提交用户名称
	 * 
	 * @return 作业提交用户名称
	 */
	public String getSubmitUser() {
		return submitUser;
	}

	/**
	 * 设置作业提交用户名称
	 * 
	 * @param submitUser
	 *            作业提交用户名称
	 */
	public void setSubmitUser(String submitUser) {
		this.submitUser = submitUser;
	}

	/**
	 * 获取用户组名称
	 * 
	 * @return 用户组名称
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * 设置用户组名称
	 * 
	 * @param group
	 *            用户组名称
	 */
	public void setGroup(String group) {
		this.group = group;
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
	 * 获取作业是否独占节点
	 * 
	 * @return 是或否
	 */
	public Boolean getExclusive() {
		return exclusive;
	}

	/**
	 * 设置作业是否独占节点
	 * 
	 * @param exclusive
	 *            是或否
	 */
	public void setExclusive(Boolean exclusive) {
		this.exclusive = exclusive;
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
	 * 获取作业共享工作目录
	 * 
	 * @return 作业共享工作目录
	 */
	public String getSambaWorkDirectory() {
		return sambaWorkDirectory;
	}

	/**
	 * 设置作业共享工作目录
	 * 
	 * @param sambaWorkDirectory
	 *            作业共享工作目录
	 */
	public void setSambaWorkDirectory(String sambaWorkDirectory) {
		this.sambaWorkDirectory = sambaWorkDirectory;
	}

	/**
	 * 获取软件名称
	 * 
	 * @return 软件名称
	 */
	public String getSoftwareName() {
		return softwareName;
	}

	/**
	 * 设置软件名称
	 * 
	 * @param softwareName
	 *            软件名称
	 */
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	/**
	 * 获取软件版本
	 * 
	 * @return 软件版本
	 */
	public String getSoftwareVersion() {
		return softwareVersion;
	}

	/**
	 * 设置软件版本
	 * 
	 * @param softwareVersion
	 *            软件版本
	 */
	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

	/**
	 * 获取软件许可
	 * 
	 * @return 软件许可
	 */
	public String getSoftwareLicense() {
		return softwareLicense;
	}

	/**
	 * 设置软件许可
	 * 
	 * @param softwareLicense
	 *            软件许可
	 */
	public void setSoftwareLicense(String softwareLicense) {
		this.softwareLicense = softwareLicense;
	}

	/**
	 * 获取作业使用的处理器个数
	 * 
	 * @return 作业使用的处理器个数
	 */
	public Integer getCoresNum() {
		return coresNum;
	}

	/**
	 * 设置作业使用的处理器个数
	 * 
	 * @param coresNum
	 *            作业使用的处理器个数
	 */
	public void setCoresNum(Integer coresNum) {
		this.coresNum = coresNum;
	}

	/**
	 * 获取作业请求的节点列表
	 * 
	 * @return 作业请求的节点列表
	 */
	public String getRequestedNodes() {
		return requestedNodes;
	}

	/**
	 * 设置作业请求的节点列表
	 * 
	 * @param requestedNodes
	 *            作业请求的节点列表
	 */
	public void setRequestedNodes(String requestedNodes) {
		this.requestedNodes = requestedNodes;
	}

	/**
	 * 获取作业状态
	 * 
	 * @return 作业状态
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 设置作业状态
	 * 
	 * @param status
	 *            作业状态
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 获取作业使用的CPU时间
	 * 
	 * @return 作业使用的CPU时间
	 */
	public Float getCpuTime() {
		return cpuTime;
	}

	/**
	 * 设置作业使用的CPU时间
	 * 
	 * @param cpuTime
	 *            作业使用的CPU时间
	 */
	public void setCpuTime(Float cpuTime) {
		this.cpuTime = cpuTime;
	}

	/**
	 * 获取作业使用的墙钟时间
	 * 
	 * @return 作业使用的墙钟时间
	 */
	public Float getWallTime() {
		return wallTime;
	}

	/**
	 * 设置作业使用的墙钟时间
	 * 
	 * @param wallTime
	 *            作业使用的墙钟时间
	 */
	public void setWallTime(Float wallTime) {
		this.wallTime = wallTime;
	}

	/**
	 * 获取作业使用的内存大小
	 * 
	 * @return 作业使用的内存大小
	 */
	public Integer getMemory() {
		return memory;
	}

	/**
	 * 设置作业使用的内存大小
	 * 
	 * @param memory
	 *            作业使用的内存大小
	 */
	public void setMemory(Integer memory) {
		this.memory = memory;
	}

	/**
	 * 获取作业分配的节点列表
	 * 
	 * @return 作业分配的节点列表
	 */
	public String getAllocatedNodes() {
		return allocatedNodes;
	}

	/**
	 * 设置作业分配的节点列表
	 * 
	 * @param allocatedNodes
	 *            作业分配的节点列表
	 */
	public void setAllocatedNodes(String allocatedNodes) {
		this.allocatedNodes = allocatedNodes;
	}

	/**
	 * 获取作业退出状态码
	 * 
	 * @return 作业退出状态码
	 */
	public Integer getExitStatus() {
		return exitStatus;
	}

	/**
	 * 设置作业退出状态码
	 * 
	 * @param exitStatus
	 *            作业退出状态码
	 */
	public void setExitStatus(Integer exitStatus) {
		this.exitStatus = exitStatus;
	}

	/**
	 * 获取作业提交时间
	 * 
	 * @return 作业提交时间
	 */
	public Timestamp getSubmitTime() {
		return submitTime;
	}

	/**
	 * 设置作业提交时间
	 * 
	 * @param submitTime
	 *            作业提交时间
	 */
	public void setSubmitTime(Timestamp submitTime) {
		this.submitTime = submitTime;
	}

	/**
	 * 获取作业开始时间
	 * 
	 * @return 作业开始时间
	 */
	public Timestamp getStartTime() {
		return startTime;
	}

	/**
	 * 设置作业开始时间
	 * 
	 * @param startTime
	 *            作业开始时间
	 */
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	/**
	 * 获取作业完成时间
	 * 
	 * @return 作业完成时间
	 */
	public Timestamp getEndTime() {
		return endTime;
	}

	/**
	 * 设置作业完成时间
	 * 
	 * @param endTime
	 *            作业完成时间
	 */
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	/**
	 * 获取作业信息更新时间
	 * 
	 * @return 作业信息更新时间
	 */
	public Timestamp getModifiedTime() {
		return modifiedTime;
	}

	/**
	 * 设置作业信息更新时间
	 * 
	 * @param modifiedTime
	 *            作业信息更新时间
	 */
	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	/**
	 * 获取作业删除标记
	 * 
	 * @return 作业删除标记
	 */
	public Boolean getDeletedFlag() {
		return deletedFlag;
	}

	/**
	 * 设置作业删除标记
	 * 
	 * @param deletedFlag
	 *            作业删除标记
	 */
	public void setDeletedFlag(Boolean deletedFlag) {
		this.deletedFlag = deletedFlag;
	}
}
