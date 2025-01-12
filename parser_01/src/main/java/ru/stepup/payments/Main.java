package ru.stepup.payments;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fileCount = 0;

        while (true) {
            System.out.println("Введите путь к файлу:");
            String path = scanner.nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (!fileExists || isDirectory) {
                if (!fileExists) {
                    System.out.println("Файл не существует.");
                } else {
                    System.out.println("Указанный путь ведет к папке, а не к файлу.");
                }
                continue;
            }
            fileCount++;
            System.out.println("Путь указан верно.");
            System.out.println("Это файл номер " + fileCount);
        }
    }
}