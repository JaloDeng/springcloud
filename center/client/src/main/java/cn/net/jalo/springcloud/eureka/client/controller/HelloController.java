package cn.net.jalo.springcloud.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${server.port}")
	private String port;
	
	@RequestMapping("/hello/{name}")
	public @ResponseBody String sayHello(@PathVariable String name) {
		return String.format("Hello %s, I am from port:%s", name, port);
	}
	
}
