package cn.net.jalo.springcloud.ribbon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cn.net.jalo.springcloud.ribbon.service.HelloService;

@RestController
public class HelloController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

	@Autowired
	private HelloService helloService;
	
	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable String name) {
		LOGGER.info("Ribbon->HelloController->sayHello");
		return helloService.sayHello(name);
	}
	
}
