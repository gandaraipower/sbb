package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/index")
    @ResponseBody   //URL 요청에 대한 응답으로 문자열을 리턴하라
    public String index(){
        return "index() 메서드 호출됨!";
    }

    @GetMapping("/hello")
    public void hello(){
        System.out.println("hello() 메서드 호출됨!");
    }
}
