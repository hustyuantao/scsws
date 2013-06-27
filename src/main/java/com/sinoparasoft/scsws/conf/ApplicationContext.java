package com.sinoparasoft.scsws.conf;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 应用程序上下文配置类
 * 
 * @author 袁涛
 * @version 1.0
 */
@Configuration
@EnableWebMvc
@EnableScheduling
public class ApplicationContext {
	@Bean
	public PropertyConfiguration propertyConfiguration() throws IOException {
		return new PropertyConfiguration("/etc/scs/scs.conf");
	}

}
