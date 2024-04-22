package decorators;

import interfaces.MusicInterface;

public abstract class MusicDecorator implements MusicInterface {
  protected MusicInterface musicDecorated;

  public MusicDecorator(MusicInterface musicDecorated) {
    this.musicDecorated = musicDecorated;
  }

  @Override
  public void play() {
    musicDecorated.play();
  }
}
