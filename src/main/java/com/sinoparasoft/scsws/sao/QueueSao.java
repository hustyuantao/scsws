package com.sinoparasoft.scsws.sao;

import java.util.List;

import com.sinoparasoft.scsws.entity.SchedQueue;

/**
 * 任务调度器队列管理接口
 * 
 * @author 袁涛
 */
public interface QueueSao {
	/**
	 * 查询队列信息列表
	 * 
	 * @return 队列信息列表
	 */
	public List<SchedQueue> query();

	/**
	 * 查询队列信息
	 * 
	 * @param name
	 *            队列名称
	 * @return 队列信息
	 */
	public SchedQueue query(String name);

	/**
	 * 查询队列名称列表
	 * 
	 * @return 队列名称列表
	 */
	public List<String> queryForNameList();

	/**
	 * 队列是否可用
	 * 
	 * @param queue
	 *            队列信息
	 * @return 是或否
	 */
	public Boolean isEnabled(SchedQueue queue);

	/**
	 * 队列是否开启
	 * 
	 * @param queue
	 *            队列信息
	 * @return 是或否
	 */
	public Boolean isStarted(SchedQueue queue);

	/**
	 * 队列是否指定主机
	 * 
	 * @param queue
	 *            队列信息
	 * @return 是或否
	 */
	public Boolean isSpecified(SchedQueue queue);

	/**
	 * 创建队列
	 * 
	 * @param queue
	 *            队列信息
	 * @return 成功与否
	 */
	public Boolean create(SchedQueue queue);

	/**
	 * 修改队列信息
	 * 
	 * @param queue
	 *            队列信息
	 * @return 成功与否
	 */
	public Boolean update(SchedQueue queue);

	/**
	 * 删除队列
	 * 
	 * @param queue
	 *            队列信息
	 * @return 成功与否
	 */
	public Boolean delete(SchedQueue queue);
}
