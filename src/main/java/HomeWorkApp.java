//Pavel Kondratev hw5

public class HomeWorkApp {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",30000,30);
        empArray[1] = new Employee("Petr Bezukhov", "Labourer", "petrbezukh@mailbox.com", "892312313",20000,34);
        empArray[2] = new Employee("Nikolay Rostov", "Economist", "RostovNik@mailbox.com", "892312314",70000,43);
        empArray[3] = new Employee("Andrei Bolkonsky", "Director", "ABolkonsky@mailbox.com", "892312315",100000,50);
        empArray[4] = new Employee("Elena Kuragina", "HR", "KuraginaHR@mailbox.com", "892312316",40000,24);
        for (Employee employee : empArray)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return("Name: " + name
                + "\nPosition: " + position
                + "\nEmail: " + email
                + "\nPhone: " + phone
                + "\nSalary: " + salary
                + "\nAge: " + age + "\n");
    }
}
