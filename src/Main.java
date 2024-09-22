public class Main {
    public static void main(String[] args) {
        // Создаем сотрудников
        Employee employee1 = new RegularEmployee("Alice", 1990, 5, 20, Gender.FEMALE, 50000);
        Employee employee2 = new RegularEmployee("Bob", 1985, 8, 15, Gender.MALE, 45000);
        Employee manager = new Manager("Charlie", 1975, 11, 5, Gender.MALE, 80000);

        // Массив сотрудников
        Employee[] employees = {employee1, employee2, manager};

        // Текущий праздник
        Holiday todayHoliday = Holiday.NEW_YEAR;

        // Поздравляем сотрудников с праздником
        Manager.congratulateEmployees(employees, todayHoliday);
    }
}
