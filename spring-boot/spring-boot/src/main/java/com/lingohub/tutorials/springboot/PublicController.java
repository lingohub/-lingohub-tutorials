package com.lingohub.tutorials.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublicController {

  @GetMapping("/public")
  public String login() {
    return "public";
  }
}
