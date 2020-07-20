package com.ftt.eurekaconsumeropenfeign.Controller;

import com.ftt.eurekaconsumeropenfeign.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title HelloController
 * @Author liWenBo
 * @Date 2020/7/17 17:29
 * @Description
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;


    @RequestMapping("/hello/openfeign")
    public String hello() {
        return helloService.hello();
    }
}
