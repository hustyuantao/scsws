package com.sinoparasoft.scsws.dao;

import com.sinoparasoft.scsws.entity.TableCluster;

/**
 * ���ݿ��cluster���ʽӿ�
 * 
 * @author Ԭ��
 * @version 1.0
 */
public interface ClusterDao {
	/**
	 * ��ѯ��Ⱥ��Ϣ
	 * 
	 * @return ��Ⱥ��Ϣ
	 */
	public TableCluster query();

	/**
	 * ������Ⱥ��Ϣ
	 * 
	 * @param cluster
	 *            ��Ⱥ��Ϣ
	 * @return �ɹ����
	 */
	public Boolean create(TableCluster cluster);

	/**
	 * ���¼�Ⱥ��Ϣ
	 * 
	 * @param cluster
	 *            ��Ⱥ��Ϣ
	 * @return �ɹ����
	 */
	public Boolean update(TableCluster cluster);

	/**
	 * ɾ����Ⱥ��Ϣ
	 * 
	 * @return �ɹ����
	 */
	public Boolean delete();
}
