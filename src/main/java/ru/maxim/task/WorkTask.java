package ru.maxim.task;

public class WorkTask extends Task {
    private String projectName;

    public WorkTask(String title, int priority, String projectName) {
        super(title, priority);
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }
}
