package com.sinoparasoft.scsws.sao;

import com.sinoparasoft.scsws.entity.SchedJob;

/**
 * 任务调度器作业管理接口
 * 
 * @author 袁涛
 */
public interface JobSao {
	/**
	 * 查询作业信息
	 * 
	 * @param id
	 *            作业编号
	 * @return 作业信息
	 */
	public SchedJob query(Integer id);

	/**
	 * 作业是否排队中
	 * 
	 * @param job
	 *            作业信息
	 * @return 是或否
	 */
	public Boolean isQueued(SchedJob job);

	/**
	 * 作业是否正在运行
	 * 
	 * @param job
	 *            作业信息
	 * @return 是或否
	 */
	public Boolean isRunning(SchedJob job);

	/**
	 * 作业是否完成
	 * 
	 * @param job
	 *            作业信息
	 * @return 是或否
	 */
	public Boolean isFinished(SchedJob job);

	/**
	 * 作业是否取消
	 * 
	 * @param job
	 *            作业信息
	 * @return 是或否
	 */
	public Boolean isCanceled(SchedJob job);

	/**
	 * 作业是否失败
	 * 
	 * @param job
	 *            作业信息
	 * @return 是或否
	 */
	public Boolean isFailed(SchedJob job);

	/**
	 * 提交作业
	 * 
	 * @param job
	 *            作业信息
	 * @return 作业编号
	 */
	public Integer submit(SchedJob job);

	/**
	 * 暂停作业
	 * 
	 * @param id
	 *            作业编号
	 * @return 成功与否
	 */
	public Boolean suspend(Integer id);

	/**
	 * 取消作业
	 * 
	 * @param id
	 *            作业编号
	 * @return 成功与否
	 */
	public Boolean kill(Integer id);

	/**
	 * 恢复作业
	 * 
	 * @param id
	 *            作业编号
	 * @return 成功与否
	 */
	public Boolean resume(Integer id);
}
