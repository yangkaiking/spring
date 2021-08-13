package com.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * com.service.Y
 *
 * @author yangkai
 * @date 2021/7/12 11:07 上午
 */

public class Y {
	@Autowired
	X x;

	public Y() {
		System.out.println("com.service.Y created");
	}

	public void print() {
		System.out.println("x = " + x);
	}
}
