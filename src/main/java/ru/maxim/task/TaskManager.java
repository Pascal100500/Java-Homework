package ru.maxim.task;

import java.util.HashMap;

public class TaskManager {
    private HashMap<Integer, Task> tasks;
    private int nextId = 1;

    public TaskManager() {
        tasks = new HashMap<>();
    }

    public void addTask(Task task) {
        task.setId(nextId);
        tasks.put(nextId, task);
        nextId++;
    }

    public Task getTask(int id) {
        return tasks.get(id);
    }
}
