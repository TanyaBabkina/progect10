package progect10;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println("""
                    1. Вывести все таблицы из базы данных MySQL.
                    2. Создать таблицу в базе данных MySQL.
                    3. Ввести данные о всех студентах и сохранить их в MySQL с последующим табличным
                    (форматированным) выводом в консоль.
                    4. Вывести данные о студенте по ID из MySQL.
                    5. Удалить данные о студенте из MySQL по ID.
                    6. Сохранить итоговые результаты из MySQL в Excel и вывести их в консоль.
                    0. Выход из программы.""");

            String s = scanner.nextLine();
//            if (s.equals("")){
//                System.out.println("Ошибка ввода!");
//                break;
//            }

            try{
                choice = Integer.parseInt(s);
                handleUserChoice(choice, scanner, DHandler.getTableName());}
            catch(Exception e){
                System.out.println("Error: неправильный ввод");
            }
        } while (choice != 0);
    }

    private static void handleUserChoice (int choice, Scanner scanner, String tableName) {
        String a, b;
        switch (choice) {
            case 1:
                DHandler.showAllTables();
                break;
            case 2:
                System.out.println("Введите название для создания таблицы:");
                DHandler.setTableName(scanner.nextLine());
                DHandler.createTable();
                break;
            case 3:
                List<Student> group = Group.createGroup();
                Group.GroupInfo(group);
                break;
            case 4:
                Group.StudentByID();
                break;
            case 5:
                Group.DeleteStudent();
                break;
            case 6:
                ExcelExporter exporter = new ExcelExporter();
                exporter.export();
                break;
            case 0:
                System.out.println("Выход из программы...");
                break;
            default:
                System.out.println("Неверный выбор. Попробуйте снова.");
        }
    }
}


