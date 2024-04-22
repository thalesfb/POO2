package decorators;

import interfaces.MusicInterface;

public class EqualizerDecorator extends MusicDecorator {
  public EqualizerDecorator(MusicInterface decoratedMusic) {
    super(decoratedMusic);
  }

  @Override
  public void play() {
    super.play();
    applyEqualization();
  }

  private void applyEqualization() {
    System.out.println("Equalization applied: adjusting bass and treble.");
  }
}