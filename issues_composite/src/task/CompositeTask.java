package task;

import java.util.ArrayList;
import java.util.List;
import interfaces.Task;

public class CompositeTask implements Task {
    private String title;
    private List<Task> subtasks;

    public CompositeTask(String title) {
        this.title = title;
        this.subtasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        subtasks.add(task);
    }

    @Override
    public void display() {
        System.out.println("Composite Task: " + title);
        for (Task task : subtasks) {
            task.display();
        }
    }
}
