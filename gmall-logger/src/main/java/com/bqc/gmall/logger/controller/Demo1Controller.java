package com.bqc.gmall.logger.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Demo1Controller {
    @PostMapping("log")
    public String log(@RequestParam("logString") String logString){
        System.out.println(logString);
        return "ok";
    }

}
