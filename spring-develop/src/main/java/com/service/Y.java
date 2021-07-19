package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * com.service.Y
 *
 * @author yangkai
 * @date 2021/7/12 11:07 上午
 */

@Component
public class Y {

	@Autowired
	private X x;

	public Y() {
		System.out.println("com.service.Y created");
	}
}
