public class Student {
    int studentid;
    String name;
    int age;

    Student(int studentid, String name, int age) {
        this.studentid = studentid;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Student ID: " + studentid);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Alice", 20);
        Student student2 = new Student(2, "Bob", 22);

        student1.display();
        System.out.println();
        student2.display();
    }
}
