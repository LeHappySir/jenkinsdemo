package com.happy.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * JenkinsController
 *
 * @author xianhongle
 * @data 2021/8/2 5:39 下午
 **/
@RestController
public class JenkinsController {

    @GetMapping("/")
    public String hello() {
        return "Hello Jenkins Demo";
    }

}
