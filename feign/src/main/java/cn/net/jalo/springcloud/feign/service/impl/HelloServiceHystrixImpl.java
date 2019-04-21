package cn.net.jalo.springcloud.feign.service.impl;

import org.springframework.stereotype.Component;

import cn.net.jalo.springcloud.feign.service.HelloService;

@Component
public class HelloServiceHystrixImpl implements HelloService {

	@Override
	public String sayHelloFromClient(String name) {
		return String.format("Sorry %s, this is a error.", name);
	}

}
