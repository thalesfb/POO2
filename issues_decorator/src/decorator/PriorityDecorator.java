package decorator;

import interface.Task;
import decorator.TaskDecorator;

public class PriorityDecorator extends TaskDecorator {
  private String priority;

  public PriorityDecorator(Task decoratedTask, String priority) {
    super(decoratedTask);
    this.priority = priority;
  }

  @Override
  public void display() {
    super.display();
    System.out.println("Priority: " + priority);
  }
}