public class Main {
    public static void main(String[] args) {
        // Создаём сотрудников
        RegularEmployee employee1 = new RegularEmployee("Alice", 1990, 5, 20, 50000);
        RegularEmployee employee2 = new RegularEmployee("Bob", 1985, 8, 15, 45000);
        Manager manager = new Manager("Charlie", 1975, 11, 5, 80000);

        // Массив сотрудников, включая руководителя
        Employee[] employees = {employee1, employee2, manager};

        // Повышаем зарплату всем сотрудникам, кроме руководителей
        Manager.raiseSalary(employees, 10);

        // Выводим информацию о сотрудниках
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
