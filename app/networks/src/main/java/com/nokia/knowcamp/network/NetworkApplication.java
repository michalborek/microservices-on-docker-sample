package com.nokia.knowcamp.network;

import com.nokia.knowcamp.network.domain.NetworkConnection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class NetworkApplication {

  public static void main(String[] args) {
    SpringApplication.run(NetworkApplication.class, args);
  }

  @RequestMapping("/")
  public List<NetworkConnection> list() {
    return MockData.CONNECTIONS;
  }

}
