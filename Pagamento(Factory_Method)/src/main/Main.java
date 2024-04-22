package main;

import payment.entity.*;
import payment.factory.*;

public class Main {

  public static void main(String[] args) {
    PaymentFactory factory = new TransferFactory();
    factory.processPayment(100.0);

    factory = new BankSlipFactory();
    factory.processPayment(200.0);

    factory = new PIXFactory();
    factory.processPayment(300.0);
  }
}
