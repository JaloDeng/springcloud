package cn.net.jalo.springcloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("client")
public interface HelloService {

	@GetMapping("/client/{name}")
	public String sayHelloFromClient(@PathVariable("name") String name);
}
