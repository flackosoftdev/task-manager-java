package enumpractice;

public class Main {
    public static void main(String[] args) {
        Task task = new Task("Do homework", TaskStatus.NEW);
        Task task2 = new Task("Do sports", TaskStatus.DONE);
        System.out.println(task);
        System.out.println(task2);

    }
}
