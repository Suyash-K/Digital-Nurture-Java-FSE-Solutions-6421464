public class MVCDemo {
    public static void main(String[] args) {
        Student model = new Student(1, "Alice", 88.5);

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Alice Smith");
        controller.setStudentGrade(91.0);

        controller.updateView();
    }
}