package payment.factory;

import payment.entity.Payment;
import payment.entity.PIX;

public class PIXFactory extends PaymentFactory {

  @Override
  public Payment createPayment() {
    System.out.println("Criando PIX...");
    return new PIX();
  }

  @Override
  public void processPayment(double valor) {
    Payment payment = createPayment();
    payment.pagar(valor);
  }
}