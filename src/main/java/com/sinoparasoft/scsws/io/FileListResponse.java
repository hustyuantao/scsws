package com.sinoparasoft.scsws.io;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 文件列表响应
 * 
 * @author 袁涛
 */
@XmlRootElement(name = "GetJobOutputResult")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class FileListResponse {
	/**
	 * 响应状态
	 */
	private Integer exitStatus;
	/**
	 * 响应消息
	 */
	private String message;
	/**
	 * 文件列表
	 */
	private List<FileInformation> fileList;

	/**
	 * 获取响应状态
	 * 
	 * @return 响应状态
	 */
	@XmlAttribute(name = "ExitStatus")
	public Integer getExitStatus() {
		return exitStatus;
	}

	/**
	 * 设置响应状态
	 * 
	 * @param exitStatus
	 *            响应状态
	 */
	public void setExitStatus(Integer exitStatus) {
		this.exitStatus = exitStatus;
	}

	/**
	 * 获取响应消息
	 * 
	 * @return 响应消息
	 */
	@XmlAttribute(name = "Message")
	public String getMessage() {
		return message;
	}

	/**
	 * 设置响应消息
	 * 
	 * @param message
	 *            响应消息
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 获取文件列表
	 * 
	 * @return 文件列表
	 */
	public List<FileInformation> getFileList() {
		return fileList;
	}

	/**
	 * 设置文件列表
	 * 
	 * @param fileList
	 *            文件列表
	 */
	public void setFileList(List<FileInformation> fileList) {
		this.fileList = fileList;
	}
}
