package com.sinoparasoft.scsws.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * �ڵ㸺����
 * 
 * @author Ԭ��
 * @version 1.0
 */
@XmlRootElement(name = "Data")
@XmlType(propOrder = { "nodeName", "totalTime", "totalFreeTime", "totalRunTime" })
public class NodeLoad {
	/**
	 * ��������
	 */
	private String nodeName;
	/**
	 * ��ʱ��
	 */
	private Float totalTime;
	/**
	 * �ܵĿ���ʱ��
	 */
	private Float totalFreeTime;
	/**
	 * �ܵ�����ʱ��
	 */
	private Float totalRunTime;

	/**
	 * ��ȡ��������
	 * 
	 * @return ��������
	 */
	@XmlElement(name = "NodeName")
	public String getNodeName() {
		return nodeName;
	}

	/**
	 * ������������
	 * 
	 * @param nodeName
	 *            ��������
	 */
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	/**
	 * ��ȡ��ʱ��
	 * 
	 * @return ��ʱ��
	 */
	@XmlElement(name = "TotalTime")
	public Float getTotalTime() {
		return totalTime;
	}

	/**
	 * ������ʱ��
	 * 
	 * @param totalTime
	 *            ��ʱ��
	 */
	public void setTotalTime(Float totalTime) {
		this.totalTime = totalTime;
	}

	/**
	 * ��ȡ�ܵĿ���ʱ��
	 * 
	 * @return �ܵĿ���ʱ��
	 */
	@XmlElement(name = "FreeTime")
	public Float getTotalFreeTime() {
		return totalFreeTime;
	}

	/**
	 * �����ܵĿ���ʱ��
	 * 
	 * @param totalFreeTime
	 *            �ܵĿ���ʱ��
	 */
	public void setTotalFreeTime(Float totalFreeTime) {
		this.totalFreeTime = totalFreeTime;
	}

	/**
	 * ��ȡ�ܵ�����ʱ��
	 * 
	 * @return �ܵ�����ʱ��
	 */
	@XmlElement(name = "TotalUseTime")
	public Float getTotalRunTime() {
		return totalRunTime;
	}

	/**
	 * �����ܵ�����ʱ��
	 * 
	 * @param totalRunTime
	 *            �ܵ�����ʱ��
	 */
	public void setTotalRunTime(Float totalRunTime) {
		this.totalRunTime = totalRunTime;
	}
}
