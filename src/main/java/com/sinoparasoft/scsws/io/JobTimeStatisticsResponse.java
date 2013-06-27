package com.sinoparasoft.scsws.io;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ��ҵʱ�η���ͳ����Ӧ��
 * 
 * @author Ԭ��
 */
@XmlRootElement(name = "GetSoftwareResourceUtilizationAnalysisResult")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class JobTimeStatisticsResponse {
	/**
	 * ��Ӧ״̬
	 */
	private Integer exitStatus;
	/**
	 * ��Ӧ��Ϣ
	 */
	private String message;
	/**
	 * ��ҵʱ�η���ͳ��
	 */
	private List<JobTimeStatistics> jobTimeStatistics;

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
	 * ��ȡ��ҵʱ�η���ͳ��
	 * 
	 * @return ��ҵʱ�η���ͳ��
	 */
	@XmlElement(name = "Data")
	public List<JobTimeStatistics> getJobTimeStatistics() {
		return jobTimeStatistics;
	}

	/**
	 * ������ҵʱ�η���ͳ��
	 * 
	 * @param jobTimeStatistics
	 *            ��ҵʱ�η���ͳ��
	 */
	public void setJobTimeStatistics(List<JobTimeStatistics> jobTimeStatistics) {
		this.jobTimeStatistics = jobTimeStatistics;
	}
}
