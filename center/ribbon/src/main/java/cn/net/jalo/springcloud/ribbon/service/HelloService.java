package cn.net.jalo.springcloud.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "helloError")
	public String sayHello(String name) {
		return restTemplate.getForObject("http://eureka-client/hello/" + name, String.class);
	}
	
	public String helloError(String name) {
		return String.format("Sorry %s, this is a error.", name);
	}
}
