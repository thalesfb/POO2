package handler;

import handler.AbstractHandler;

public class CollateralHandler extends AbstractHandler {
  @Override
  public boolean handle(Request request) {
    if (request.hasCreditIssues()) {
      System.out.println("Garantia verificada.");
      return super.handle(request);
    }
    return false;
  }
}