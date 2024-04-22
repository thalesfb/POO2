package decorators;

import interfaces.MusicInterface;

public class ReverbDecorator extends MusicDecorator {
  public ReverbDecorator(MusicInterface decoratedMusic) {
    super(decoratedMusic);
  }

  @Override
  public void play() {
    super.play();
    applyReverb();
  }

  private void applyReverb() {
    System.out.println("Reverb effect applied.");
  }
}