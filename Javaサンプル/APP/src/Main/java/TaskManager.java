package Main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Task {
    private String name;

    Task(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class TaskManager {
    private static List<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nタスク管理アプリ");
            System.out.println("1. タスクを追加");
            System.out.println("2. タスクを表示");
            System.out.println("3. タスクを削除");
            System.out.println("4. 終了");
            System.out.print("選択肢を入力してください: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    showTasks();
                    break;
                case 3:
                    removeTask(scanner);
                    break;
                case 4:
                    System.out.println("アプリを終了します。");
                    return;
                default:
                    System.out.println("無効な選択肢です。");
            }
        }
    }

    private static void addTask(Scanner scanner) {
        System.out.print("タスク名を入力してください: ");
        String taskName = scanner.nextLine();
        Task task = new Task(taskName);
        tasks.add(task);
        System.out.println("タスクを追加しました");
    }

    private static void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("現在タスクはありません");
        } else {
            System.out.println("\n現在のタスクリスト:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void removeTask(Scanner scanner) {
        if (tasks.isEmpty()) {
            System.out.println("削除するタスクはありません。");
            return;
        }

        System.out.print("削除するタスクの番号を入力してください:");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();

        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
            Task removedTask = tasks.remove(taskNumber - 1);
            System.out.println("タスク「" + removedTask + "」を削除しました。");
        } else {
            System.out.println("無効なタスク番号です。");
        }
    }
}
