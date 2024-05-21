package interfaces;

import request.Request;

public interface Handler {
  void setNext(Handler nextHandler);
  boolean handle(Request request);
}
