package com.nokia.knowcamp.web;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

  @Autowired
  DiscoveryClient discoveryClient;

  @RequestMapping("/")
  public String index() {
    InstanceInfo networkMicroservice = discoveryClient.getNextServerFromEureka("network", false);
    System.err.println(networkMicroservice.getHomePageUrl());

    return "index";
  }
}
