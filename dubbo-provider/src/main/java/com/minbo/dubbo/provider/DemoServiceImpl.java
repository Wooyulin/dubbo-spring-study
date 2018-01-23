package com.minbo.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class DemoServiceImpl implements DemoService{

	public String sayHello(String name) {
		return "Welcome to Minbo's Dubbo, Hello " + name;
	}

}
