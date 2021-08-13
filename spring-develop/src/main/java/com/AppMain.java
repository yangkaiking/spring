package com;

import com.service.X;
import com.service.Y;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * com.AppMain
 *
 * @author YangKai
 * @date 2021/6/25
 */
public class AppMain {

	public static void main(String[] args) {
		// 1、实例化ApplicationContext
//		ApplicationContext ac = new AnnotationConfigApplicationContext(SysConfig.class);
//		// 获取 bean
////		com.service.SysUser user = (com.service.SysUser) ac.getBean("sysUser");
//		X x = ac.getBean(X.class);
//		System.out.println(ac.getBean("carFactoryBean"));
//		System.out.println(ac.getBean("&carFactoryBean"));
//		System.out.println(x.toString());
//		// 获取bean
//		SelectorBean selectorBean = ac.getBean(SelectorBean.class);
//		System.out.println(selectorBean);
//		RegularBean regularBean = ac.getBean(RegularBean.class);
//		System.out.println(regularBean);
//		RegistrarBean registrarBean = ac.getBean(RegistrarBean.class);
//		System.out.println(registrarBean);

		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext();
		@SuppressWarnings("rawtypes")
		Class[] clazz = new Class[]{X.class,Y.class};
		applicationContext.register(clazz);
		applicationContext.refresh();
		applicationContext.getBean(X.class).print();
	}
}
