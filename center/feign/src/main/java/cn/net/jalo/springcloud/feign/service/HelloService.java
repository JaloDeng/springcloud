package cn.net.jalo.springcloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cn.net.jalo.springcloud.feign.service.impl.HelloServiceHystrixImpl;

@FeignClient(value = "eureka-client", fallback = HelloServiceHystrixImpl.class)
public interface HelloService {

	@GetMapping("/hello/{name}")
	public String sayHelloFromClient(@PathVariable("name") String name);
}
