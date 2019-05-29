package com.zell.practice.controller;

import com.zell.practice.annotation.LogEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Z on 2019/5/27.
 */
@Controller
@Slf4j
public class PracticeController {
    @RequestMapping("/test")
    @ResponseBody
    @LogEvent
    public String test(String arg0, String arg1, String arg2) {
        log.info(arg0);
        return arg0;
    }
}
