public class TaskLinkedList {
    private static class Node {
        Task task;
        Node next;
        Node(Task task) { this.task = task; }
    }

    private Node head;
    private int size = 0;

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node cur = head;
            while (cur.next != null) cur = cur.next;
            cur.next = newNode;
        }
        size++;
        System.out.println("Added: " + task);
    }

    public Task search(int taskId) {
        Node cur = head;
        while (cur != null) {
            if (cur.task.getTaskId() == taskId) return cur.task;
            cur = cur.next;
        }
        return null;
    }

    public void traverse() {
        System.out.println("All tasks:");
        Node cur = head;
        while (cur != null) {
            System.out.println("  " + cur.task);
            cur = cur.next;
        }
    }

    public boolean delete(int taskId) {
        if (head == null) return false;
        if (head.task.getTaskId() == taskId) {
            System.out.println("Deleted: " + head.task);
            head = head.next;
            size--;
            return true;
        }
        Node prev = head, cur = head.next;
        while (cur != null) {
            if (cur.task.getTaskId() == taskId) {
                System.out.println("Deleted: " + cur.task);
                prev.next = cur.next;
                size--;
                return true;
            }
            prev = cur;
            cur = cur.next;
        }
        return false;
    }

    public int size() {
        return size;
    }
}
