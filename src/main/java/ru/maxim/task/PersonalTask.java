package ru.maxim.task;

import java.time.LocalDate;

public class PersonalTask extends Task{
    private LocalDate deadline;

    public PersonalTask (String title, int priority, LocalDate deadline){
        super(title, priority);
        this.deadline = deadline;
    }

    public LocalDate getDeadline() {
        return deadline;
    }
}
