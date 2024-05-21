package task;

import interface.Task;

public class SimpleTask implements Task {
  private String title;
  private String description;
  private String dueDate;

  public SimpleTask(String title, String description, String dueDate) {
    this.title = title;
    this.description = description;
    this.dueDate = dueDate;
  }

  @Override
  public void display() {
    System.out.println("Task: " + title);
    System.out.println("Description: " + description);
    System.out.println("Due Date: " + dueDate);
  }
}