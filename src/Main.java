public class Main {
    public static int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int differenceMaxMin(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }
    public static boolean hasTwoConsecutiveZeros(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
//      Задача 1: Метод, возвращающий количество чётных элементов массива
        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4})); // 3
        System.out.println(countEvens(new int[]{2, 2, 0})); // 3
        System.out.println(countEvens(new int[]{1, 3, 5})); // 0

//      Задача 2: Метод, возвращающий разницу между самым большим и самым маленьким элементами массива
        System.out.println(differenceMaxMin(new int[]{10, 3, 5, 6})); // 7
        System.out.println(differenceMaxMin(new int[]{7, 2, 10, 1})); // 9
        System.out.println(differenceMaxMin(new int[]{1, 1, 1, 1})); // 0

//      Задача 3: Метод, возвращающий истину, если есть два соседних нуля в массиве
        System.out.println(hasTwoConsecutiveZeros(new int[]{1, 0, 0, 2})); // true
        System.out.println(hasTwoConsecutiveZeros(new int[]{1, 2, 3, 0})); // false
        System.out.println(hasTwoConsecutiveZeros(new int[]{0, 1, 0, 0})); // true
    }
}
