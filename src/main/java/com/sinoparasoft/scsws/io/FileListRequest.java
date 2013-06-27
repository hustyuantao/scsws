package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.log4j.Logger;

/**
 * 文件列表请求
 * 
 * @author 袁涛
 */
@XmlRootElement(name = "GetJobOutput")
public class FileListRequest {
	private static Logger logger = Logger.getLogger(FileListRequest.class);
	/**
	 * 文件路径
	 */
	private String path;

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
	 * 参数校验
	 * 
	 * @return 成功与否
	 */
	public Boolean check() {
		Boolean retValue = false;
		if (this.path == null || this.path.isEmpty()) {
			logger.error("文件列表请求参数为空");

			return retValue;
		}
		retValue = true;

		return retValue;
	}
}
