public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }
    public void setStudentGrade(double grade) {
        model.setGrade(grade);
    }
    public String getStudentName() {
        return model.getName();
    }
    public double getStudentGrade() {
        return model.getGrade();
    }

    public void updateView() {
        view.displayStudentDetails(model.getId(), model.getName(), model.getGrade());
    }
}