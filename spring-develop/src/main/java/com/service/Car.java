package com.service;

/**
 * car
 *
 * @author yangkai
 * @date 2021/7/16 5:53 下午
 */


public class Car {
	private int maxSpeed;
	private String brand;
	private double price;
	//get/set方法


	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
