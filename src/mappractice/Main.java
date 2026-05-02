package mappractice;

import oop.Task;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Task> taskHashMap = new HashMap<>();
        Task task = new Task(1,"Do homework", "Math exercises", false);
        Task task2 = new Task(2,"Do SPORT", "Running", false);
        taskHashMap.put(1, task);
        taskHashMap.put(2, task2);
        System.out.println(taskHashMap.get(1));
        taskHashMap.remove(1);
        System.out.println(taskHashMap);
        System.out.println(taskHashMap.containsKey(1));
        System.out.println(taskHashMap.containsKey(2));

    }
}
