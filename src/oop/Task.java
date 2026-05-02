package oop;

public class Task {
    private int id;
    private String title;
    private String description;
    private boolean done;

    public Task(int id, String title, String description, boolean done) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return id + " - " + title + " - " + description + " - done: " + done;
    }
}
