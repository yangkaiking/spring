package com.proxy;

import com.proxy.cglib.HelloServiceImpl;
import com.proxy.cglib.MyMethodInterceptor;
import com.proxy.jdk.Hello;
import com.proxy.jdk.HelloInterface;
import com.proxy.jdk.HelloProxy;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

/**
 * Client
 *
 * @author yangkai
 * @date 2021/8/17 7:27 下午
 */


public class Client {

	public static void main(String[] args) {
		Hello hello = new Hello();
		HelloProxy helloProxy = new HelloProxy(hello);
		HelloInterface helloInterface = (HelloInterface) Proxy.newProxyInstance(hello.getClass().getClassLoader(),
				hello.getClass().getInterfaces(), helloProxy);
		helloInterface.sayHello();

		Enhancer enhancer = new Enhancer();
		// 继承被代理类
		enhancer.setSuperclass(HelloServiceImpl.class);
		// 设置回调
		enhancer.setCallback(new MyMethodInterceptor());
		// 生成代理类对象
		HelloServiceImpl service = (HelloServiceImpl) enhancer.create();
		service.sayHello();
	}
}
