public class User {
    private String name;
    private TaskList toDoList;

    public User(String name) {
        this.name = name;
        this.toDoList = new TaskList();
    }

    public String getName() {
        return name;
    }

    public TaskList getToDoList() {
        return toDoList;
    }
}
