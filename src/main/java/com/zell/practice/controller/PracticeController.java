package com.zell.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Z on 2019/5/27.
 */
@Controller
public class PracticeController {
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }
}
