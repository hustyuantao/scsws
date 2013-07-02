package com.sinoparasoft.scsws.ganglia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.sinoparasoft.scsws.entity.NodeMetric;

/**
 * Ganglia度量访问接口实现类
 * 
 * @author 袁涛
 */
public class GangliaMaoImpl implements GangliaMao {
	private static Logger logger = Logger.getLogger(GangliaMaoImpl.class);

	/**
	 * 获取XML文档
	 * 
	 * @return XML文档
	 */
	private String getXML() {
		String xml = null;

		try {
			Socket socket = new Socket(InetAddress.getLocalHost(), 8649);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			StringBuffer buffer = new StringBuffer();
			String line = null;
			while ((line = br.readLine()) != null) {
				buffer.append(line);
			}
			br.close();
			socket.close();

			xml = buffer.toString();
		} catch (UnknownHostException e) {
			logger.error("获取本机IP地址异常", e);

			return xml;
		} catch (IOException e) {
			logger.error("与本机建立Socket连接异常", e);

			return xml;
		}

		return xml;
	}

	/**
	 * 主机节点映射
	 * 
	 * @param host
	 *            主机节点
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public NodeMetric map(Element host) {
		NodeMetric metric = new NodeMetric();
		metric.setName(host.attributeValue("NAME"));
		metric.setIp(host.attributeValue("IP"));
		metric.setLocation(host.attributeValue("LOCATION"));
		metric.setReportedTime(host.attributeValue("REPORTED"));
		metric.setGmondStartedTime(host.attributeValue("GMOND_STARTED"));
		Iterator<Element> metricIterator = host.elementIterator();
		while (metricIterator.hasNext()) {
			Element e = metricIterator.next();
			switch (e.attributeValue("NAME")) {
			case "os_release":
				metric.setOsRelease(e.attributeValue("VAL"));
				break;
			case "os_name":
				metric.setOsName(e.attributeValue("VAL"));
				break;
			case "boottime":
				metric.setLastBootTime(e.attributeValue("VAL"));
				break;
			case "machine_type":
				metric.setMachineType(e.attributeValue("VAL"));
				break;
			case "load_one":
				metric.setAvgOneMinuteLoad(e.attributeValue("VAL"));
				break;
			case "load_five":
				metric.setAvgFiveMinuteLoad(e.attributeValue("VAL"));
				break;
			case "load_fifteen":
				metric.setAvgFifteenMinuteLoad(e.attributeValue("VAL"));
				break;
			case "mem_total":
				metric.setTotalMemorySize(e.attributeValue("VAL"));
				break;
			case "mem_free":
				metric.setFreeMemorySize(e.attributeValue("VAL"));
				break;
			case "mem_cached":
				metric.setCachedMemorySize(e.attributeValue("VAL"));
				break;
			case "mem_buffers":
				metric.setBufferedMemorySize(e.attributeValue("VAL"));
				break;
			case "mem_shared":
				metric.setSharedMemorySize(e.attributeValue("VAL"));
				break;
			case "swap_total":
				metric.setTotalSwapSize(e.attributeValue("VAL"));
				break;
			case "swap_free":
				metric.setFreeSwapSize(e.attributeValue("VAL"));
				break;
			case "proc_total":
				metric.setTotalProcessesNum(e.attributeValue("VAL"));
				break;
			case "proc_run":
				metric.setRunningProcessesNum(e.attributeValue("VAL"));
				break;
			case "gexec":
				metric.setGexecAvailable(e.attributeValue("VAL"));
				break;
			case "disk_total":
				metric.setTotalDiskSize(e.attributeValue("VAL"));
				break;
			case "disk_free":
				metric.setFreeDiskSize(e.attributeValue("VAL"));
				break;
			case "part_max_used":
				metric.setMaxUsedDiskSpacePercent(e.attributeValue("VAL"));
				break;
			case "cpu_idle":
				metric.setCpuIdlePercent(e.attributeValue("VAL"));
				break;
			case "cpu_nice":
				metric.setCpuNicePercent(e.attributeValue("VAL"));
				break;
			case "cpu_user":
				metric.setCpuUserPercent(e.attributeValue("VAL"));
				break;
			case "cpu_aidle":
				metric.setCpuAidlePercent(e.attributeValue("VAL"));
				break;
			case "cpu_system":
				metric.setCpuSystemPercent(e.attributeValue("VAL"));
				break;
			case "cpu_wio":
				metric.setCpuWioPercent(e.attributeValue("VAL"));
				break;
			case "cpu_num":
				metric.setCpuNum(e.attributeValue("VAL"));
				break;
			case "cpu_speed":
				metric.setCpuFrequency(e.attributeValue("VAL"));
				break;
			case "tcp_established":
				metric.setEstablishedTcpConnectionsNum(e.attributeValue("VAL"));
				break;
			case "tcp_listen":
				metric.setListeningTcpConnectionsNum(e.attributeValue("VAL"));
				break;
			case "tcp_synwait":
				metric.setSyncWaitTcpConnectionsNum(e.attributeValue("VAL"));
				break;
			case "tcp_synsent":
				metric.setSyncSentTcpConnectionsNum(e.attributeValue("VAL"));
				break;
			case "tcp_synrecv":
				metric.setSyncRecvTcpConnectionsNum(e.attributeValue("VAL"));
				break;
			case "tcp_lastack":
				metric.setLastAckTcpConnectionsNum(e.attributeValue("VAL"));
				break;
			case "tcp_finwait1":
				metric.setFinWait1TcpConnectionsNum(e.attributeValue("VAL"));
				break;
			case "tcp_timewait":
				metric.setTimeWaitTcpConnectionsNum(e.attributeValue("VAL"));
				break;
			case "tcp_finwait2":
				metric.setFinWait2TcpConnectionsNum(e.attributeValue("VAL"));
				break;
			case "tcp_closewait":
				metric.setCloseWaitTcpConnectionsNum(e.attributeValue("VAL"));
				break;
			case "tcp_closing":
				metric.setClosingTcpConnectionsNum(e.attributeValue("VAL"));
				break;
			case "tcp_closed":
				metric.setClosedTcpConnectionsNum(e.attributeValue("VAL"));
				break;
			case "tcp_unknown":
				metric.setUnknownTcpConnectionsNum(e.attributeValue("VAL"));
				break;
			case "pkts_in":
				metric.setReceivedPacketsPerSecond(e.attributeValue("VAL"));
				break;
			case "pkts_out":
				metric.setSentPacketsPerSecond(e.attributeValue("VAL"));
				break;
			case "bytes_in":
				metric.setReceivedBytesPerSecond(e.attributeValue("VAL"));
				break;
			case "bytes_out":
				metric.setSentBytesPerSecond(e.attributeValue("VAL"));
				break;
			}
		}

		return metric;
	}

	/**
	 * 查询节点度量列表
	 * 
	 * @return 度量列表
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<NodeMetric> query() {
		List<NodeMetric> metrics = new ArrayList<NodeMetric>();
		String xml = this.getXML();
		if (xml == null) {
			logger.error("获取Ganglia XML文档失败");

			return metrics;
		}

		try {
			Document doc = DocumentHelper.parseText(xml);
			Element root = doc.getRootElement();
			Element cluster = root.element("CLUSTER");
			Iterator<Element> hostIterator = cluster.elementIterator();
			while (hostIterator.hasNext()) {
				Element host = hostIterator.next();
				NodeMetric metric = this.map(host);
				metrics.add(metric);
			}
		} catch (DocumentException e) {
			logger.error("XML文档解析异常", e);

			return metrics;
		}

		return metrics;
	}

	/**
	 * 根据节点名称查询节点度量
	 * 
	 * @param name
	 *            节点名称
	 * @return 节点度量
	 */
	@Override
	@SuppressWarnings("unchecked")
	public NodeMetric query(String name) {
		NodeMetric metric = null;
		String xml = this.getXML();
		if (xml == null) {
			logger.error("获取Ganglia XML文档失败");

			return metric;
		}

		try {
			Document doc = DocumentHelper.parseText(xml);
			Element root = doc.getRootElement();
			Element cluster = root.element("CLUSTER");
			Iterator<Element> hostIterator = cluster.elementIterator();
			while (hostIterator.hasNext()) {
				Element host = hostIterator.next();
				if (host.attributeValue("NAME").equals(name)) {
					metric = this.map(host);
					break;
				}
			}
		} catch (DocumentException e) {
			logger.error("XML文档解析异常", e);

			return metric;
		}
		return metric;
	}

}
