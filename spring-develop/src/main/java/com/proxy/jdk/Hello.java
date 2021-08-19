package com.proxy.jdk;

/**
 * Hello
 *
 * @author yangkai
 * @date 2021/8/17 7:24 下午
 */


public class Hello implements HelloInterface {

	@Override
	public void sayHello() {
		System.out.println("hello");
	}
}
