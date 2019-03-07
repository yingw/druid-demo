# Druid Demo

演示 Spring Boot 项目基础 Druid 进行连接池优化和 SQL 执行监控


[Druid 官方文档](https://github.com/alibaba/druid/wiki/%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98)

[Spring Boot 集成文档](https://github.com/alibaba/druid/tree/master/druid-spring-boot-starter)

## 集成步骤

pom.xml 增加依赖性
```xml
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>druid-spring-boot-starter</artifactId>
    <version>1.1.14</version>
</dependency>
```

增加 druid 配置 `application-druid.properties`，里面配置数据源、监控等，具体配置内容视项目需求，参考官网文档说明：
```properties
spring.datasource.druid.web-stat-filter.url-pattern=/druid/*
spring.datasource.druid.filters=stat
spring.datasource.druid.filter.stat.enabled=true
spring.datasource.druid.filter.stat.db-type=h2

#spring.datasource.druid.filters=stat,wall
spring.datasource.druid.web-stat-filter.exclusions=*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*
#spring.datasource.druid.WebStatFilter.profileEnable=true

# Web \u7EDF\u8BA1\u63A7\u5236\u53F0\u7684\u8BA4\u8BC1
spring.datasource.druid.stat-view-servlet.login-username=druid
spring.datasource.druid.stat-view-servlet.login-password=druid123

spring.datasource.druid.validation-query=SELECT 1
```

如果已经集成了安全框架，可以在安全规则中把 `/druid/**` 过滤掉

启动后可以在 http://localhost:8080/druid 访问 web 控制界面

## 监控结果归档

还可以将监控结果进行归档，使用 Druid 提供的 API，参考：[如何获取 Druid 的监控数据](https://github.com/alibaba/druid/tree/master/druid-spring-boot-starter#%E5%A6%82%E4%BD%95%E8%8E%B7%E5%8F%96-druid-%E7%9A%84%E7%9B%91%E6%8E%A7%E6%95%B0%E6%8D%AE)
