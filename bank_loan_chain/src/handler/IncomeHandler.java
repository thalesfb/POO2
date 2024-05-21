package handler;

import request.Request;
import interfaces.Handler;

public class IncomeHandler extends AbstractHandler {
    @Override
    public boolean handle(Request request) {
        if (isIncomeSufficient(request)) {
            return super.handle(request);
        } else {
            return false; // Renda insuficiente
        }
    }

    private boolean isIncomeSufficient(Request request) {
        // Implementação da verificação de renda
        return true;
    }
}
