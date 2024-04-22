package payment.factory;

import payment.entity.Payment;
import payment.entity.Transfer;

public class TransferFactory extends PaymentFactory {

  @Override
  public Payment createPayment() {
    System.out.println("Criando transferência...");
    return new Transfer();
  }

  @Override
  public void processPayment(double valor) {
    Payment payment = createPayment();
    payment.pagar(valor);
  }
}