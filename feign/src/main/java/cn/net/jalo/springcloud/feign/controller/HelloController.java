package cn.net.jalo.springcloud.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.net.jalo.springcloud.feign.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	@GetMapping("/feign/{name}")
	public @ResponseBody String name(@PathVariable String name) {
		return helloService.sayHelloFromClient(name);
	}
}
