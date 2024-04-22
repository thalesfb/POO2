package main;

import decorators.*;
import interfaces.MusicInterface;
import music.Music;

public class StreamingMusic {
  public static void main(String[] args) {
    MusicInterface myMusic = new Music("November Rain - Guns N' Roses");

    // Decorando a música com equalizador
    myMusic = new EqualizerDecorator(myMusic);

    // Adicionando eco
    myMusic = new EchoDecorator(myMusic);

    // Adicionando reverb
    myMusic = new ReverbDecorator(myMusic);
    // Tocando a música com todos os efeitos
    myMusic.play();
  }
}
