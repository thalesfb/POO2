package payment.factory;

import payment.entity.Payment;
import payment.entity.BankSlip;

public class BankSlipFactory extends PaymentFactory {

  @Override
  public Payment createPayment() {
    System.out.println("Criando boleto...");
    return new BankSlip();
  }

  @Override
  public void processPayment(double valor) {
    Payment payment = createPayment();
    payment.pagar(valor);
  }
}
