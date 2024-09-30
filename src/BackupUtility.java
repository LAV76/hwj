import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BackupUtility {

    public static void createBackup(String sourceDir) throws IOException {
        // Папка назначения
        Path backupDir = Paths.get("./backup");

        // Создаем папку backup, если она не существует
        if (!Files.exists(backupDir)) {
            Files.createDirectory(backupDir);
        }

        // Получаем список всех файлов в исходной директории (без поддиректорий)
        File dir = new File(sourceDir);
        File[] files = dir.listFiles((file, name) -> new File(file, name).isFile());

        if (files != null) {
            for (File file : files) {
                Path sourceFile = file.toPath();
                Path destinationFile = backupDir.resolve(file.getName());
                Files.copy(sourceFile, destinationFile);
                System.out.println("Файл " + file.getName() + " скопирован в папку backup.");
            }
        } else {
            System.out.println("В исходной директории нет файлов.");
        }
    }

    public static void main(String[] args) {
        try {
            createBackup("./source");  // Замените './source' на директорию, откуда копировать файлы
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
