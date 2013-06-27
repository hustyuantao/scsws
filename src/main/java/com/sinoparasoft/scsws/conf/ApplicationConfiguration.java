package com.sinoparasoft.scsws.conf;

/**
 * Ӧ�ó������ó�����
 * 
 * @author Ԭ��
 * @version 1.0
 */
public abstract class ApplicationConfiguration {
	/**
	 * �������Գ���
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
	 * �Ƿ�����ҵִ��ǰ������ļ�����
	 */
	private Boolean copyFileEnabled;
	/**
	 * �ͻ��˹����Ŀ¼
	 */
	private String clientShareRootDirectory;
	/**
	 * ����˹����Ŀ¼
	 */
	private String serverShareRootDirectory;
	/**
	 * ����˹�����Ŀ¼
	 */
	private String serverWorkRootDirectory;
	/**
	 * �����Samba�����Ŀ¼
	 */
	private String serverSambaRootDirectory;
	/**
	 * ���ݿ����������
	 */
	private String databaseServerName;
	/**
	 * ���ݿ�����
	 */
	private String databaseName;
	/**
	 * ���ݿ��û�����
	 */
	private String databaseUserName;
	/**
	 * ���ݿ��û�����
	 */
	private String databasePassword;
	/**
	 * ��ҵ����������Ա�˻�
	 */
	private String schedulerAdministrator;
	/**
	 * ��ҵ�����������ļ�Ŀ¼
	 */
	private String schedulerConfigDirectory;
	/**
	 * ��ҵִ��ǰ�Ƿ���в��Լ��
	 */
	private Boolean checkPolicyEnabled;
	/**
	 * ��ҵ���Լ������ַ
	 */
	private String checkPolicyServiceUrl;
	/**
	 * ��ҵ���Լ��ͨ����Ӧ
	 */
	private String checkPolicyPassResponse;
	/**
	 * �����ʷ���ݳ���
	 */
	private Integer maxHistoryLength;

	/**
	 * �Ƿ�����ҵִ��ǰ������ļ�����
	 * 
	 * @return �ǻ��
	 */
	public Boolean getCopyFileEnabled() {
		return copyFileEnabled;
	}

	/**
	 * �����Ƿ�����ҵִ��ǰ������ļ�����
	 * 
	 * @param copyFileEnabled
	 *            �ǻ��
	 */
	public void setCopyFileEnabled(Boolean copyFileEnabled) {
		this.copyFileEnabled = copyFileEnabled;
	}

	/**
	 * ��ȡ�ͻ��˹����Ŀ¼
	 * 
	 * @return �ͻ��˹����Ŀ¼
	 */
	public String getClientShareRootDirectory() {
		return clientShareRootDirectory;
	}

	/**
	 * ���ÿͻ��˹����Ŀ¼
	 * 
	 * @param clientShareRootDirectory
	 *            �ͻ��˹����Ŀ¼
	 */
	public void setClientShareRootDirectory(String clientShareRootDirectory) {
		this.clientShareRootDirectory = clientShareRootDirectory;
	}

	/**
	 * ��ȡ����˹����Ŀ¼
	 * 
	 * @return ����˹����Ŀ¼
	 */
	public String getServerShareRootDirectory() {
		return serverShareRootDirectory;
	}

	/**
	 * ���÷���˹����Ŀ¼
	 * 
	 * @param serverShareRootDirectory
	 *            ����˹����Ŀ¼
	 */
	public void setServerShareRootDirectory(String serverShareRootDirectory) {
		this.serverShareRootDirectory = serverShareRootDirectory;
	}

	/**
	 * ��ȡ����˹�����Ŀ¼
	 * 
	 * @return ����˹�����Ŀ¼
	 */
	public String getServerWorkRootDirectory() {
		return serverWorkRootDirectory;
	}

	/**
	 * ���÷���˹�����Ŀ¼
	 * 
	 * @param serverWorkRootDirectory
	 *            ����˹�����Ŀ¼
	 */
	public void setServerWorkRootDirectory(String serverWorkRootDirectory) {
		this.serverWorkRootDirectory = serverWorkRootDirectory;
	}

	/**
	 * ��ȡ�����Samba�����Ŀ¼
	 * 
	 * @return �����Samba�����Ŀ¼
	 */
	public String getServerSambaRootDirectory() {
		return serverSambaRootDirectory;
	}

	/**
	 * ���÷����Samba�����Ŀ¼
	 * 
	 * @param serverSambaRootDirectory
	 *            �����Samba�����Ŀ¼
	 */
	public void setServerSambaRootDirectory(String serverSambaRootDirectory) {
		this.serverSambaRootDirectory = serverSambaRootDirectory;
	}

	/**
	 * ��ȡ���ݿ����������
	 * 
	 * @return ���ݿ����������
	 */
	public String getDatabaseServerName() {
		return databaseServerName;
	}

	/**
	 * �������ݿ����������
	 * 
	 * @param databaseServerName
	 *            ���ݿ����������
	 */
	public void setDatabaseServerName(String databaseServerName) {
		this.databaseServerName = databaseServerName;
	}

	/**
	 * ��ȡ���ݿ�����
	 * 
	 * @return ���ݿ�����
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * �������ݿ�����
	 * 
	 * @param databaseName
	 *            ���ݿ�����
	 */
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	/**
	 * ��ȡ���ݿ��û�����
	 * 
	 * @return ���ݿ��û�����
	 */
	public String getDatabaseUserName() {
		return databaseUserName;
	}

	/**
	 * �������ݿ��û�����
	 * 
	 * @param databaseUserName
	 *            ���ݿ��û�����
	 */
	public void setDatabaseUserName(String databaseUserName) {
		this.databaseUserName = databaseUserName;
	}

	/**
	 * ��ȡ���ݿ��û�����
	 * 
	 * @return ���ݿ��û�����
	 */
	public String getDatabasePassword() {
		return databasePassword;
	}

	/**
	 * �������ݿ��û�����
	 * 
	 * @param databasePassword
	 *            ���ݿ��û�����
	 */
	public void setDatabasePassword(String databasePassword) {
		this.databasePassword = databasePassword;
	}

	/**
	 * ��ȡ��ҵ����������Ա�˻�
	 * 
	 * @return ��ҵ����������Ա�˻�
	 */
	public String getSchedulerAdministrator() {
		return schedulerAdministrator;
	}

	/**
	 * ������ҵ����������Ա�˻�
	 * 
	 * @param schedulerAdministrator
	 *            ��ҵ����������Ա�˻�
	 */
	public void setSchedulerAdministrator(String schedulerAdministrator) {
		this.schedulerAdministrator = schedulerAdministrator;
	}

	/**
	 * ��ȡ��ҵ�����������ļ�Ŀ¼
	 * 
	 * @return ��ҵ�����������ļ�Ŀ¼
	 */
	public String getSchedulerConfigDirectory() {
		return schedulerConfigDirectory;
	}

	/**
	 * ������ҵ�����������ļ�Ŀ¼
	 * 
	 * @param schedulerConfigDirectory
	 *            ��ҵ�����������ļ�Ŀ¼
	 */
	public void setSchedulerConfigDirectory(String schedulerConfigDirectory) {
		this.schedulerConfigDirectory = schedulerConfigDirectory;
	}

	/**
	 * ��ҵִ��ǰ�Ƿ���в��Լ��
	 * 
	 * @return �ǻ��
	 */
	public Boolean getCheckPolicyEnabled() {
		return checkPolicyEnabled;
	}

	/**
	 * ������ҵִ��ǰ�Ƿ���в��Լ��
	 * 
	 * @param checkPolicyEnabled
	 *            �ǻ��
	 */
	public void setCheckPolicyEnabled(Boolean checkPolicyEnabled) {
		this.checkPolicyEnabled = checkPolicyEnabled;
	}

	/**
	 * ��ȡ��ҵ���Լ������ַ
	 * 
	 * @return ��ҵ���Լ������ַ
	 */
	public String getCheckPolicyServiceUrl() {
		return checkPolicyServiceUrl;
	}

	/**
	 * ������ҵ���Լ������ַ
	 * 
	 * @param checkPolicyServiceUrl
	 *            ��ҵ���Լ������ַ
	 */
	public void setCheckPolicyServiceUrl(String checkPolicyServiceUrl) {
		this.checkPolicyServiceUrl = checkPolicyServiceUrl;
	}

	/**
	 * ��ȡ��ҵ���Լ��ͨ����Ӧ
	 * 
	 * @return ��ҵ���Լ��ͨ����Ӧ
	 */
	public String getCheckPolicyPassResponse() {
		return checkPolicyPassResponse;
	}

	/**
	 * ������ҵ���Լ��ͨ����Ӧ
	 * 
	 * @param checkPolicyPassResponse
	 *            ��ҵ���Լ��ͨ����Ӧ
	 */
	public void setCheckPolicyPassResponse(String checkPolicyPassResponse) {
		this.checkPolicyPassResponse = checkPolicyPassResponse;
	}

	/**
	 * ��ȡ�����ʷ���ݳ���
	 * 
	 * @return �����ʷ���ݳ���
	 */
	public Integer getMaxHistoryLength() {
		return maxHistoryLength;
	}

	/**
	 * ���������ʷ���ݳ���
	 * 
	 * @param maxHistoryLength
	 *            �����ʷ���ݳ���
	 */
	public void setMaxHistoryLength(Integer maxHistoryLength) {
		this.maxHistoryLength = maxHistoryLength;
	}
}
