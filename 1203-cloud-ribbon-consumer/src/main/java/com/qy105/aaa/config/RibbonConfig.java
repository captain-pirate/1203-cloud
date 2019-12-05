package com.qy105.aaa.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author AI
 * @title: RibbonConfig
 * @projectName 1202-cloud
 * @description: TODO
 * @date 2019/12/210:55
 */
@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced  // 负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
