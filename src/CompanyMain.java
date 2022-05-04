import company.Employee;
import company.Manager;
import company.Secretary;

public class CompanyMain {
        public static void main(String[] args) {
            Employee employeeOne = new Employee("Jan", 200, 11);
            Manager employeeTwo = new Manager("Bogdan", 250, 50, 22);
            Secretary employeeThree = new Secretary("Ala", 230, 33);


            Employee employeeFour = new Manager("Ola", 250, 50, 44);
            System.out.println(employeeFour.getSalary());
//            employeeTwo.show();
//            employeeThree.makeCall();

            Employee[] employees = new Employee[3];
            employees[0] = employeeOne;
            employees[1] = employeeTwo;
            employees[2] = employeeThree;

            for(Employee e : employees) {
                e.show();
                int employeeSalary = e.getSalary();
                System.out.println(employeeSalary);
            }
        }
}
