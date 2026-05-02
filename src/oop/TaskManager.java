package oop;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {


        if (findTaskById(task.getId()) == null) {
            tasks.add(task);
        }
        else {
            System.out.println("This task already exists");
        }

    }

    public Task findTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId()== id) {
                return task;
            }
        }
        return null;
    }

    public void completeTask(int id) {
        Task task = findTaskById(id);

        if(task != null && !task.isDone()) {
            task.setDone(true);
            System.out.println("Task completed: " + task);
        }

        else if(task != null && task.isDone()) {
            System.out.println("Task is already completed:" + task);
        }

        else {
            System.out.println("Task not found!");
        }
    }

    public void deleteTask(int id) {
        Task task = findTaskById(id);
        if (task != null) {
            tasks.remove(task);
            System.out.println("You removed task: " + task.getTitle());
        }

        else {
            System.out.println("Task not found");
        }
    }

    public void printCompletedTasks() {
        for(Task task: tasks) {
            if (task.isDone()) {
                System.out.println(task);
            }
        }
    }

    public void printUncompletedTasks() {
        for(Task task: tasks) {
            if (!task.isDone()) {
                System.out.println(task);
            }
        }
    }
    public void printAllTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
