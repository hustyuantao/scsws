package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.log4j.Logger;

/**
 * �ļ��б�����
 * 
 * @author Ԭ��
 */
@XmlRootElement(name = "GetJobOutput")
public class FileListRequest {
	private static Logger logger = Logger.getLogger(FileListRequest.class);
	/**
	 * �ļ�·��
	 */
	private String path;

	/**
	 * ��ȡ�ļ�·��
	 * 
	 * @return �ļ�·��
	 */
	@XmlElement(name = "Path")
	public String getPath() {
		return path;
	}

	/**
	 * �����ļ�·��
	 * 
	 * @param path
	 *            �ļ�·��
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * ����У��
	 * 
	 * @return �ɹ����
	 */
	public Boolean check() {
		Boolean retValue = false;
		if (this.path == null || this.path.isEmpty()) {
			logger.error("�ļ��б��������Ϊ��");

			return retValue;
		}
		retValue = true;

		return retValue;
	}
}
