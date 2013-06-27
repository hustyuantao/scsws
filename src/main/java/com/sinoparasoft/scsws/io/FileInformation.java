package com.sinoparasoft.scsws.io;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * �ļ���Ϣ
 * 
 * @author Ԭ��
 * @version 1.0
 */
@XmlRootElement(name = "Item")
@XmlType(propOrder = { "name", "type", "length", "lastModifiedTime", "path",
		"url" })
public class FileInformation {
	/**
	 * �ļ�����
	 */
	private String name;
	/**
	 * �ļ�����
	 */
	private String type;
	/**
	 * �ļ���С
	 */
	private Long length;
	/**
	 * ����޸�ʱ��
	 */
	private String lastModifiedTime;
	/**
	 * �ļ�·��
	 */
	private String path;
	/**
	 * �ļ�URL��ַ
	 */
	private String url;

	/**
	 * ��ȡ�ļ�����
	 * 
	 * @return �ļ�����
	 */
	@XmlElement(name = "Name")
	public String getName() {
		return name;
	}

	/**
	 * �����ļ�����
	 * 
	 * @param name
	 *            �ļ�����
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ��ȡ�ļ�����
	 * 
	 * @return �ļ�����
	 */
	@XmlElement(name = "Type")
	public String getType() {
		return type;
	}

	/**
	 * �����ļ�����
	 * 
	 * @param type
	 *            �ļ�����
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * ��ȡ�ļ���С
	 * 
	 * @return �ļ���С
	 */
	@XmlElement(name = "Size")
	public Long getLength() {
		return length;
	}

	/**
	 * �����ļ���С
	 * 
	 * @param length
	 *            �ļ���С
	 */
	public void setLength(Long length) {
		this.length = length;
	}

	/**
	 * ��ȡ����޸�ʱ��
	 * 
	 * @return ����޸�ʱ��
	 */
	@XmlElement(name = "LastModifiedTime")
	public String getLastModifiedTime() {
		return lastModifiedTime;
	}

	/**
	 * ��������޸�ʱ��
	 * 
	 * @param lastModifiedTime
	 *            ����޸�ʱ��
	 */
	public void setLastModifiedTime(String lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}
	
	/**
	 * ��������޸�ʱ��
	 * 
	 * @param lastModifiedTime
	 *            ����޸�ʱ��
	 */
	public void setLastModifiedTime(Long lastModifiedTime) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.lastModifiedTime = df.format(new Date(lastModifiedTime));
	}

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
	 * ��ȡ�ļ�URL��ַ
	 * 
	 * @return �ļ�URL��ַ
	 */
	@XmlElement(name = "Url")
	public String getUrl() {
		return url;
	}

	/**
	 * �����ļ�URL��ַ
	 * 
	 * @param url
	 *            �ļ�URL��ַ
	 */
	public void setUrl(String url) {
		this.url = url;
	}
}
