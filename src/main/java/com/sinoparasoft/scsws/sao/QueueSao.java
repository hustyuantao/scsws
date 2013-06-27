package com.sinoparasoft.scsws.sao;

import java.util.List;

import com.sinoparasoft.scsws.entity.SchedQueue;

/**
 * ������������й���ӿ�
 * 
 * @author Ԭ��
 */
public interface QueueSao {
	/**
	 * ��ѯ������Ϣ�б�
	 * 
	 * @return ������Ϣ�б�
	 */
	public List<SchedQueue> query();

	/**
	 * ��ѯ������Ϣ
	 * 
	 * @param name
	 *            ��������
	 * @return ������Ϣ
	 */
	public SchedQueue query(String name);

	/**
	 * ��ѯ���������б�
	 * 
	 * @return ���������б�
	 */
	public List<String> queryForNameList();

	/**
	 * �����Ƿ����
	 * 
	 * @param queue
	 *            ������Ϣ
	 * @return �ǻ��
	 */
	public Boolean isEnabled(SchedQueue queue);

	/**
	 * �����Ƿ���
	 * 
	 * @param queue
	 *            ������Ϣ
	 * @return �ǻ��
	 */
	public Boolean isStarted(SchedQueue queue);

	/**
	 * �����Ƿ�ָ������
	 * 
	 * @param queue
	 *            ������Ϣ
	 * @return �ǻ��
	 */
	public Boolean isSpecified(SchedQueue queue);

	/**
	 * ��������
	 * 
	 * @param queue
	 *            ������Ϣ
	 * @return �ɹ����
	 */
	public Boolean create(SchedQueue queue);

	/**
	 * �޸Ķ�����Ϣ
	 * 
	 * @param queue
	 *            ������Ϣ
	 * @return �ɹ����
	 */
	public Boolean update(SchedQueue queue);

	/**
	 * ɾ������
	 * 
	 * @param queue
	 *            ������Ϣ
	 * @return �ɹ����
	 */
	public Boolean delete(SchedQueue queue);
}
