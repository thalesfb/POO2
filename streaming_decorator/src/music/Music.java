package music;

import interfaces.MusicInterface;

public class Music implements MusicInterface {
  private String title;

  public Music(String title) {
    this.title = title;
  }

  @Override
  public void play() {
    System.out.println("Playing music: " + title);
  }
}