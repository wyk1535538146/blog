package com.wyk.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wyk
 * @date 2022/7/22 15:20
 * @description 测试类
 */

@Controller
public class TestController {
    @RequestMapping("test")
    public String test(){
        return "test";
    }
}
