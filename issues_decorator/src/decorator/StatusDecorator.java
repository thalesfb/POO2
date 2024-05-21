package decorator;

import interface.Task;
import decorator.TaskDecorator;

public class StatusDecorator extends TaskDecorator {
  private String status;

  public StatusDecorator(Task decoratedTask, String status) {
    super(decoratedTask);
    this.status = status;
  }

  @Override
  public void display() {
    super.display();
    System.out.println("Status: " + status);
  }
}