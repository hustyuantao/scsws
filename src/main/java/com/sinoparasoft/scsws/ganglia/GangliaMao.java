package com.sinoparasoft.scsws.ganglia;

import java.util.List;

import com.sinoparasoft.scsws.entity.NodeMetric;

/**
 * Ganglia�������ʽӿ�
 * 
 * @author Ԭ��
 */
public interface GangliaMao {
	/**
	 * ��ѯ����
	 * 
	 * @return �����б�
	 */
	public List<NodeMetric> query();

	/**
	 * ��ѯ��������
	 * 
	 * @param name
	 *            ��������
	 * @return ��������
	 */
	public NodeMetric query(String name);
}
