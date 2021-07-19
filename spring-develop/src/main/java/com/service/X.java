package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * com.service.X
 *
 * @author yangkai
 * @date 2021/7/12 11:06 上午
 */

@Component
public class X {

	@Autowired
	private Y y;

	public X() {
		System.out.println("com.service.X created");
	}
}
