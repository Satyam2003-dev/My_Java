// package inheritance.people;

public class inheritanceCheckerwithConstructor {

    public static void main(String[] args) {
        // Person person = new Person();
        Employee employee = new Employee();
    }
}

class Person {

    private String name;
    private int age;
    private String gender;

    // Uncomment this if you want to use the default constructor
    // public Person() {
    //     System.out.println("In Person default constructor");
    // }

    public Person(String name) {
        System.out.println("In Person 2nd constructor. Name is set");
        this.name = name;
    }

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

    public Employee() {
        super("John Doe");
        System.out.println("In Employee default constructor");
    }

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
