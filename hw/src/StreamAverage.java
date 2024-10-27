import java.util.Arrays;
import java.util.List;

public class StreamAverage {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Находим среднее значение всех четных чисел
        double average = numbers.stream()
                .filter(n -> n % 2 == 0)              // Оставляем только четные числа
                .mapToInt(Integer::intValue)          // Преобразуем в IntStream
                .average()                            // Находим среднее значение
                .orElse(0);                           // Возвращаем 0, если среднее не может быть посчитано

        System.out.println("Среднее значение четных чисел: " + average);
    }
}
