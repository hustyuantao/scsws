package com.sinoparasoft.scsws.conf;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * 应用程序属性文件配置类
 * 
 * @author 袁涛
 */
public class PropertyConfiguration extends ApplicationConfiguration {
	private static Logger logger = Logger
			.getLogger(PropertyConfiguration.class);

	/**
	 * 配置文件路径
	 */
	private String configLocation;

	/**
	 * 默认构造函数
	 */
	public PropertyConfiguration() {

	}

	/**
	 * 构造函数
	 * 
	 * @param configLocation
	 *            配置文件路径
	 * @throws IOException
	 *             文件IO异常
	 */
	public PropertyConfiguration(String configLocation) throws IOException {
		this.configLocation = configLocation;
		if (!this.load()) {
			logger.error("加载配置文件" + configLocation + "失败");
			throw new RuntimeException("加载配置文件失败");
		}
		if (!this.check()) {
			logger.error("配置文件" + configLocation + "校验失败");
			throw new RuntimeException("配置文件校验失败");
		}
	}

	/**
	 * 获取配置文件路径
	 * 
	 * @return 配置文件路径
	 */
	public String getConfigLocation() {
		return configLocation;
	}

	/**
	 * 设置配置文件路径
	 * 
	 * @param configLocation
	 *            配置文件路径
	 */
	public void setConfigLocation(String configLocation) {
		this.configLocation = configLocation;
	}

	/**
	 * 加载配置文件
	 * 
	 * @return 成功与否
	 * @throws IOException
	 *             文件IO异常
	 */
	public Boolean load() throws IOException {
		Boolean retValue = false;
		Map<String, String> properties = new HashMap<String, String>();
		BufferedReader br = new BufferedReader(new FileReader(
				this.configLocation));
		String line = null;
		while ((line = br.readLine()) != null) {
			if (!line.startsWith("#") && line.contains("=")) {
				String[] tips = line.split("\\s*=\\s*", 2);
				String key = tips[0].trim();
				String value = tips[1].trim();
				if (!key.isEmpty() && !value.isEmpty()) {
					properties.put(key, value);
				}
			}
		}
		br.close();

		this.setCopyFileEnabled("1".equals(properties
				.get(PropertyConfiguration.CHECK_POLICY_ENABLED)));
		this.setClientShareRootDirectory(properties
				.get(PropertyConfiguration.CLIENT_SHARE_ROOT_DIRECTORY));
		this.setServerShareRootDirectory(properties
				.get(PropertyConfiguration.SERVER_SHARE_ROOT_DIRECTORY));
		this.setServerWorkRootDirectory(properties
				.get(PropertyConfiguration.SERVER_WORK_ROOT_DIRECTORY));
		this.setServerSambaRootDirectory(properties
				.get(PropertyConfiguration.SERVER_SAMBA_ROOT_DIRECTORY));
		this.setDatabaseServerName(properties
				.get(PropertyConfiguration.DATABASE_SERVER_NAME));
		this.setDatabaseName(properties
				.get(PropertyConfiguration.DATABASE_NAME));
		this.setDatabaseUserName(properties
				.get(PropertyConfiguration.DATABASE_USER_NAME));
		this.setDatabasePassword(properties
				.get(PropertyConfiguration.DATABASE_PASSWORD));
		this.setSchedulerAdministrator(properties
				.get(PropertyConfiguration.SCHEDULER_ADMINISTRATOR));
		this.setSchedulerConfigDirectory(properties
				.get(PropertyConfiguration.SCHEDULER_CONFIG_DIRECTORY));
		this.setCheckPolicyEnabled("1".equals(properties
				.get(PropertyConfiguration.CHECK_POLICY_ENABLED)));
		this.setCheckPolicyServiceUrl(properties
				.get(PropertyConfiguration.CHECK_POLICY_SERVICE_URL));
		this.setCheckPolicyPassResponse(properties
				.get(PropertyConfiguration.CHECK_POLICY_PASS_RESPONSE));
		try {
			this.setMaxHistoryLength(Integer.parseInt(properties
					.get(PropertyConfiguration.MAX_HISTORY_LENGTH)));
		} catch (NumberFormatException e) {
			logger.error(
					"整型字符串"
							+ properties
									.get(PropertyConfiguration.MAX_HISTORY_LENGTH)
							+ "解析异常", e);

			return retValue;
		}
		retValue = true;

		return retValue;
	}

	/**
	 * 加载配置文件
	 * 
	 * @param configLocation
	 *            配置文件路径
	 * @return 成功与否
	 * @throws IOException
	 *             文件IO异常
	 */
	public Boolean load(String configLocation) throws IOException {
		this.configLocation = configLocation;

		return this.load();
	}

	/**
	 * 校验配置文件参数
	 * 
	 * @return 成功与否
	 */
	public Boolean check() {
		Boolean retValue = false;

		if (this.getCopyFileEnabled() == null) {
			logger.error("配置文件" + this.configLocation + "参数"
					+ PropertyConfiguration.COPY_FILE_ENABLED + "为空");

			return retValue;
		}
		if (this.getClientShareRootDirectory() == null) {
			logger.error("配置文件" + this.configLocation + "参数"
					+ PropertyConfiguration.CLIENT_SHARE_ROOT_DIRECTORY + "为空");

			return retValue;
		}
		if (this.getServerShareRootDirectory() == null) {
			logger.error("配置文件" + this.configLocation + "参数"
					+ PropertyConfiguration.SERVER_SHARE_ROOT_DIRECTORY + "为空");

			return retValue;
		}
		if (this.getServerWorkRootDirectory() == null) {
			logger.error("配置文件" + this.configLocation + "参数"
					+ PropertyConfiguration.SERVER_WORK_ROOT_DIRECTORY + "为空");

			return retValue;
		}
		if (this.getServerSambaRootDirectory() == null) {
			logger.error("配置文件" + this.configLocation + "参数"
					+ PropertyConfiguration.SERVER_SAMBA_ROOT_DIRECTORY + "为空");

			return retValue;
		}
		if (this.getDatabaseServerName() == null) {
			logger.error("配置文件" + this.configLocation + "参数"
					+ PropertyConfiguration.DATABASE_SERVER_NAME + "为空");

			return retValue;
		}
		if (this.getDatabaseName() == null) {
			logger.error("配置文件" + this.configLocation + "参数"
					+ PropertyConfiguration.DATABASE_NAME + "为空");

			return retValue;
		}
		if (this.getDatabaseUserName() == null) {
			logger.error("配置文件" + this.configLocation + "参数"
					+ PropertyConfiguration.DATABASE_USER_NAME + "为空");

			return retValue;
		}
		if (this.getDatabasePassword() == null) {
			logger.error("配置文件" + this.configLocation + "参数"
					+ PropertyConfiguration.DATABASE_PASSWORD + "为空");

			return retValue;
		}
		if (this.getSchedulerAdministrator() == null) {
			logger.error("配置文件" + this.configLocation + "参数"
					+ PropertyConfiguration.SCHEDULER_ADMINISTRATOR + "为空");

			return retValue;
		}
		if (this.getSchedulerConfigDirectory() == null) {
			logger.error("配置文件" + this.configLocation + "参数"
					+ PropertyConfiguration.SCHEDULER_CONFIG_DIRECTORY + "为空");

			return retValue;
		}
		if (this.getCheckPolicyEnabled() == null) {
			logger.error("配置文件" + this.configLocation + "参数"
					+ PropertyConfiguration.CHECK_POLICY_ENABLED + "为空");

			return retValue;
		}
		if (this.getCheckPolicyServiceUrl() == null) {
			logger.error("配置文件" + this.configLocation + "参数"
					+ PropertyConfiguration.CHECK_POLICY_SERVICE_URL + "为空");

			return retValue;
		}
		if (this.getCheckPolicyPassResponse() == null) {
			logger.error("配置文件" + this.configLocation + "参数"
					+ PropertyConfiguration.CHECK_POLICY_PASS_RESPONSE + "为空");

			return retValue;
		}
		if (this.getMaxHistoryLength() == null) {
			logger.error("配置文件" + this.configLocation + "参数"
					+ PropertyConfiguration.MAX_HISTORY_LENGTH + "为空");

			return retValue;
		}

		return retValue;
	}

}
