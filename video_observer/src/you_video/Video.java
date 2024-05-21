package you_video;

public class Video {
  private String name;
  private String description;
  private String url;
  private Channel channel;

  public Video(String name, String description, String url, Channel channel) {
    this.name = name;
    this.description = description;
    this.url = url;
    this.channel = channel;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public String getUrl() {
    return url;
  }

  public Channel getChannel() {
    return channel;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String descripton) {
    this.description = descripton;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

}