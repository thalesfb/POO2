package main;

import task.CompositeTask;
import task.PriorityDecorator;
import task.SimpleTask;
import task.StatusDecorator;
import interface.Task;

public class TaskManager {
  public static void main(String[] args) {
    Task simpleTask = new SimpleTask("Learn Java", "Study the basics of Java programming", "2024-01-01");
    Task priorityTask = new PriorityDecorator(simpleTask, "High");
    Task statusTask = new StatusDecorator(priorityTask, "Completed");

    CompositeTask project = new CompositeTask("Java Project");
    project.addTask(statusTask);

    project.display();
  }
}
