package com.config;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 通过实现ImportBeanDefinitionRegistrar接口，
 * 重写registerBeanDefinitions()方法来向Spring容器汇总注册一个bean
 *
 * @author yangkai
 * @date 2021/8/11 3:30 下午
 */
public class DemoImportRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		// 通过BeanDefinitionBuilder来创建一个BeanDefinition
		// 这里也可以直接通过关键字new来创建一个BeanDefinition。由于BeanDefinition是一个接口，创建其实现类GenericBeanDefinition
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(RegistrarBean.class);
		AbstractBeanDefinition beanDefinition = builder.getBeanDefinition();
		// 上面两行代码是将RegistrarBean解析成BeanDefinition
		// 向spring中注册RegistrarBean类对应的BeanDefinition
		registry.registerBeanDefinition("demoBean", beanDefinition);
	}
}
