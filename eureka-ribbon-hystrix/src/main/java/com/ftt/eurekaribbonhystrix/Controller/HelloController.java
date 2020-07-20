package com.ftt.eurekaribbonhystrix.Controller;

import com.ftt.eurekaribbonhystrix.Service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title HelloController
 * @Author liWenBo
 * @Date 2020/7/18 10:44
 * @Description
 */
@RestController
public class HelloController {

    @Autowired
    ConsumerService consumerService;

    @RequestMapping("/hello")
    public String hello() {
        return consumerService.hello();
    }
}
