package com.aaa.zufang0729.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * fileName:test
 * description:
 * author:张林
 * createTime:2019-07-29 21:36
 * version:1.0.0
 */
@Controller
@RequestMapping("/test")
public class test {
    @RequestMapping("/list")
    public String list(){
        return "aaa";
    }
}
