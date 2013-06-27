package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 作业列表请求类
 * 
 * @author 袁涛
 * @version 1.0
 */
@XmlRootElement(name = "GetJobList")
public class JobListRequest {
	/**
	 * 作业编号列表
	 */
	private String idList;
	/**
	 * 用户名称
	 */
	private String userName;
	/**
	 * 用户组名称
	 */
	private String groupName;
	/**
	 * 作业状态列表
	 */
	private String stateList;
	/**
	 * 项目名称
	 */
	private String project;
	/**
	 * 软件名称
	 */
	private String softwareName;
	/**
	 * 开始时间
	 */
	private String startTime;
	/**
	 * 结束时间
	 */
	private String endTime;
	/**
	 * 时间条件类型
	 */
	private String timeType;

	/**
	 * 获取作业编号列表
	 * 
	 * @return 作业编号列表
	 */
	@XmlElement(name = "JobId")
	public String getIdList() {
		return idList;
	}

	/**
	 * 设置作业编号列表
	 * 
	 * @param idList
	 *            作业编号列表
	 */
	public void setIdList(String idList) {
		this.idList = idList;
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
	 * 获取作业状态列表
	 * 
	 * @return 作业状态列表
	 */
	@XmlElement(name = "State")
	public String getStateList() {
		return stateList;
	}

	/**
	 * 设置作业状态列表
	 * 
	 * @param stateList
	 *            作业状态列表
	 */
	public void setStateList(String stateList) {
		this.stateList = stateList;
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
	 * 获取开始时间
	 * 
	 * @return 开始时间
	 */
	@XmlElement(name = "StartTime")
	public String getStartTime() {
		return startTime;
	}

	/**
	 * 设置开始时间
	 * 
	 * @param startTime
	 *            开始时间
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * 获取结束时间
	 * 
	 * @return 结束时间
	 */
	@XmlElement(name = "EndTime")
	public String getEndTime() {
		return endTime;
	}

	/**
	 * 设置结束时间
	 * 
	 * @param endTime
	 *            结束时间
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * 获取时间条件类型
	 * 
	 * @return 时间条件类型
	 */
	@XmlElement(name = "TimeType")
	public String getTimeType() {
		return timeType;
	}

	/**
	 * 设置时间条件类型
	 * 
	 * @param timeType
	 *            时间条件类型
	 */
	public void setTimeType(String timeType) {
		this.timeType = timeType;
	}
}
