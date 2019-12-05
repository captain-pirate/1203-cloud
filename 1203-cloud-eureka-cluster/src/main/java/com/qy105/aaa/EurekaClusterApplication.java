package com.qy105.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author AI
 * @title: EurekaClusterApplication
 * @projectName 1203-cloud
 * @description: TODO
 * @date 2019/12/38:39
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class EurekaClusterApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClusterApplication.class,args);
    }
}
