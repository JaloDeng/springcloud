package cn.net.jalo.springcloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

	@Value("${config.file.name}")
	private String name;
	
	@Value("${config.profile}")
	private String profile;
	
	@GetMapping("/properties")
	public @ResponseBody String properties() {
		return name + " : " + profile;
	}
	
}
