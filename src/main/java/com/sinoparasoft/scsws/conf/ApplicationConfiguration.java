package com.sinoparasoft.scsws.conf;

/**
 * 应用程序配置抽象类
 * 
 * @author 袁涛
 * @version 1.0
 */
public abstract class ApplicationConfiguration {
	/**
	 * 配置属性常量
	 */
	public static final String COPY_FILE_ENABLED = "copy_on_compute";
	public static final String CLIENT_SHARE_ROOT_DIRECTORY = "windows_share_root";
	public static final String SERVER_SHARE_ROOT_DIRECTORY = "linux_share_root";
	public static final String SERVER_WORK_ROOT_DIRECTORY = "linux_copy_root";
	public static final String SERVER_SAMBA_ROOT_DIRECTORY = "samba_linux_copy_root";
	public static final String DATABASE_SERVER_NAME = "db_server_name";
	public static final String DATABASE_NAME = "db_name";
	public static final String DATABASE_USER_NAME = "db_username";
	public static final String DATABASE_PASSWORD = "db_password";
	public static final String SCHEDULER_ADMINISTRATOR = "config_admin";
	public static final String SCHEDULER_CONFIG_DIRECTORY = "config_dir";
	public static final String CHECK_POLICY_ENABLED = "enable_check_policy";
	public static final String CHECK_POLICY_SERVICE_URL = "check_policy_service";
	public static final String CHECK_POLICY_PASS_RESPONSE = "check_policy_pass_string";
	public static final String MAX_HISTORY_LENGTH = "node_metric_history_length";
	/**
	 * 是否在作业执行前后进行文件传输
	 */
	private Boolean copyFileEnabled;
	/**
	 * 客户端共享根目录
	 */
	private String clientShareRootDirectory;
	/**
	 * 服务端共享根目录
	 */
	private String serverShareRootDirectory;
	/**
	 * 服务端工作根目录
	 */
	private String serverWorkRootDirectory;
	/**
	 * 服务端Samba共享根目录
	 */
	private String serverSambaRootDirectory;
	/**
	 * 数据库服务器名称
	 */
	private String databaseServerName;
	/**
	 * 数据库名称
	 */
	private String databaseName;
	/**
	 * 数据库用户名称
	 */
	private String databaseUserName;
	/**
	 * 数据库用户密码
	 */
	private String databasePassword;
	/**
	 * 作业调度器管理员账户
	 */
	private String schedulerAdministrator;
	/**
	 * 作业调度器配置文件目录
	 */
	private String schedulerConfigDirectory;
	/**
	 * 作业执行前是否进行策略检查
	 */
	private Boolean checkPolicyEnabled;
	/**
	 * 作业策略检查服务地址
	 */
	private String checkPolicyServiceUrl;
	/**
	 * 作业策略检查通过响应
	 */
	private String checkPolicyPassResponse;
	/**
	 * 最大历史数据长度
	 */
	private Integer maxHistoryLength;

	/**
	 * 是否在作业执行前后进行文件传输
	 * 
	 * @return 是或否
	 */
	public Boolean getCopyFileEnabled() {
		return copyFileEnabled;
	}

	/**
	 * 设置是否在作业执行前后进行文件传输
	 * 
	 * @param copyFileEnabled
	 *            是或否
	 */
	public void setCopyFileEnabled(Boolean copyFileEnabled) {
		this.copyFileEnabled = copyFileEnabled;
	}

	/**
	 * 获取客户端共享根目录
	 * 
	 * @return 客户端共享根目录
	 */
	public String getClientShareRootDirectory() {
		return clientShareRootDirectory;
	}

	/**
	 * 设置客户端共享根目录
	 * 
	 * @param clientShareRootDirectory
	 *            客户端共享根目录
	 */
	public void setClientShareRootDirectory(String clientShareRootDirectory) {
		this.clientShareRootDirectory = clientShareRootDirectory;
	}

	/**
	 * 获取服务端共享根目录
	 * 
	 * @return 服务端共享根目录
	 */
	public String getServerShareRootDirectory() {
		return serverShareRootDirectory;
	}

	/**
	 * 设置服务端共享根目录
	 * 
	 * @param serverShareRootDirectory
	 *            服务端共享根目录
	 */
	public void setServerShareRootDirectory(String serverShareRootDirectory) {
		this.serverShareRootDirectory = serverShareRootDirectory;
	}

	/**
	 * 获取服务端工作根目录
	 * 
	 * @return 服务端工作根目录
	 */
	public String getServerWorkRootDirectory() {
		return serverWorkRootDirectory;
	}

	/**
	 * 设置服务端工作根目录
	 * 
	 * @param serverWorkRootDirectory
	 *            服务端工作根目录
	 */
	public void setServerWorkRootDirectory(String serverWorkRootDirectory) {
		this.serverWorkRootDirectory = serverWorkRootDirectory;
	}

	/**
	 * 获取服务端Samba共享根目录
	 * 
	 * @return 服务端Samba共享根目录
	 */
	public String getServerSambaRootDirectory() {
		return serverSambaRootDirectory;
	}

	/**
	 * 设置服务端Samba共享根目录
	 * 
	 * @param serverSambaRootDirectory
	 *            服务端Samba共享根目录
	 */
	public void setServerSambaRootDirectory(String serverSambaRootDirectory) {
		this.serverSambaRootDirectory = serverSambaRootDirectory;
	}

	/**
	 * 获取数据库服务器名称
	 * 
	 * @return 数据库服务器名称
	 */
	public String getDatabaseServerName() {
		return databaseServerName;
	}

	/**
	 * 设置数据库服务器名称
	 * 
	 * @param databaseServerName
	 *            数据库服务器名称
	 */
	public void setDatabaseServerName(String databaseServerName) {
		this.databaseServerName = databaseServerName;
	}

	/**
	 * 获取数据库名称
	 * 
	 * @return 数据库名称
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * 设置数据库名称
	 * 
	 * @param databaseName
	 *            数据库名称
	 */
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	/**
	 * 获取数据库用户名称
	 * 
	 * @return 数据库用户名称
	 */
	public String getDatabaseUserName() {
		return databaseUserName;
	}

	/**
	 * 设置数据库用户名称
	 * 
	 * @param databaseUserName
	 *            数据库用户名称
	 */
	public void setDatabaseUserName(String databaseUserName) {
		this.databaseUserName = databaseUserName;
	}

	/**
	 * 获取数据库用户密码
	 * 
	 * @return 数据库用户密码
	 */
	public String getDatabasePassword() {
		return databasePassword;
	}

	/**
	 * 设置数据库用户密码
	 * 
	 * @param databasePassword
	 *            数据库用户密码
	 */
	public void setDatabasePassword(String databasePassword) {
		this.databasePassword = databasePassword;
	}

	/**
	 * 获取作业调度器管理员账户
	 * 
	 * @return 作业调度器管理员账户
	 */
	public String getSchedulerAdministrator() {
		return schedulerAdministrator;
	}

	/**
	 * 设置作业调度器管理员账户
	 * 
	 * @param schedulerAdministrator
	 *            作业调度器管理员账户
	 */
	public void setSchedulerAdministrator(String schedulerAdministrator) {
		this.schedulerAdministrator = schedulerAdministrator;
	}

	/**
	 * 获取作业调度器配置文件目录
	 * 
	 * @return 作业调度器配置文件目录
	 */
	public String getSchedulerConfigDirectory() {
		return schedulerConfigDirectory;
	}

	/**
	 * 设置作业调度器配置文件目录
	 * 
	 * @param schedulerConfigDirectory
	 *            作业调度器配置文件目录
	 */
	public void setSchedulerConfigDirectory(String schedulerConfigDirectory) {
		this.schedulerConfigDirectory = schedulerConfigDirectory;
	}

	/**
	 * 作业执行前是否进行策略检查
	 * 
	 * @return 是或否
	 */
	public Boolean getCheckPolicyEnabled() {
		return checkPolicyEnabled;
	}

	/**
	 * 设置作业执行前是否进行策略检查
	 * 
	 * @param checkPolicyEnabled
	 *            是或否
	 */
	public void setCheckPolicyEnabled(Boolean checkPolicyEnabled) {
		this.checkPolicyEnabled = checkPolicyEnabled;
	}

	/**
	 * 获取作业策略检查服务地址
	 * 
	 * @return 作业策略检查服务地址
	 */
	public String getCheckPolicyServiceUrl() {
		return checkPolicyServiceUrl;
	}

	/**
	 * 设置作业策略检查服务地址
	 * 
	 * @param checkPolicyServiceUrl
	 *            作业策略检查服务地址
	 */
	public void setCheckPolicyServiceUrl(String checkPolicyServiceUrl) {
		this.checkPolicyServiceUrl = checkPolicyServiceUrl;
	}

	/**
	 * 获取作业策略检查通过响应
	 * 
	 * @return 作业策略检查通过响应
	 */
	public String getCheckPolicyPassResponse() {
		return checkPolicyPassResponse;
	}

	/**
	 * 设置作业策略检查通过响应
	 * 
	 * @param checkPolicyPassResponse
	 *            作业策略检查通过响应
	 */
	public void setCheckPolicyPassResponse(String checkPolicyPassResponse) {
		this.checkPolicyPassResponse = checkPolicyPassResponse;
	}

	/**
	 * 获取最大历史数据长度
	 * 
	 * @return 最大历史数据长度
	 */
	public Integer getMaxHistoryLength() {
		return maxHistoryLength;
	}

	/**
	 * 设置最大历史数据长度
	 * 
	 * @param maxHistoryLength
	 *            最大历史数据长度
	 */
	public void setMaxHistoryLength(Integer maxHistoryLength) {
		this.maxHistoryLength = maxHistoryLength;
	}
}
