package client;

import you_video.*;

public class Client{
  public static void main(String[] args) {
    Channel chanel1 = new Channel("Canal do Seu Zé");
    Channel chanel2 = new Channel("Canal da Dona Maria");

    User user1 = new User("Zé");
    User user2 = new User("Maria");

    chanel1.subscribe(user1);
    chanel1.subscribe(user2);

    Video video1 = new Video("Vídeo 1", "Descrição do vídeo 1", "url1", chanel1);
    chanel1.post(video1);

    Video video2 = new Video("Vídeo 2", "Descrição do vídeo 2", "url2", chanel2);
    chanel2.post(video2);

    chanel1.unsubscribe(user1);

    Video video3 = new Video("Vídeo 3", "Descrição do vídeo 3", "url3", chanel1);
    chanel1.post(video3);

    User user3 = new User("João");

    chanel2.subscribe(user3);

    Video video4 = new Video("Vídeo 4", "Descrição do vídeo 4", "url4", chanel2);
    chanel2.post(video4);
  }
}