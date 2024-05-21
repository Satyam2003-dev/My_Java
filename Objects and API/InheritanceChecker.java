// package inheritance.people;

public class InheritanceChecker {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");
        person.setAge(30);
        person.setGender("Female");

        Employee employee = new Employee();
        employee.setName("Bob");
        employee.setAge(35);
        employee.setGender("Male");
        employee.setEmployeeId("E123");
        employee.setTitle("Manager");

        // Print values for Person
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Age: " + person.getAge());
        System.out.println("Person Gender: " + person.getGender());

        // Print values for Employee
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee Gender: " + employee.getGender());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Title: " + employee.getTitle());
    }
}

class Person {

    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

class Employee extends Person {

    private String employeeId;
    private String title;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
