package cn.net.jalo.springcloud.wechat.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.net.jalo.springcloud.wechat.product.entity.ProductInfo;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

}
