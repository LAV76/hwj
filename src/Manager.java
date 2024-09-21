public class Manager extends Employee {
    private double salary;

    // Конструктор
    public Manager(String name, int year, int month, int day, double salary) {
        super(name, year, month, day);
        this.salary = salary;
    }

    // Статический метод повышения зарплаты всем сотрудникам, кроме руководителей
    public static void raiseSalary(Employee[] employees, double percent) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                ((RegularEmployee) employee).increaseSalary(percent);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Manager, Salary: " + salary;
    }
}

class RegularEmployee extends Employee {
    private double salary;

    // Конструктор
    public RegularEmployee(String name, int year, int month, int day, double salary) {
        super(name, year, month, day);
        this.salary = salary;
    }

    // Метод для увеличения зарплаты
    public void increaseSalary(double percent) {
        salary += salary * percent / 100;
    }

    @Override
    public String toString() {
        return super.toString() + ", Regular Employee, Salary: " + salary;
    }
}

