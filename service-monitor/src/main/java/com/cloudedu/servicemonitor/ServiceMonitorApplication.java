package com.cloudedu.servicemonitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *微服务监控中心（SBA）
 *
 */
@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceMonitorApplication.class, args);
        System.out.println("监控中心-SBA启动成功，请接着启动其他服务");
    }

}
