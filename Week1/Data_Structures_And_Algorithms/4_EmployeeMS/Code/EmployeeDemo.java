public class EmployeeDemo {
    public static void main(String[] args) {
        EmployeeManager mgr = new EmployeeManager(5);

        mgr.addEmployee(new Employee(1, "Alice", "Developer", 70000));
        mgr.addEmployee(new Employee(2, "Bob",   "Designer", 65000));
        mgr.addEmployee(new Employee(3, "Carol", "Manager",  90000));

        mgr.traverse();

        System.out.println("Search ID 2: index = " + mgr.searchById(2));

        mgr.deleteById(2);
        mgr.traverse();
    }
}
