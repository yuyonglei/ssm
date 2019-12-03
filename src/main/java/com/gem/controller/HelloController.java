package com.gem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author yyl
 * @Date 2019/12/3 0003 下午 11:51
 * @Version 1.0
 */
@Controller
public class HelloController {
    //@RequestMapping(value = "/hello",method = RequestMethod.GET)
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
