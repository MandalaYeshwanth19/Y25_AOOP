public class Employee {
    int employeeId;
    String name;
    String department;

    Employee(int employeeId, String name, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "John", "HR");
        Employee employee2 = new Employee(102, "Jane", "Finance");

        employee1.display();
        System.out.println();
        employee2.display();
    }   
}
