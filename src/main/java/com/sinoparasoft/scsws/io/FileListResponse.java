package com.sinoparasoft.scsws.io;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * �ļ��б���Ӧ
 * 
 * @author Ԭ��
 */
@XmlRootElement(name = "GetJobOutputResult")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class FileListResponse {
	/**
	 * ��Ӧ״̬
	 */
	private Integer exitStatus;
	/**
	 * ��Ӧ��Ϣ
	 */
	private String message;
	/**
	 * �ļ��б�
	 */
	private List<FileInformation> fileList;

	/**
	 * ��ȡ��Ӧ״̬
	 * 
	 * @return ��Ӧ״̬
	 */
	@XmlAttribute(name = "ExitStatus")
	public Integer getExitStatus() {
		return exitStatus;
	}

	/**
	 * ������Ӧ״̬
	 * 
	 * @param exitStatus
	 *            ��Ӧ״̬
	 */
	public void setExitStatus(Integer exitStatus) {
		this.exitStatus = exitStatus;
	}

	/**
	 * ��ȡ��Ӧ��Ϣ
	 * 
	 * @return ��Ӧ��Ϣ
	 */
	@XmlAttribute(name = "Message")
	public String getMessage() {
		return message;
	}

	/**
	 * ������Ӧ��Ϣ
	 * 
	 * @param message
	 *            ��Ӧ��Ϣ
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * ��ȡ�ļ��б�
	 * 
	 * @return �ļ��б�
	 */
	public List<FileInformation> getFileList() {
		return fileList;
	}

	/**
	 * �����ļ��б�
	 * 
	 * @param fileList
	 *            �ļ��б�
	 */
	public void setFileList(List<FileInformation> fileList) {
		this.fileList = fileList;
	}
}
