package com.sinoparasoft.scsws.dao;

import com.sinoparasoft.scsws.entity.TableCluster;

/**
 * 数据库表cluster访问接口
 * 
 * @author 袁涛
 * @version 1.0
 */
public interface ClusterDao {
	/**
	 * 查询集群信息
	 * 
	 * @return 集群信息
	 */
	public TableCluster query();

	/**
	 * 创建集群信息
	 * 
	 * @param cluster
	 *            集群信息
	 * @return 成功与否
	 */
	public Boolean create(TableCluster cluster);

	/**
	 * 更新集群信息
	 * 
	 * @param cluster
	 *            集群信息
	 * @return 成功与否
	 */
	public Boolean update(TableCluster cluster);

	/**
	 * 删除集群信息
	 * 
	 * @return 成功与否
	 */
	public Boolean delete();
}
