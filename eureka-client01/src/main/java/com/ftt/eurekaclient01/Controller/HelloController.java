package com.ftt.eurekaclient01.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title HelloController
 * @Author liWenBo
 * @Date 2020/7/17 16:47
 * @Description
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String hello() {
        logger.info("services" + discoveryClient.getServices());
        return "services" + discoveryClient.getServices();
    }
}
