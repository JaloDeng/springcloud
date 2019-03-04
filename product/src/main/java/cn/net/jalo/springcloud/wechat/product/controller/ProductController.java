package cn.net.jalo.springcloud.wechat.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.net.jalo.springcloud.wechat.product.entity.ProductInfo;
import cn.net.jalo.springcloud.wechat.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@GetMapping("/")
	public @ResponseBody List<ProductInfo> findAll() {
		return productService.findAll();
	}
}
