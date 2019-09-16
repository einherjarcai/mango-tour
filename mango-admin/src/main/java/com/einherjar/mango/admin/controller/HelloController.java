package com.einherjar.mango.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :   einherjar
 * @file :   HelloController.java
 * @create :   2019-09-10 20:21
 * @Description :
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public Object hello () {
        return "Hello World!";
    }
}
