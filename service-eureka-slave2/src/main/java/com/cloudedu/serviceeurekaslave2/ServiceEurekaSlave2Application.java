package com.cloudedu.serviceeurekaslave2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 微服务-注册中心slave（Eureka Server）
 *
 * @Desc 提供服务注册和发现的能力
 */
@EnableEurekaServer
@SpringBootApplication
public class ServiceEurekaSlave2Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceEurekaSlave2Application.class, args);
        System.out.println("注册中心-slave2启动成功，请接着启动配置中心(service-config)");
    }

}
