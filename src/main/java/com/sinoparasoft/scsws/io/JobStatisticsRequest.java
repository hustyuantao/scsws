package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 作业统计请求类
 * 
 * @author 袁涛
 */
@XmlRootElement(name = "GetJobCounter")
public class JobStatisticsRequest {
	/**
	 * 用户名称
	 */
	private String userName;
	/**
	 * 用户组名称
	 */
	private String groupName;
	/**
	 * 项目名称
	 */
	private String project;

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
}
