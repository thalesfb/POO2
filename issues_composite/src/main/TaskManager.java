package main;

import task.CompositeTask;
import task.SimpleTask;
import interfaces.Task;

public class TaskManager {
  public static void main(String[] args) {
    // Criação de tarefas simples
    Task task1 = new SimpleTask("Fix bug", "Fix the login bug on website", "2024-05-01");
    Task task2 = new SimpleTask("Add feature", "Add payment gateway", "2024-06-15");

    // Criação de uma tarefa composta
    CompositeTask project = new CompositeTask("Website Improvement");

    // Adicionando tarefas simples à tarefa composta
    project.addTask(task1);
    project.addTask(task2);

    // Criando outra tarefa composta que pode ser adicionada à tarefa composta principal
    CompositeTask subProject = new CompositeTask("Backend Enhancements");
    subProject.addTask(new SimpleTask("Upgrade server", "Upgrade the server to handle more traffic", "2024-07-20"));
    project.addTask(subProject);

    // Display das tarefas
    project.display();
  }
}
