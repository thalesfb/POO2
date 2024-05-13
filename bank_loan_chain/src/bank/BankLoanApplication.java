package bank;

import handler.AbstractHandler;
import handler.Request;

public class BankLoanApplication {
  public static void main(String[] args) {
    Handler handler = AbstractHandler.buildChain(); // Obtenha a cadeia de handlers configurada
    Request request = new Request(5000, 30000, true, true);

    // Processar a requisição através da cadeia de handlers
    boolean result = handler.handle(request);
    if (result) {
      System.out.println("Empréstimo aprovado.");
    } else {
      System.out.println("Empréstimo negado.");
    }
  }
}
