package company;

public class Employee {
    /*
    private String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Wywoluje konstrukotor klasy Employeez argumentami: " + name + " i " + salary); //zeby widziec w ktorym miejscyu konstruktor Employee jest uzywany
    }

    public int getSalary() {
        return salary;
    }

    public void show() {
        System.out.println("Mam na imie: " + name + ". Moje zarobki to: " + salary);
    }
*/
    private String name;
    int salary;
    private final int age;

    public Employee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        System.out.println("Wywołuję konstrukrtor klasy Employee z argumentami: " + name + " i " + salary + " i " + age);
    }

    public Employee(String name) {
        this.name = name;
        this.age = 20;
    }

    public int getSalary() {
        return salary;
    }

    public void show() {
        System.out.println("Mam na imię " + name + " i zarabiam " + salary + " i mam lat " + age);
    }
}
