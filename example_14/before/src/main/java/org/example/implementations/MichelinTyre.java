package org.example.implementations;

import org.example.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyre  implements Tyre {

  @Override
  public String rotate() {
    return "Rotating Michelin tyre...";
  }

  @Override
  public String stop() {
    return "Vehicle stopped with the help of Michelin tyres";
  }
}
