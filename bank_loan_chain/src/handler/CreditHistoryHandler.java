package handler;

import request.Request;
import interfaces.Handler;

public class CreditHistoryHandler extends AbstractHandler {
    @Override
    public boolean handle(Request request) {
        if (isCreditHistoryClear(request)) {
            return super.handle(request);
        } else {
            return false; // Histórico de crédito com problemas
        }
    }

    private boolean isCreditHistoryClear(Request request) {
        // Implementação da verificação de histórico de crédito
        return true;
    }
}
