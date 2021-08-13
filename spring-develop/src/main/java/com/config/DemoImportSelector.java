package com.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 通过实现ImportSelector接口向Spring容器中添加一个Bean
 *
 * @author yangkai
 * @date 2021/8/11 1:59 下午
 */
public class DemoImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// 向数组中添加类的全类名，这样就能将该类注册到spring容器中
		return new String[]{"com.config.SelectorBean"};
	}
}
