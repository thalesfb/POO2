package payment.factory;

import payment.entity.Payment;
import payment.entity.Card;

public class CardFactory extends PaymentFactory {

  @Override
  public Payment createPayment() {
    System.out.println("Criando cartão de crédito...");
    return new Card();
  }

  @Override
  public void processPayment(double valor) {
    Payment payment = createPayment();
    payment.pagar(valor);
  }
}