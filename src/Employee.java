// Перечисление с гендерами
enum Gender {
    MALE, FEMALE
}

public class Employee {
    private String name;
    private int year;
    private int month;
    private int day;
    private Gender gender;

    // Конструктор
    public Employee(String name, int year, int month, int day, Gender gender) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
        this.gender = gender;
    }

    // Геттеры и сеттеры для пола
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + ": " + year + "-" + month + "-" + day + ", Gender: " + gender;
    }
}
