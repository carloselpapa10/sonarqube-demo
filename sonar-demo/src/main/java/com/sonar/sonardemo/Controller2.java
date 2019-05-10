package com.sonar.sonardemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sonar2")
public class Controller2 {

    @GetMapping("/test1")
    public String sayHi2(){
        return "Hi Sonar Demo! Test1";
    }

    @GetMapping("/test2")
    public String sayHi3(){
        return "Hi Sonar Demo! Test4";
    }
}
