package org.example.implementations;

import org.example.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyre implements Tyre {

  @Override
  public void rotate() {
    IO.println("Rotating BridgeStone tyre...");
  }
}
