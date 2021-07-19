package com.config;

import com.service.SysUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * com.config.SysConfig
 *
 * @author YangKai
 * @date 2021/6/25
 */
@Configuration
@ComponentScan("com.service")
public class SysConfig {

	@Bean
	public SysUser sysUser() {
		return new SysUser("a", "b");
	}

	@Bean
	public CarFactoryBean carFactoryBean() {
		return new CarFactoryBean();
	}
}