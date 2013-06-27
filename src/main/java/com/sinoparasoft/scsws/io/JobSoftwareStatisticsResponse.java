package com.sinoparasoft.scsws.io;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ��ҵ���ʹ��ͳ����Ӧ��
 * 
 * @author Ԭ��
 * @version 1.0
 */
@XmlRootElement(name = "GetSolverWaitQueueResult")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class JobSoftwareStatisticsResponse {
	/**
	 * ��Ӧ״̬
	 */
	private Integer exitStatus;
	/**
	 * ��Ӧ��Ϣ
	 */
	private String message;
	/**
	 * ��ҵ���ʹ��ͳ��
	 */
	private List<JobSoftwareStatistics> jobSoftwareStatistics;

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
	 * ��ȡ��ҵ���ʹ��ͳ��
	 * 
	 * @return ��ҵ���ʹ��ͳ��
	 */
	@XmlElement(name = "Data")
	public List<JobSoftwareStatistics> getJobSoftwareStatistics() {
		return jobSoftwareStatistics;
	}

	/**
	 * ������ҵ���ʹ��ͳ��
	 * 
	 * @param jobSoftwareStatistics
	 *            ��ҵ���ʹ��ͳ��
	 */
	public void setJobSoftwareStatistics(
			List<JobSoftwareStatistics> jobSoftwareStatistics) {
		this.jobSoftwareStatistics = jobSoftwareStatistics;
	}
}
