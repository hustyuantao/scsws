package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 作业提交请求类
 * 
 * @author 袁涛
 */
@XmlRootElement(name = "SubmitJob")
public class JobSubmitRequest {
	/**
	 * 作业名称
	 */
	private String name;
	/**
	 * 作业提交用户名称
	 */
	private String submitUserName;
	/**
	 * 用户组名称
	 */
	private String groupName;
	/**
	 * 作业执行用户名称
	 */
	private String execUserName;
	/**
	 * 项目名称
	 */
	private String project;
	/**
	 * 作业优先级
	 */
	private Integer priority;
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
	 * 命令行
	 */
	private String command;
	/**
	 * 请求的处理器核数
	 */
	private Integer coresNum;
	/**
	 * 是否独占节点
	 */
	private String exclusive;
	/**
	 * 是否交互
	 */
	private String interactive;
	/**
	 * 工作目录
	 */
	private String workDirectory;
	/**
	 * 队列名称
	 */
	private String queueName;

	/**
	 * 获取作业名称
	 * 
	 * @return 作业名称
	 */
	@XmlElement(name = "JobName")
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
	 * 获取作业提交用户名称
	 * 
	 * @return 作业提交用户名称
	 */
	@XmlElement(name = "UserName")
	public String getSubmitUserName() {
		return submitUserName;
	}

	/**
	 * 设置作业提交用户名称
	 * 
	 * @param submitUserName
	 *            作业提交用户名称
	 */
	public void setSubmitUserName(String submitUserName) {
		this.submitUserName = submitUserName;
	}

	/**
	 * 获取用户组名称
	 * 
	 * @return 用户组名称
	 */
	@XmlElement(name = "GroupName")
	public String getGroupName() {
		return groupName;
	}

	/**
	 * 设置用户组名称
	 * 
	 * @param groupName
	 *            用户组名称
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * 获取作业执行用户名称
	 * 
	 * @return 作业执行用户名称
	 */
	@XmlElement(name = "RunAs")
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
	 * 获取项目名称
	 * 
	 * @return 项目名称
	 */
	@XmlElement(name = "Project")
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
	@XmlElement(name = "Priority")
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
	 * 获取软件名称
	 * 
	 * @return 软件名称
	 */
	@XmlElement(name = "SoftwareName")
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
	@XmlElement(name = "SoftwareVersion")
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
	@XmlElement(name = "SoftwareLicense")
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
	 * 获取命令行
	 * 
	 * @return 命令行
	 */
	@XmlElement(name = "CommandLine")
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
	 * 获取处理器核数
	 * 
	 * @return 处理器核数
	 */
	@XmlElement(name = "NumberOfCores")
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
	 * 是否独占节点
	 * 
	 * @return 是或否
	 */
	@XmlElement(name = "Exclusive")
	public String getExclusive() {
		return exclusive;
	}

	/**
	 * 设置是否独占节点
	 * 
	 * @param exclusive
	 *            是或否
	 */
	public void setExclusive(String exclusive) {
		this.exclusive = exclusive;
	}

	/**
	 * 是否交互
	 * 
	 * @return 是或否
	 */
	@XmlElement(name = "Interactive")
	public String getInteractive() {
		return interactive;
	}

	/**
	 * 设置是否交互
	 * 
	 * @param interactive
	 *            是或否
	 */
	public void setInteractive(String interactive) {
		this.interactive = interactive;
	}

	/**
	 * 获取工作目录
	 * 
	 * @return 工作目录
	 */
	@XmlElement(name = "WorkDirectory")
	public String getWorkDirectory() {
		return workDirectory;
	}

	/**
	 * 设置工作目录
	 * 
	 * @param workDirectory
	 *            工作目录
	 */
	public void setWorkDirectory(String workDirectory) {
		this.workDirectory = workDirectory;
	}

	/**
	 * 获取队列名称
	 * 
	 * @return 队列名称
	 */
	@XmlElement(name = "Queue")
	public String getQueueName() {
		return queueName;
	}

	/**
	 * 设置队列名称
	 * 
	 * @param queueName
	 *            队列名称
	 */
	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}
}
