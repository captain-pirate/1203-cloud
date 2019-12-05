package com.qy105.aaa.web;

import com.netflix.hystrix.HystrixCommandProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;
import java.util.List;

/**
 * @author AI
 * @title: RibbonConsumerBookController
 * @projectName 1202-cloud
 * @description: TODO
 * @date 2019/12/210:54
 */

@RestController
public class RibbonConsumerBookController {
    @Autowired
    private RestTemplate restTemplate;

//  HystrixCommandProperties
    @HystrixCommand(fallbackMethod = "error")//,commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")})
    @GetMapping("getAllBook")
    public List<BookInfo> getAllBook() {
        LinkedList<BookInfo> forObject=restTemplate.getForObject("http://provider-server/getAllBook", LinkedList.class);
        return forObject;
    }

    public List<BookInfo> error() {
        System.out.println("服务熔断");
        return null;
    }
}
