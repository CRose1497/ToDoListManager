public class TaskList {
    private Node head;

    private static class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    public void addTask(String description) {
        Task newTask = new Task(description);
        Node newNode = new Node(newTask);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null)
                current = current.next;
            current.next = newNode;
        }
    }

    public void markTaskCompleted(int index) {
        Node current = head;
        int i = 0;
        while (current != null) {
            if (i == index) {
                current.task.markCompleted();
                return;
            }
            current = current.next;
            i++;
        }
        System.out.println("Task index out of bounds.");
    }

    public void printTasks() {
        Node current = head;
        int i = 0;
        while (current != null) {
            System.out.println(i + ". " + current.task);
            current = current.next;
            i++;
        }
    }
}
