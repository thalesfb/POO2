package decorators;

import interfaces.MusicInterface;

public class EchoDecorator extends MusicDecorator {
  public EchoDecorator(MusicInterface decoratedMusic) {
    super(decoratedMusic);
  }

  @Override
  public void play() {
    super.play();
    applyEcho();
  }

  private void applyEcho() {
    System.out.println("Echo effect applied.");
  }
}
