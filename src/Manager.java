// Перечисление с праздниками
enum Holiday {
    NO_HOLIDAY, NEW_YEAR, MARCH_8, FEBRUARY_23
}

public class Manager extends Employee {
    private double salary;

    // Конструктор
    public Manager(String name, int year, int month, int day, Gender gender, double salary) {
        super(name, year, month, day, gender);
        this.salary = salary;
    }

    // Метод для поздравления сотрудников в зависимости от праздника
    public static void congratulateEmployees(Employee[] employees, Holiday holiday) {
        for (Employee employee : employees) {
            switch (holiday) {
                case NEW_YEAR:
                    System.out.println("С Новым Годом, " + employee.getName() + "!");
                    break;
                case MARCH_8:
                    if (employee.getGender() == Gender.FEMALE) {
                        System.out.println("С 8 марта, " + employee.getName() + "!");
                    }
                    break;
                case FEBRUARY_23:
                    if (employee.getGender() == Gender.MALE) {
                        System.out.println("С 23 февраля, " + employee.getName() + "!");
                    }
                    break;
                default:
                    System.out.println("Сегодня нет праздника.");
                    break;
            }
        }
    }
}
