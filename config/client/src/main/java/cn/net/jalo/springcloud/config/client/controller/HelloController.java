package cn.net.jalo.springcloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

	@Value("${foo}")
	private String foo;
	
	@Value("${democonfigclient.message}")
	private String message;
	
	@GetMapping("/properties")
	public @ResponseBody String properties() {
		return foo + " : " + message;
	}
	
}
