package com.sinoparasoft.scsws.sao;

import com.sinoparasoft.scsws.entity.SchedJob;

/**
 * �����������ҵ����ӿ�
 * 
 * @author Ԭ��
 */
public interface JobSao {
	/**
	 * ��ѯ��ҵ��Ϣ
	 * 
	 * @param id
	 *            ��ҵ���
	 * @return ��ҵ��Ϣ
	 */
	public SchedJob query(Integer id);

	/**
	 * ��ҵ�Ƿ��Ŷ���
	 * 
	 * @param job
	 *            ��ҵ��Ϣ
	 * @return �ǻ��
	 */
	public Boolean isQueued(SchedJob job);

	/**
	 * ��ҵ�Ƿ���������
	 * 
	 * @param job
	 *            ��ҵ��Ϣ
	 * @return �ǻ��
	 */
	public Boolean isRunning(SchedJob job);

	/**
	 * ��ҵ�Ƿ����
	 * 
	 * @param job
	 *            ��ҵ��Ϣ
	 * @return �ǻ��
	 */
	public Boolean isFinished(SchedJob job);

	/**
	 * ��ҵ�Ƿ�ȡ��
	 * 
	 * @param job
	 *            ��ҵ��Ϣ
	 * @return �ǻ��
	 */
	public Boolean isCanceled(SchedJob job);

	/**
	 * ��ҵ�Ƿ�ʧ��
	 * 
	 * @param job
	 *            ��ҵ��Ϣ
	 * @return �ǻ��
	 */
	public Boolean isFailed(SchedJob job);

	/**
	 * �ύ��ҵ
	 * 
	 * @param job
	 *            ��ҵ��Ϣ
	 * @return ��ҵ���
	 */
	public Integer submit(SchedJob job);

	/**
	 * ��ͣ��ҵ
	 * 
	 * @param id
	 *            ��ҵ���
	 * @return �ɹ����
	 */
	public Boolean suspend(Integer id);

	/**
	 * ȡ����ҵ
	 * 
	 * @param id
	 *            ��ҵ���
	 * @return �ɹ����
	 */
	public Boolean kill(Integer id);

	/**
	 * �ָ���ҵ
	 * 
	 * @param id
	 *            ��ҵ���
	 * @return �ɹ����
	 */
	public Boolean resume(Integer id);
}
