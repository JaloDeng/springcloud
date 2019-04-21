package cn.net.jalo.springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cn.net.jalo.springcloud.ribbon.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	@GetMapping("/ribbon/{name}")
	public String sayHello(@PathVariable String name) {
		return helloService.sayHello(name);
	}
	
}
