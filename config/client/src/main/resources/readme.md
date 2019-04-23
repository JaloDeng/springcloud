一、动态获取配置文件属性
(1) 获取配置属性的项目需要引入org.springframework.boot:spring-boot-starter-actuator, 例如项目: config-client
(2) 配置文件添加配置: management.endpoints.web.exposure.include=refresh
(3) 在获取属性的类加注解: @RefreshScope
(4) 用post方法手动刷新一次: http://localhost:8881/refresh