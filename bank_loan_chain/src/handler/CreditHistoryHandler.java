package handler;

import handler.AbstractHandler;

public class CreditHistoryHandler extends AbstractHandler {
  @Override
  public boolean handle(Request request) {
    if (request.hasCreditIssues()) {
      System.out.println("Histórico de crédito limpo.");
      return super.handle(request);
    }
    return false;
  }
}