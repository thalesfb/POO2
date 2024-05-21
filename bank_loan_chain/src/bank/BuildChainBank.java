package bank;

import handler.*;
import interfaces.Handler;

public class BuildChainBank {
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
