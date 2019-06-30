package com.example.demo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

  @RequestMapping(path = "/ping", method = RequestMethod.GET)
  public String index() {
    return "Request Success";
  }
}