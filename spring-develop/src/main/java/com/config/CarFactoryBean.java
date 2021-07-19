package com.config;

import com.service.Car;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;

/**
 * CarFactoryBean
 *
 * @author yangkai
 * @date 2021/7/16 5:53 下午
 */


public class CarFactoryBean implements FactoryBean<Car> {
	@Value("大众SUV,180,180000")
	private String carInfo;

	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		String[] infos = carInfo.split(",");
		car.setBrand(infos[0]);
		car.setMaxSpeed(Integer.valueOf(infos[1]));
		car.setPrice(Double.valueOf(infos[2]));
		return car;
	}

	@Override
	public Class<Car> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
