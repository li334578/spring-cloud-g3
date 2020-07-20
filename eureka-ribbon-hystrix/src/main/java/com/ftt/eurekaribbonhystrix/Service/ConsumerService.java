package com.ftt.eurekaribbonhystrix.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Title ConsumerService
 * @Author liWenBo
 * @Date 2020/7/18 10:44
 * @Description
 */
@Service
public class ConsumerService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String hello(){
        return restTemplate.getForObject("http://eureka-client/hello",String.class);
    }

    public String fallback() {
        return "fallback";
    }
}
