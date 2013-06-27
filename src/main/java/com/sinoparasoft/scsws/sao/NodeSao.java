package com.sinoparasoft.scsws.sao;

import java.util.List;

import com.sinoparasoft.scsws.entity.SchedNode;

/**
 * �����������������ӿ�
 * 
 * @author Ԭ��
 */
public interface NodeSao {
	/**
	 * ��ѯ������Ϣ�б�
	 * 
	 * @return ������Ϣ�б�
	 */
	public List<SchedNode> query();

	/**
	 * ��ѯ������Ϣ
	 * 
	 * @param name
	 *            ��������
	 * @return ������Ϣ
	 */
	public SchedNode query(String name);

	/**
	 * ��ѯ���������б�
	 * 
	 * @return ���������б�
	 */
	public List<String> queryForNameList();

	/**
	 * �Ƿ�����
	 * 
	 * @param node
	 *            ������Ϣ
	 * @return �ǻ��
	 */
	public Boolean isOnline(SchedNode node);

	/**
	 * �Ƿ�����
	 * 
	 * @param node
	 *            ������Ϣ
	 * @return �ǻ��
	 */
	public Boolean isOffline(SchedNode node);

	/**
	 * �Ƿ�崻�
	 * 
	 * @param node
	 *            ������Ϣ
	 * @return �ǻ��
	 */
	public Boolean isDown(SchedNode node);
}
