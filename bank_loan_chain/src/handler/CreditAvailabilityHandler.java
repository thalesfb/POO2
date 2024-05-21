package handler;

import request.Request;
import interfaces.Handler;

public class CreditAvailabilityHandler extends AbstractHandler {
    @Override
    public boolean handle(Request request) {
        if (isCreditAvailable(request)) {
            return super.handle(request);
        } else {
            return false; // Crédito não disponível
        }
    }

    private boolean isCreditAvailable(Request request) {
        // Implementação da verificação de crédito
        return true;
    }
}
