package com.nokia.knowcamp.network.domain;

public class NetworkInterface {

  private final String name;

  public NetworkInterface(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return String.format("NetworkInterface{name='%s'}", name);
  }
}
