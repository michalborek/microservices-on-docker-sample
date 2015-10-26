package com.nokia.knowcamp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IndexController {

  public static final String NETWORKS_SERVICE_URL = "http://NETWORK/";
  @Autowired
  RestTemplate restTemplate;

  @RequestMapping("/")
  public String index() {
    return "hello world <br/><pre>" + restTemplate
        .getForEntity(NETWORKS_SERVICE_URL, String.class) + "</pre>";

  }
}
