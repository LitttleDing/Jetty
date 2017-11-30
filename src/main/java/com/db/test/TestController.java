package com.db.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/data")
    @ResponseBody
    public String data(){
        return "index";
    }
}
