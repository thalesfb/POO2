package handler;

import handler.CreditAvailabilityHandler;
import handler.IncomeHandler;
import handler.CreditHistoryHandler;
import handler.CollateralHandler;
import interfaces.Handler;

public abstract class AbstractHandler implements Handler {
  private Handler nextHandler;

  public void setNext(Handler nextHandler) {
    this.nextHandler = nextHandler;
  }

  protected boolean handleNext(Request request) {
    if (nextHandler != null) {
      return nextHandler.handle(request);
    }
    return true; // Retorne true se não houver mais handlers na cadeia
  }

  // Adicione um método estático ou de instância para construir e retornar a
  // cadeia de handlers
  public static Handler buildChain() {
    // Crie instâncias de todos os handlers
    CreditAvailabilityHandler handler1 = new CreditAvailabilityHandler();
    IncomeHandler handler2 = new IncomeHandler();
    CreditHistoryHandler handler3 = new CreditHistoryHandler();
    CollateralHandler handler4 = new CollateralHandler();

    // Configure a cadeia de responsabilidade
    handler1.setNext(handler2);
    handler2.setNext(handler3);
    handler3.setNext(handler4);

    return handler1; // Retorne o primeiro handler da cadeia
  }
}
