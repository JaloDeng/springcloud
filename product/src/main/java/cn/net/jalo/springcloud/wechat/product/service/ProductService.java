package cn.net.jalo.springcloud.wechat.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.jalo.springcloud.wechat.product.entity.ProductInfo;
import cn.net.jalo.springcloud.wechat.product.repository.ProductInfoRepository;

@Service
public class ProductService {

	@Autowired
	private ProductInfoRepository productInfoRepository;
	
	public List<ProductInfo> findAll() {
		return productInfoRepository.findAll();
	}
}
