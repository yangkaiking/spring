package com.config;

import com.service.SysUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * com.config.SysConfig
 *
 * @author YangKai
 * @date 2021/6/25
 */
/**
 * 在配置类上通过Import注解向Spring容器中注册RegularBean
 */
@Import({RegularBean.class, DemoImportSelector.class, DemoImportRegistrar.class})
@Configuration
@ComponentScan("com.service")
public class SysConfig {

	@Bean
	public SysUser sysUser() {
		System.out.println("SysUser 实例化");
		return new SysUser("a", "b");
	}

	@Bean
	public CarFactoryBean carFactoryBean() {
		return new CarFactoryBean();
	}
}