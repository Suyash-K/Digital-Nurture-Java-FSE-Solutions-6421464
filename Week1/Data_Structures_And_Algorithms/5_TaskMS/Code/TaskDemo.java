public class TaskDemo {
    public static void main(String[] args) {
        TaskLinkedList list = new TaskLinkedList();

        list.addTask(new Task(1, "Design API", "Open"));
        list.addTask(new Task(2, "Write Tests", "Open"));
        list.addTask(new Task(3, "Fix Bugs", "Open"));

        list.traverse();

        System.out.println("Search ID 2: " + list.search(2));

        list.delete(2);
        list.traverse();

        System.out.println("Current size: " + list.size());
    }
}
