package payment.factory;

import payment.entity.Payment;

public abstract class PaymentFactory {

  public void processPayment(double valor) {
    Payment payment = createPayment();
    payment.pagar(valor);
  }

  public abstract Payment createPayment();
}