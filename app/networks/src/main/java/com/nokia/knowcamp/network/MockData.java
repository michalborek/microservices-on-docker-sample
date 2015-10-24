package com.nokia.knowcamp.network;

import com.nokia.knowcamp.network.domain.NetworkConnection;
import com.nokia.knowcamp.network.domain.NetworkInterface;
import com.nokia.knowcamp.network.domain.NetworkObject;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class MockData {

  public static final List<NetworkObject> OBJECTS = asList("App1", "App2", "App3")
      .stream().map(NetworkObject::new).collect(toList());

  public static final List<NetworkInterface> INTERFACES = asList("ssh", "http", "https")
      .stream().map(NetworkInterface::new).collect(toList());

  public static final List<NetworkConnection> CONNECTIONS = asList(
      new NetworkConnection(OBJECTS.get(0), OBJECTS.get(1), INTERFACES.get(0)),
      new NetworkConnection(OBJECTS.get(1), OBJECTS.get(2), INTERFACES.get(1)),
      new NetworkConnection(OBJECTS.get(2), OBJECTS.get(0), INTERFACES.get(2))
  );
}
