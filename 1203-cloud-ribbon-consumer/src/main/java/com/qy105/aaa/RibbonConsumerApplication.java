package com.qy105.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author AI
 * @title: RibbonConsumerApplication
 * @projectName 1202-cloud
 * @description: 负载均衡，服务端的负载均衡
 * @date 2019/12/210:51
 */
@SpringBootApplication
@EnableEurekaClient
//发现服务列表
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
//熔断
@EnableCircuitBreaker
public class RibbonConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonConsumerApplication.class,args);
    }
}
