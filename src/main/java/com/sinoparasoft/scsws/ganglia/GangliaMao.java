package com.sinoparasoft.scsws.ganglia;

import java.util.List;

import com.sinoparasoft.scsws.entity.NodeMetric;

/**
 * Ganglia度量访问接口
 * 
 * @author 袁涛
 */
public interface GangliaMao {
	/**
	 * 查询度量
	 * 
	 * @return 度量列表
	 */
	public List<NodeMetric> query();

	/**
	 * 查询主机度量
	 * 
	 * @param name
	 *            主机名称
	 * @return 主机度量
	 */
	public NodeMetric query(String name);
}
