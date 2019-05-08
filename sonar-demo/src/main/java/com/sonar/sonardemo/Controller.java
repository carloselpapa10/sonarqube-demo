package com.sonar.sonardemo;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/sonar")
public class Controller {

    @GetMapping
    public String sayHi(){
        return "Hi Sonar Demo!";
    }

    @PostMapping
    public Boolean getSonnarResponse(@RequestBody Map<String, Object> response){

        return true;
    }
}
