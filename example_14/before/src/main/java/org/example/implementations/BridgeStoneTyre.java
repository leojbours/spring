package org.example.implementations;

import org.example.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyre implements Tyre {

  @Override
  public String rotate() {
    return "Rotating BridgeStone tyre...";
  }

  @Override
  public String stop() {
    return "Vehicle stopped with the help of BridgeStone tyres";
  }
}
