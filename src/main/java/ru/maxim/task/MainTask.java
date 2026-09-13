package ru.maxim.task;

public class MainTask {
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();

        WorkTask workTask1 =
                new WorkTask("Исправить ошибку", 5, "GameStore");
        WorkTask workTask2 =
                new WorkTask("Доработать проект", 3, "Homework");

        taskManager.addTask(workTask1);
        taskManager.addTask(workTask2);

        Task foundTask1 = taskManager.getTask(1);
        Task foundTask2 = taskManager.getTask(2);

        System.out.println(foundTask1.getTitle());
        System.out.println(foundTask2.getTitle());

        System.out.println(workTask1.getId());
        System.out.println(workTask2.getId());

        System.out.println(workTask1.getPriority());
        System.out.println(workTask1.getProjectName());
    }
}