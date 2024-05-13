package handler;

import handler.AbstractHandler;

public class IncomeHandler extends AbstractHandler {
  @Override
  public boolean handle(Request request) {
    if (request.getMonthlyIncome() * 0.25 >= request.getLoanAmount()) {
      System.out.println("Compatibilidade de renda verificada.");
      return super.handle(request);
    }
    return false;
  }
}