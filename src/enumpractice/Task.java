package enumpractice;

public class Task {
    String title;
    TaskStatus status;
    public Task(String title, TaskStatus status) {
        this.title = title;
        this.status = status;
    }

    public String toString() {
        return title + " - status: " + status;
    }
}
