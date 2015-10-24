package com.nokia.knowcamp.network.domain;

public class NetworkConnection {

  private NetworkObject from;
  private NetworkObject to;
  private NetworkInterface networkInterface;

  public NetworkConnection(NetworkObject from, NetworkObject to, NetworkInterface networkInterface) {
    this.from = from;
    this.to = to;
    this.networkInterface = networkInterface;
  }


  public NetworkObject getFrom() {
    return from;
  }

  public NetworkObject getTo() {
    return to;
  }

  public NetworkInterface getNetworkInterface() {
    return networkInterface;
  }

  @Override
  public String toString() {
    return String.format("NetworkConnection{from=%s, to=%s, networkInterface=%s}", from, to, networkInterface);
  }
}
