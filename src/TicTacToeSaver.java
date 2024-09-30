import java.io.FileOutputStream;
import java.io.IOException;

public class TicTacToeSaver {

    public static void saveFieldToFile(int[] field) throws IOException {
        if (field.length != 9) {
            throw new IllegalArgumentException("Поле должно содержать ровно 9 элементов.");
        }

        int packedField = 0;
        // Упаковываем состояния ячеек в одно целое число типа int
        for (int i = 0; i < field.length; i++) {
            packedField |= (field[i] & 0b11) << (i * 2);  // Каждая ячейка использует 2 бита
        }

        // Записываем число в файл в виде 3 байтов
        try (FileOutputStream fos = new FileOutputStream("tictactoe.dat")) {
            fos.write(packedField & 0xFF);         // Младший байт
            fos.write((packedField >> 8) & 0xFF);  // Средний байт
            fos.write((packedField >> 16) & 0xFF); // Старший байт
        }
    }

    public static void main(String[] args) {
        int[] ticTacToeField = {1, 2, 0, 1, 2, 0, 3, 1, 2};  // Пример игрового поля

        try {
            saveFieldToFile(ticTacToeField);
            System.out.println("Игровое поле сохранено в файл tictactoe.dat.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
