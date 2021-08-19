package com.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * MyMethodInterceptor
 *
 * @author yangkai
 * @date 2021/8/17 7:52 下午
 */


public class MyMethodInterceptor implements MethodInterceptor {
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("before cglib proxy" + method.getName());
		Object object = methodProxy.invokeSuper(o, objects);
		System.out.println("after cglib proxy" + method.getName());
		return object;
	}
}
