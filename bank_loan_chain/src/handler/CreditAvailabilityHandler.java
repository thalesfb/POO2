package handler;

import handler.AbstractHandler;

public class CreditAvailabilityHandler extends AbstractHandler {
    @Override
    public boolean handle(Request request) {
        // Verifica se a quantia solicitada é maior que 5000 para aprovar
        if (request.getLoanAmount() > 5000) {
            System.out.println("Quantia de crédito solicitada é alta para aprovação automática.");
            return false; // Reprovação do empréstimo
        }
        System.out.println("Quantia de crédito solicitada abaixo de 5000. Empréstimo aprovado.");
        return super.handle(request); // Passa para o próximo handler na cadeia se houver
    }
}
