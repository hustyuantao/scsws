package com.sinoparasoft.scsws.core;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 应用程序开放接口类
 * 
 * @author 袁涛
 */
@RequestMapping("/command")
@Controller
public class OpenAPI {
	private static Logger logger = Logger.getLogger(OpenAPI.class);
}
