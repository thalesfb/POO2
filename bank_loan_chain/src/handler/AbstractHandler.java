package handler;

import request.Request;
import interfaces.Handler;

public abstract class AbstractHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

     @Override
    public boolean handle(Request request) {
        if (nextHandler != null) {
            return nextHandler.handle(request);
        }
        return true; // Retorne true se não houver mais handlers na cadeia
    }
}
