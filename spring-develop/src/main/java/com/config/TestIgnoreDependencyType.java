package com.config;

import com.service.Y;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;

/**
 * TestIgnoreDependencyType
 *
 * @author yangkai
 * @date 2021/8/12 4:51 下午
 */


public class TestIgnoreDependencyType implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AnnotatedGenericBeanDefinition x = (AnnotatedGenericBeanDefinition) beanFactory.getBeanDefinition("x");
		x.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
		beanFactory.ignoreDependencyType(Y.class);
	}
}
