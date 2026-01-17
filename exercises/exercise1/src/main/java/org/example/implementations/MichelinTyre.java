package org.example.implementations;

import org.example.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyre  implements Tyre {

  @Override
  public void rotate() {
    IO.println("Rotating Michelin tyre...");
  }
}
