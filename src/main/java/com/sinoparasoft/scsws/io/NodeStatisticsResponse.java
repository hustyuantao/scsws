package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * ��Ⱥͳ����Ϣ��Ӧ��
 * 
 * @author Ԭ��
 * @version 1.0
 */
@XmlRootElement(name = "GetClusterCounterResult")
@XmlType(propOrder = { "totalCoresNum", "unknownCoresNum", "downCoresNum",
		"offlineCoresNum", "onlineCoresNum", "freeCoresNum", "usedCoresNum" })
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class NodeStatisticsResponse {
	/**
	 * ��Ӧ״̬
	 */
	private Integer exitStatus;
	/**
	 * ��Ӧ��Ϣ
	 */
	private String message;
	/**
	 * ��Ⱥ�������ܺ���
	 */
	private Integer totalCoresNum;
	/**
	 * ����״̬�ڵ�ĺ���
	 */
	private Integer unknownCoresNum;
	/**
	 * �ػ�״̬�ڵ�ĺ���
	 */
	private Integer downCoresNum;
	/**
	 * ����״̬�ڵ�ĺ���
	 */
	private Integer offlineCoresNum;
	/**
	 * ����״̬�ڵ�ĺ���
	 */
	private Integer onlineCoresNum;
	/**
	 * ����״̬�ڵ�Ŀ��к���
	 */
	private Integer freeCoresNum;
	/**
	 * ����״̬�ڵ��ռ�ú���
	 */
	private Integer usedCoresNum;

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
	 * ��ȡ��Ⱥ�������ܺ���
	 * 
	 * @return ��Ⱥ�������ܺ���
	 */
	@XmlElement(name = "TotalCores")
	public Integer getTotalCoresNum() {
		return totalCoresNum;
	}

	/**
	 * ���ü�Ⱥ�������ܺ���
	 * 
	 * @param totalCoresNum
	 *            ��Ⱥ�������ܺ���
	 */
	public void setTotalCoresNum(Integer totalCoresNum) {
		this.totalCoresNum = totalCoresNum;
	}

	/**
	 * ��ȡ����״̬�ڵ�ĺ���
	 * 
	 * @return ����״̬�ڵ�ĺ���
	 */
	@XmlElement(name = "UnknownCores")
	public Integer getUnknownCoresNum() {
		return unknownCoresNum;
	}

	/**
	 * ���ò���״̬�ڵ�ĺ���
	 * 
	 * @param unknownCoresNum
	 *            ����״̬�ڵ�ĺ���
	 */
	public void setUnknownCoresNum(Integer unknownCoresNum) {
		this.unknownCoresNum = unknownCoresNum;
	}

	/**
	 * ��ȡ�ػ�״̬�ڵ�ĺ���
	 * 
	 * @return �ػ�״̬�ڵ�ĺ���
	 */
	@XmlElement(name = "DownCores")
	public Integer getDownCoresNum() {
		return downCoresNum;
	}

	/**
	 * ���ùػ�״̬�ڵ�ĺ���
	 * 
	 * @param downCoresNum
	 *            �ػ�״̬�ڵ�ĺ���
	 */
	public void setDownCoresNum(Integer downCoresNum) {
		this.downCoresNum = downCoresNum;
	}

	/**
	 * ��ȡ����״̬�ڵ�ĺ���
	 * 
	 * @return ����״̬�ڵ�ĺ���
	 */
	@XmlElement(name = "OfflineCores")
	public Integer getOfflineCoresNum() {
		return offlineCoresNum;
	}

	/**
	 * ��������״̬�ڵ�ĺ���
	 * 
	 * @param offlineCoresNum
	 *            ����״̬�ڵ�ĺ���
	 */
	public void setOfflineCoresNum(Integer offlineCoresNum) {
		this.offlineCoresNum = offlineCoresNum;
	}

	/**
	 * ��ȡ����״̬�ڵ�ĺ���
	 * 
	 * @return ����״̬�ڵ�ĺ���
	 */
	@XmlElement(name = "OnlineCores")
	public Integer getOnlineCoresNum() {
		return onlineCoresNum;
	}

	/**
	 * ��������״̬�ڵ�ĺ���
	 * 
	 * @param onlineCoresNum
	 *            ����״̬�ڵ�ĺ���
	 */
	public void setOnlineCoresNum(Integer onlineCoresNum) {
		this.onlineCoresNum = onlineCoresNum;
	}

	/**
	 * ��ȡ����״̬�ڵ�Ŀ��к���
	 * 
	 * @return ����״̬�ڵ�Ŀ��к���
	 */
	@XmlElement(name = "FreeCores")
	public Integer getFreeCoresNum() {
		return freeCoresNum;
	}

	/**
	 * ��������״̬�ڵ�Ŀ��к���
	 * 
	 * @param freeCoresNum
	 *            ����״̬�ڵ�Ŀ��к���
	 */
	public void setFreeCoresNum(Integer freeCoresNum) {
		this.freeCoresNum = freeCoresNum;
	}

	/**
	 * ��ȡ����״̬�ڵ��ռ�ú���
	 * 
	 * @return ����״̬�ڵ��ռ�ú���
	 */
	@XmlElement(name = "UsedCores")
	public Integer getUsedCoresNum() {
		return usedCoresNum;
	}

	/**
	 * ��������״̬�ڵ��ռ�ú���
	 * 
	 * @param usedCoresNum
	 *            ����״̬�ڵ��ռ�ú���
	 */
	public void setUsedCoresNum(Integer usedCoresNum) {
		this.usedCoresNum = usedCoresNum;
	}
}
