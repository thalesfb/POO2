package interfaces;

import handler.Request;

public interface Handler {
  Handler setNext(Handler handler);

  boolean handle(Request request);
}