package ru.maxim.task;

public abstract class Task {
    private int id;
    private String title;
    private int priority;

    public Task(String title, int priority) {
        this.title = title;
        this.priority = priority;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPriority() {
       return priority;
    }
    public String getTitle() {
        return title;
    }

}
