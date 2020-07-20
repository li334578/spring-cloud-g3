package com.ftt.eurekaconsumerribbon.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Title HelloController
 * @Author liWenBo
 * @Date 2020/7/17 17:20
 * @Description
 */
@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String hello() {
        return restTemplate.getForObject("http://eureka-client/hello", String.class);
    }
}
