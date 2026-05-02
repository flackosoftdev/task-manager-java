package oop;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask(new Task(1,"Do something", "something",false));
        taskManager.addTask(new Task(1,"Do something", "something",false));
        taskManager.addTask(new Task(2,"Do something2", "something2",false));
        taskManager.addTask(new Task(3,"Do something3", "something3",false));
        taskManager.addTask(new Task(4,"Do something4", "something4",false));
        taskManager.addTask(new Task(5,"Do something5", "something5",false));
        taskManager.printAllTasks();
        taskManager.completeTask(1);
        taskManager.completeTask(1);
    }
}