package company;

public class Manager extends Employee {

    private int bonus;

    public Manager(String name, int salary) {
        super(name, salary);
        System.out.println("Wywoluje konstrukator z klasy Manager z argumentami: " + name + " i " + salary);
    }

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
        System.out.println("Wywoluje konstrukator z klasy Manager z argumentami: " + name + " " + salary + " i " + bonus);
    }

    public void makeSpeech() {
        System.out.println("DO BOJU! JESTES ZWYCIEZCA!");
    }

    @Override
    public int getSalary() { //przesloniecie
        //return super.getSalary() + bonus;
        return salary + bonus; // ta nmozna bo zmienielismy w employee z private int salary na int salary
    }

    //przeiczanie
    public void makeSpeech(String additionalMessage) {
        makeSpeech();
        System.out.println(additionalMessage);
    }
}
