package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ��ҵ���ʹ��ͳ��������
 * 
 * @author Ԭ��
 */
@XmlRootElement(name = "GetSolverWaitQueue")
public class JobSoftwareStatisticsRequest {
	/**
	 * ��ʼʱ��
	 */
	private String startTime;
	/**
	 * ����ʱ��
	 */
	private String endTime;
	/**
	 * �������
	 */
	private String softwareName;

	/**
	 * ��ȡ��ʼʱ��
	 * 
	 * @return ��ʼʱ��
	 */
	@XmlElement(name = "StartDate")
	public String getStartTime() {
		return startTime;
	}

	/**
	 * ���ÿ�ʼʱ��
	 * 
	 * @param startTime
	 *            ��ʼʱ��
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * ��ȡ����ʱ��
	 * 
	 * @return ����ʱ��
	 */
	@XmlElement(name = "EndDate")
	public String getEndTime() {
		return endTime;
	}

	/**
	 * ���ý���ʱ��
	 * 
	 * @param endTime
	 *            ����ʱ��
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * ��ȡ�������
	 * 
	 * @return �������
	 */
	@XmlElement(name = "SolverName")
	public String getSoftwareName() {
		return softwareName;
	}

	/**
	 * �����������
	 * 
	 * @param softwareName
	 *            �������
	 */
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
}
