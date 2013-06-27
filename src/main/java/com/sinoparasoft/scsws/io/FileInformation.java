package com.sinoparasoft.scsws.io;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 文件信息
 * 
 * @author 袁涛
 * @version 1.0
 */
@XmlRootElement(name = "Item")
@XmlType(propOrder = { "name", "type", "length", "lastModifiedTime", "path",
		"url" })
public class FileInformation {
	/**
	 * 文件名称
	 */
	private String name;
	/**
	 * 文件类型
	 */
	private String type;
	/**
	 * 文件大小
	 */
	private Long length;
	/**
	 * 最后修改时间
	 */
	private String lastModifiedTime;
	/**
	 * 文件路径
	 */
	private String path;
	/**
	 * 文件URL地址
	 */
	private String url;

	/**
	 * 获取文件名称
	 * 
	 * @return 文件名称
	 */
	@XmlElement(name = "Name")
	public String getName() {
		return name;
	}

	/**
	 * 设置文件名称
	 * 
	 * @param name
	 *            文件名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取文件类型
	 * 
	 * @return 文件类型
	 */
	@XmlElement(name = "Type")
	public String getType() {
		return type;
	}

	/**
	 * 设置文件类型
	 * 
	 * @param type
	 *            文件类型
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 获取文件大小
	 * 
	 * @return 文件大小
	 */
	@XmlElement(name = "Size")
	public Long getLength() {
		return length;
	}

	/**
	 * 设置文件大小
	 * 
	 * @param length
	 *            文件大小
	 */
	public void setLength(Long length) {
		this.length = length;
	}

	/**
	 * 获取最后修改时间
	 * 
	 * @return 最后修改时间
	 */
	@XmlElement(name = "LastModifiedTime")
	public String getLastModifiedTime() {
		return lastModifiedTime;
	}

	/**
	 * 设置最后修改时间
	 * 
	 * @param lastModifiedTime
	 *            最后修改时间
	 */
	public void setLastModifiedTime(String lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}
	
	/**
	 * 设置最后修改时间
	 * 
	 * @param lastModifiedTime
	 *            最后修改时间
	 */
	public void setLastModifiedTime(Long lastModifiedTime) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.lastModifiedTime = df.format(new Date(lastModifiedTime));
	}

	/**
	 * 获取文件路径
	 * 
	 * @return 文件路径
	 */
	@XmlElement(name = "Path")
	public String getPath() {
		return path;
	}

	/**
	 * 设置文件路径
	 * 
	 * @param path
	 *            文件路径
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * 获取文件URL地址
	 * 
	 * @return 文件URL地址
	 */
	@XmlElement(name = "Url")
	public String getUrl() {
		return url;
	}

	/**
	 * 设置文件URL地址
	 * 
	 * @param url
	 *            文件URL地址
	 */
	public void setUrl(String url) {
		this.url = url;
	}
}
