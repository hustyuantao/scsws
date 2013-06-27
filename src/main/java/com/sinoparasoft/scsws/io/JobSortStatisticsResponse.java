package com.sinoparasoft.scsws.io;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ��ҵ��������ͳ����Ӧ��
 * 
 * @author Ԭ��
 */
@XmlRootElement(name = "GetSortOfResourceUtilizationAnalysisResult")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class JobSortStatisticsResponse {
	/**
	 * ��Ӧ״̬
	 */
	private Integer exitStatus;
	/**
	 * ��Ӧ��Ϣ
	 */
	private String message;
	/**
	 * ��ҵ��������ͳ��
	 */
	private List<JobSortStatistics> jobSortStatistics;

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
	 * ��ȡ��ҵ��������ͳ��
	 * 
	 * @return ��ҵ��������ͳ��
	 */
	@XmlElement(name = "Data")
	public List<JobSortStatistics> getJobSortStatistics() {
		return jobSortStatistics;
	}

	/**
	 * ������ҵ��������ͳ��
	 * 
	 * @param jobSortStatistics
	 *            ��ҵ��������ͳ��
	 */
	public void setJobSortStatistics(List<JobSortStatistics> jobSortStatistics) {
		this.jobSortStatistics = jobSortStatistics;
	}
}
