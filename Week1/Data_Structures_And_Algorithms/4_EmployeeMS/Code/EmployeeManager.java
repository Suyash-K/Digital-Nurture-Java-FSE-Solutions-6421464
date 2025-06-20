public class EmployeeManager {
    private final Employee[] employees;
    private int size = 0;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
    }

    public boolean addEmployee(Employee e) {
        if (size >= employees.length) {
            System.out.println("Array full, cannot add: " + e);
            return false;
        }
        employees[size++] = e;
        System.out.println("Added: " + e);
        return true;
    }

    public int searchById(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void traverse() {
        System.out.println("All employees:");
        for (int i = 0; i < size; i++) {
            System.out.println("  " + employees[i]);
        }
    }

    public boolean deleteById(int id) {
        int idx = searchById(id);
        if (idx < 0) {
            System.out.println("Not found ID: " + id);
            return false;
        }
        Employee removed = employees[idx];
        for (int j = idx; j < size - 1; j++) {
            employees[j] = employees[j + 1];
        }
        employees[--size] = null;
        System.out.println("Deleted: " + removed);
        return true;
    }
}
