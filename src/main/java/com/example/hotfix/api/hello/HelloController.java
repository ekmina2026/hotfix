package com.example.hotfix.api.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
  
  @GetMapping
  public String hello(){
    return "Hello";
  }

  @GetMapping("/index")
  public String index(){
    return "index.html";
  }
}
