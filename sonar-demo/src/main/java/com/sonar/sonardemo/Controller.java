package com.sonar.sonardemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/sonar")
public class Controller {

    public static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping
    public String sayHi(){
        return "Hi Sonar Demo!";
    }

    @PostMapping
    public Boolean getSonnarResponse(@RequestBody Map<String, Object> response){
        return true;
    }
}
