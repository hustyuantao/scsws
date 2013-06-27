package com.sinoparasoft.scsws.entity;

import java.sql.Timestamp;

/**
 * ���ݿ��cluster��ʵ����
 * 
 * @author Ԭ��
 */
public class TableCluster {
	/**
	 * ��Ⱥ�ܺ���
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
	 * ��Ⱥ��Ϣ����ʱ��
	 */
	private Timestamp modifiedTime;

	/**
	 * ��ȡ��Ⱥ�ܺ���
	 * 
	 * @return ��Ⱥ�ܺ���
	 */
	public Integer getTotalCoresNum() {
		return totalCoresNum;
	}

	/**
	 * ���ü�Ⱥ�ܺ���
	 * 
	 * @param totalCoresNum
	 *            ��Ⱥ�ܺ���
	 */
	public void setTotalCoresNum(Integer totalCoresNum) {
		this.totalCoresNum = totalCoresNum;
	}

	/**
	 * ��ȡ����״̬�ڵ�ĺ���
	 * 
	 * @return ����״̬�ڵ�ĺ���
	 */
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

	/**
	 * ��ȡ��Ⱥ��Ϣ����ʱ��
	 * 
	 * @return ��Ⱥ��Ϣ����ʱ��
	 */
	public Timestamp getModifiedTime() {
		return modifiedTime;
	}

	/**
	 * ���ü�Ⱥ��Ϣ����ʱ��
	 * 
	 * @param modifiedTime
	 *            ��Ⱥ��Ϣ����ʱ��
	 */
	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
}
