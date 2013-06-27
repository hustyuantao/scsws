package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 作业简略信息
 * 
 * @author 袁涛
 */
@XmlRootElement(name = "Job")
@XmlType(propOrder = { "id", "name", "userName", "state", "priority",
		"softwareName", "softwareVersion", "coresNum", "nodeList",
		"submitTime", "startTime", "endTime", "execWorkDirectory",
		"sambaWorkDirectory", "submitWorkDirectory" })
public class JobBriefInformation {
	/**
	 * 作业编号
	 */
	private Integer id;
	/**
	 * 作业名称
	 */
	private String name;
	/**
	 * 用户名称
	 */
	private String userName;
	/**
	 * 作业状态
	 */
	private String state;
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
	 * 处理器核数
	 */
	private Integer coresNum;
	/**
	 * 作业节点列表
	 */
	private String nodeList;
	/**
	 * 作业提交时间
	 */
	private String submitTime;
	/**
	 * 作业开始时间
	 */
	private String startTime;
	/**
	 * 作业结束时间
	 */
	private String endTime;
	/**
	 * 作业执行工作目录
	 */
	private String execWorkDirectory;
	/**
	 * 作业执行Samba工作目录
	 */
	private String sambaWorkDirectory;
	/**
	 * 作业提交工作目录
	 */
	private String submitWorkDirectory;

	/**
	 * 获取作业编号
	 * 
	 * @return 作业编号
	 */
	@XmlElement(name = "JobId")
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
	 * 获取用户名称
	 * 
	 * @return 用户名称
	 */
	@XmlElement(name = "UserName")
	public String getUserName() {
		return userName;
	}

	/**
	 * 设置用户名称
	 * 
	 * @param userName
	 *            用户名称
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 获取作业状态
	 * 
	 * @return 作业状态
	 */
	@XmlElement(name = "State")
	public String getState() {
		return state;
	}

	/**
	 * 设置作业状态
	 * 
	 * @param state
	 *            作业状态
	 */
	public void setState(String state) {
		this.state = state;
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
	 * 获取作业节点列表
	 * 
	 * @return 作业节点列表
	 */
	@XmlElement(name = "AllocatedNodes")
	public String getNodeList() {
		return nodeList;
	}

	/**
	 * 设置作业节点列表
	 * 
	 * @param nodeList
	 *            作业节点列表
	 */
	public void setNodeList(String nodeList) {
		this.nodeList = nodeList;
	}

	/**
	 * 获取作业提交时间
	 * 
	 * @return 作业提交时间
	 */
	@XmlElement(name = "SubmitTime")
	public String getSubmitTime() {
		return submitTime;
	}

	/**
	 * 设置作业提交时间
	 * 
	 * @param submitTime
	 *            作业提交时间
	 */
	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}

	/**
	 * 获取作业开始时间
	 * 
	 * @return 作业开始时间
	 */
	@XmlElement(name = "StartTime")
	public String getStartTime() {
		return startTime;
	}

	/**
	 * 设置作业开始时间
	 * 
	 * @param startTime
	 *            作业开始时间
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * 获取作业结束时间
	 * 
	 * @return 作业结束时间
	 */
	@XmlElement(name = "EndTime")
	public String getEndTime() {
		return endTime;
	}

	/**
	 * 设置作业结束时间
	 * 
	 * @param endTime
	 *            作业结束时间
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * 获取作业执行工作目录
	 * 
	 * @return 作业执行工作目录
	 */
	@XmlElement(name = "LinuxWorkDirectory")
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
	 * 获取作业执行Samba工作目录
	 * 
	 * @return 作业执行Samba工作目录
	 */
	@XmlElement(name = "SambaWorkDirectory")
	public String getSambaWorkDirectory() {
		return sambaWorkDirectory;
	}

	/**
	 * 设置作业执行Samba工作目录
	 * 
	 * @param sambaWorkDirectory
	 *            作业执行Samba工作目录
	 */
	public void setSambaWorkDirectory(String sambaWorkDirectory) {
		this.sambaWorkDirectory = sambaWorkDirectory;
	}

	/**
	 * 获取作业提交工作目录
	 * 
	 * @return 作业提交工作目录
	 */
	@XmlElement(name = "WindowsWorkDirectory")
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
}
