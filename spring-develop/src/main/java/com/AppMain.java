package com;

import com.config.SysConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.service.X;

/**
 * com.AppMain
 *
 * @author YangKai
 * @date 2021/6/25
 */
public class AppMain {

	public static void main(String[] args) {
		// 1、实例化ApplicationContext
		ApplicationContext ac = new AnnotationConfigApplicationContext(SysConfig.class);
		// 获取 bean
//		com.service.SysUser user = (com.service.SysUser) ac.getBean("sysUser");
		X x = ac.getBean(X.class);
		System.out.println(ac.getBean("carFactoryBean"));
		System.out.println(ac.getBean("&carFactoryBean"));
		System.out.println(x.toString());
	}
}
