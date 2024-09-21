//метод внутри класса сотрудника, сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
import java.util.Objects;

public class Employee {
    private String name;
    private int year;
    private int month;
    private int day;

    // Конструктор
    public Employee(String name, int year, int month, int day) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Метод для сравнения двух дат (гггг-мм-дд)
    public static int compareDates(int year1, int month1, int day1, int year2, int month2, int day2) {
        return Objects.compare(year1 * 10000 + month1 * 100 + day1, year2 * 10000 + month2 * 100 + day2, Integer::compare);
    }

    @Override
    public String toString() {
        return name + ": " + year + "-" + month + "-" + day;
    }
}
