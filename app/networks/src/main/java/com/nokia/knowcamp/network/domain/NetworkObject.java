package com.nokia.knowcamp.network.domain;


public class NetworkObject {

  private final String name;

  public NetworkObject(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return String.format("NetworkObject{name='%s'}", name);
  }
}
