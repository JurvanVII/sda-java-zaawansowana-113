package company;

public class Employee {
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

}
