package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * ��ҵͳ����Ӧ��
 * 
 * @author Ԭ��
 */
@XmlRootElement(name = "GetJobCounterResult")
@XmlType(propOrder = { "queuedJobNum", "runningJobNum", "finishedJobNum",
		"failedJobNum", "canceledJobNum", "queuedCoresNum", "runningCoresNum",
		"finishedCoresNum", "failedCoresNum", "canceledCoresNum" })
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class JobStatisticsResponse {
	/**
	 * ��Ӧ״̬
	 */
	private Integer exitStatus;
	/**
	 * ��Ӧ��Ϣ
	 */
	private String message;
	/**
	 * �Ŷ���ҵ��
	 */
	private Integer queuedJobNum;
	/**
	 * ������ҵ��
	 */
	private Integer runningJobNum;
	/**
	 * �����ҵ��
	 */
	private Integer finishedJobNum;
	/**
	 * ʧ����ҵ��
	 */
	private Integer failedJobNum;
	/**
	 * ȡ����ҵ��
	 */
	private Integer canceledJobNum;
	/**
	 * �Ŷ���ҵ����������ͳ��
	 */
	private Integer queuedCoresNum;
	/**
	 * ������ҵ����������ͳ��
	 */
	private Integer runningCoresNum;
	/**
	 * �����ҵ����������ͳ��
	 */
	private Integer finishedCoresNum;
	/**
	 * ʧ����ҵ����������ͳ��
	 */
	private Integer failedCoresNum;
	/**
	 * ȡ����ҵ����������ͳ��
	 */
	private Integer canceledCoresNum;

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
	 * ��ȡ�Ŷ���ҵ��
	 * 
	 * @return �Ŷ���ҵ��
	 */
	@XmlElement(name = "QueuedJobs")
	public Integer getQueuedJobNum() {
		return queuedJobNum;
	}

	/**
	 * �����Ŷ���ҵ��
	 * 
	 * @param queuedJobNum
	 *            �Ŷ���ҵ��
	 */
	public void setQueuedJobNum(Integer queuedJobNum) {
		this.queuedJobNum = queuedJobNum;
	}

	/**
	 * ��ȡ������ҵ��
	 * 
	 * @return ������ҵ��
	 */
	@XmlElement(name = "RunningJobs")
	public Integer getRunningJobNum() {
		return runningJobNum;
	}

	/**
	 * ����������ҵ��
	 * 
	 * @param runningJobNum
	 *            ������ҵ��
	 */
	public void setRunningJobNum(Integer runningJobNum) {
		this.runningJobNum = runningJobNum;
	}

	/**
	 * �����ҵ��
	 * 
	 * @return �����ҵ��
	 */
	@XmlElement(name = "FinishedJobs")
	public Integer getFinishedJobNum() {
		return finishedJobNum;
	}

	/**
	 * ���������ҵ��
	 * 
	 * @param finishedJobNum
	 *            �����ҵ��
	 */
	public void setFinishedJobNum(Integer finishedJobNum) {
		this.finishedJobNum = finishedJobNum;
	}

	/**
	 * ��ȡʧ����ҵ��
	 * 
	 * @return ʧ����ҵ��
	 */
	@XmlElement(name = "FailedJobs")
	public Integer getFailedJobNum() {
		return failedJobNum;
	}

	/**
	 * ����ʧ����ҵ��
	 * 
	 * @param failedJobNum
	 *            ʧ����ҵ��
	 */
	public void setFailedJobNum(Integer failedJobNum) {
		this.failedJobNum = failedJobNum;
	}

	/**
	 * ��ȡȡ����ҵ��
	 * 
	 * @return ȡ����ҵ��
	 */
	@XmlElement(name = "CanceledJobs")
	public Integer getCanceledJobNum() {
		return canceledJobNum;
	}

	/**
	 * ����ȡ����ҵ��
	 * 
	 * @param canceledJobNum
	 *            ȡ����ҵ��
	 */
	public void setCanceledJobNum(Integer canceledJobNum) {
		this.canceledJobNum = canceledJobNum;
	}

	/**
	 * ��ȡ�Ŷ���ҵ����������ͳ��
	 * 
	 * @return �Ŷ���ҵ����������ͳ��
	 */
	@XmlElement(name = "QueuedCores")
	public Integer getQueuedCoresNum() {
		return queuedCoresNum;
	}

	/**
	 * �����Ŷ���ҵ����������ͳ��
	 * 
	 * @param queuedCoresNum
	 *            �Ŷ���ҵ����������ͳ��
	 */
	public void setQueuedCoresNum(Integer queuedCoresNum) {
		this.queuedCoresNum = queuedCoresNum;
	}

	/**
	 * ��ȡ������ҵ����������ͳ��
	 * 
	 * @return ������ҵ����������ͳ��
	 */
	@XmlElement(name = "RunningCores")
	public Integer getRunningCoresNum() {
		return runningCoresNum;
	}

	/**
	 * ����������ҵ����������ͳ��
	 * 
	 * @param runningCoresNum
	 *            ������ҵ����������ͳ��
	 */
	public void setRunningCoresNum(Integer runningCoresNum) {
		this.runningCoresNum = runningCoresNum;
	}

	/**
	 * ��ȡ�����ҵ����������ͳ��
	 * 
	 * @return �����ҵ����������ͳ��
	 */
	@XmlElement(name = "FinishedCores")
	public Integer getFinishedCoresNum() {
		return finishedCoresNum;
	}

	/**
	 * ���������ҵ����������ͳ��
	 * 
	 * @param finishedCoresNum
	 *            �����ҵ����������ͳ��
	 */
	public void setFinishedCoresNum(Integer finishedCoresNum) {
		this.finishedCoresNum = finishedCoresNum;
	}

	/**
	 * ��ȡʧ����ҵ����������ͳ��
	 * 
	 * @return ʧ����ҵ����������ͳ��
	 */
	@XmlElement(name = "FailedCores")
	public Integer getFailedCoresNum() {
		return failedCoresNum;
	}

	/**
	 * ����ʧ����ҵ����������ͳ��
	 * 
	 * @param failedCoresNum
	 *            ʧ����ҵ����������ͳ��
	 */
	public void setFailedCoresNum(Integer failedCoresNum) {
		this.failedCoresNum = failedCoresNum;
	}

	/**
	 * ��ȡȡ����ҵ����������ͳ��
	 * 
	 * @return ȡ����ҵ����������ͳ��
	 */
	@XmlElement(name = "CanceledCores")
	public Integer getCanceledCoresNum() {
		return canceledCoresNum;
	}

	/**
	 * ����ȡ����ҵ����������ͳ��
	 * 
	 * @param canceledCoresNum
	 *            ȡ����ҵ����������ͳ��
	 */
	public void setCanceledCoresNum(Integer canceledCoresNum) {
		this.canceledCoresNum = canceledCoresNum;
	}
}
