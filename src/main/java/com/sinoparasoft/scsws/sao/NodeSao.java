package com.sinoparasoft.scsws.sao;

import java.util.List;

import com.sinoparasoft.scsws.entity.SchedNode;

/**
 * 任务调度器主机管理接口
 * 
 * @author 袁涛
 */
public interface NodeSao {
	/**
	 * 查询主机信息列表
	 * 
	 * @return 主机信息列表
	 */
	public List<SchedNode> query();

	/**
	 * 查询主机信息
	 * 
	 * @param name
	 *            主机名称
	 * @return 主机信息
	 */
	public SchedNode query(String name);

	/**
	 * 查询主机名称列表
	 * 
	 * @return 主机名称列表
	 */
	public List<String> queryForNameList();

	/**
	 * 是否在线
	 * 
	 * @param node
	 *            主机信息
	 * @return 是或否
	 */
	public Boolean isOnline(SchedNode node);

	/**
	 * 是否下线
	 * 
	 * @param node
	 *            主机信息
	 * @return 是或否
	 */
	public Boolean isOffline(SchedNode node);

	/**
	 * 是否宕机
	 * 
	 * @param node
	 *            主机信息
	 * @return 是或否
	 */
	public Boolean isDown(SchedNode node);
}
