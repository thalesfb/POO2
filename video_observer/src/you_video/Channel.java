package you_video;

import interfaces.*;
import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
  private String name;
  private List<Observer> register = new ArrayList<>();
  private Video video;

  public Channel(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void subscribe(Observer observer) {
    register.add(observer);
  }

  @Override
  public void unsubscribe(Observer observer) {
    register.remove(observer);
  }

  @Override
  public void notified() {
    for (Observer registered : register) {
      registered.update("Novo vídeo postado! " + video.getName() + " - " + this.name);
    }
  }

  public void post(Video video) {
    this.video = video;
    notified();
  }

}