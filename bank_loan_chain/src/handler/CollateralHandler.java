package handler;

import request.Request;
import interfaces.Handler;

public class CollateralHandler extends AbstractHandler {
  @Override
  public boolean handle(Request request) {
    if (hasCollateral(request)) {
      return super.handle(request);
    } else {
      return false; // Sem garantias suficientes
    }
  }

  private boolean hasCollateral(Request request) {
    // Implementação da verificação de garantias
    return true;
  }
}
