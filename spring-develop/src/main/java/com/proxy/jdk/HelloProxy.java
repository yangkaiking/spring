package com.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * HelloProxy
 *
 * @author yangkai
 * @date 2021/8/17 7:25 下午
 */


public class HelloProxy implements InvocationHandler {

	private Object subject;

	public HelloProxy(Object subject) {
		this.subject = subject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before proxy " + method.getName());
		method.invoke(subject, args);
		System.out.println("after proxy " + method.getName());
		return null;
	}
}
