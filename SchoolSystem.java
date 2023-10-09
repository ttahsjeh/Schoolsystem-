//MOKUA CALVIN
//SMOKOG2211.
//SCHOOL SYSTEM ASSIGNMENT.


import java.util.ArrayList;
import java.util.Scanner;

class Teacher {
    private String name;
    private int age;
    private String gender;
    private String dateOfEmployment;

    public Teacher(String name, int age, String gender, String dateOfEmployment) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfEmployment = dateOfEmployment;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public double calculateSalary() {
        // Add your salary calculation logic here
        // You can consider factors like experience, position, etc.
        // For simplicity, let's assume a fixed salary of $5000 for all teachers.
        return 5000.0;
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Admit a teacher");
            System.out.println("2. Calculate and display teacher salaries");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter teacher's name: ");
                    String name = scanner.next();
                    System.out.print("Enter teacher's age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter teacher's gender: ");
                    String gender = scanner.next();
                    System.out.print("Enter teacher's date of employment: ");
                    String dateOfEmployment = scanner.next();

                    Teacher teacher = new Teacher(name, age, gender, dateOfEmployment);
                    teachers.add(teacher);
                    System.out.println("Teacher admitted successfully.");
                    break;

                case 2:
                    System.out.println("Teacher Salaries:");
                    for (Teacher t : teachers) {
                        System.out.println("Name: " + t.getName() + ", Salary: $" + t.calculateSalary());
                    }
                    break;

                case 3:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
