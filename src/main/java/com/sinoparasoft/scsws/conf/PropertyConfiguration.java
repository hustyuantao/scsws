package com.sinoparasoft.scsws.conf;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * Ӧ�ó��������ļ�������
 * 
 * @author Ԭ��
 */
public class PropertyConfiguration extends ApplicationConfiguration {
	private static Logger logger = Logger
			.getLogger(PropertyConfiguration.class);

	/**
	 * �����ļ�·��
	 */
	private String configLocation;

	/**
	 * Ĭ�Ϲ��캯��
	 */
	public PropertyConfiguration() {

	}

	/**
	 * ���캯��
	 * 
	 * @param configLocation
	 *            �����ļ�·��
	 * @throws IOException
	 *             �ļ�IO�쳣
	 */
	public PropertyConfiguration(String configLocation) throws IOException {
		this.configLocation = configLocation;
		if (!this.load()) {
			logger.error("���������ļ�" + configLocation + "ʧ��");
			throw new RuntimeException("���������ļ�ʧ��");
		}
		if (!this.check()) {
			logger.error("�����ļ�" + configLocation + "У��ʧ��");
			throw new RuntimeException("�����ļ�У��ʧ��");
		}
	}

	/**
	 * ��ȡ�����ļ�·��
	 * 
	 * @return �����ļ�·��
	 */
	public String getConfigLocation() {
		return configLocation;
	}

	/**
	 * ���������ļ�·��
	 * 
	 * @param configLocation
	 *            �����ļ�·��
	 */
	public void setConfigLocation(String configLocation) {
		this.configLocation = configLocation;
	}

	/**
	 * ���������ļ�
	 * 
	 * @return �ɹ����
	 * @throws IOException
	 *             �ļ�IO�쳣
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
					"�����ַ���"
							+ properties
									.get(PropertyConfiguration.MAX_HISTORY_LENGTH)
							+ "�����쳣", e);

			return retValue;
		}
		retValue = true;

		return retValue;
	}

	/**
	 * ���������ļ�
	 * 
	 * @param configLocation
	 *            �����ļ�·��
	 * @return �ɹ����
	 * @throws IOException
	 *             �ļ�IO�쳣
	 */
	public Boolean load(String configLocation) throws IOException {
		this.configLocation = configLocation;

		return this.load();
	}

	/**
	 * У�������ļ�����
	 * 
	 * @return �ɹ����
	 */
	public Boolean check() {
		Boolean retValue = false;

		if (this.getCopyFileEnabled() == null) {
			logger.error("�����ļ�" + this.configLocation + "����"
					+ PropertyConfiguration.COPY_FILE_ENABLED + "Ϊ��");

			return retValue;
		}
		if (this.getClientShareRootDirectory() == null) {
			logger.error("�����ļ�" + this.configLocation + "����"
					+ PropertyConfiguration.CLIENT_SHARE_ROOT_DIRECTORY + "Ϊ��");

			return retValue;
		}
		if (this.getServerShareRootDirectory() == null) {
			logger.error("�����ļ�" + this.configLocation + "����"
					+ PropertyConfiguration.SERVER_SHARE_ROOT_DIRECTORY + "Ϊ��");

			return retValue;
		}
		if (this.getServerWorkRootDirectory() == null) {
			logger.error("�����ļ�" + this.configLocation + "����"
					+ PropertyConfiguration.SERVER_WORK_ROOT_DIRECTORY + "Ϊ��");

			return retValue;
		}
		if (this.getServerSambaRootDirectory() == null) {
			logger.error("�����ļ�" + this.configLocation + "����"
					+ PropertyConfiguration.SERVER_SAMBA_ROOT_DIRECTORY + "Ϊ��");

			return retValue;
		}
		if (this.getDatabaseServerName() == null) {
			logger.error("�����ļ�" + this.configLocation + "����"
					+ PropertyConfiguration.DATABASE_SERVER_NAME + "Ϊ��");

			return retValue;
		}
		if (this.getDatabaseName() == null) {
			logger.error("�����ļ�" + this.configLocation + "����"
					+ PropertyConfiguration.DATABASE_NAME + "Ϊ��");

			return retValue;
		}
		if (this.getDatabaseUserName() == null) {
			logger.error("�����ļ�" + this.configLocation + "����"
					+ PropertyConfiguration.DATABASE_USER_NAME + "Ϊ��");

			return retValue;
		}
		if (this.getDatabasePassword() == null) {
			logger.error("�����ļ�" + this.configLocation + "����"
					+ PropertyConfiguration.DATABASE_PASSWORD + "Ϊ��");

			return retValue;
		}
		if (this.getSchedulerAdministrator() == null) {
			logger.error("�����ļ�" + this.configLocation + "����"
					+ PropertyConfiguration.SCHEDULER_ADMINISTRATOR + "Ϊ��");

			return retValue;
		}
		if (this.getSchedulerConfigDirectory() == null) {
			logger.error("�����ļ�" + this.configLocation + "����"
					+ PropertyConfiguration.SCHEDULER_CONFIG_DIRECTORY + "Ϊ��");

			return retValue;
		}
		if (this.getCheckPolicyEnabled() == null) {
			logger.error("�����ļ�" + this.configLocation + "����"
					+ PropertyConfiguration.CHECK_POLICY_ENABLED + "Ϊ��");

			return retValue;
		}
		if (this.getCheckPolicyServiceUrl() == null) {
			logger.error("�����ļ�" + this.configLocation + "����"
					+ PropertyConfiguration.CHECK_POLICY_SERVICE_URL + "Ϊ��");

			return retValue;
		}
		if (this.getCheckPolicyPassResponse() == null) {
			logger.error("�����ļ�" + this.configLocation + "����"
					+ PropertyConfiguration.CHECK_POLICY_PASS_RESPONSE + "Ϊ��");

			return retValue;
		}
		if (this.getMaxHistoryLength() == null) {
			logger.error("�����ļ�" + this.configLocation + "����"
					+ PropertyConfiguration.MAX_HISTORY_LENGTH + "Ϊ��");

			return retValue;
		}

		return retValue;
	}

}
