package com.ftt.eurekaconsumeropenfeign.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Title HelloService
 * @Author liWenBo
 * @Date 2020/7/17 17:28
 * @Description
 */
@Component
@FeignClient(value = "EUREKA-CLIENT")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();
}
