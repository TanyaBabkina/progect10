package progect10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Group{


    public static List<Student> createGroup(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введит количество студентов: ");
        String n_str = sc.nextLine();
        int n = Integer.parseInt(n_str);
        List<Student> groupData = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.print("Введите ID студента: ");
            String id_str = sc.nextLine();
            int id = Integer.parseInt(id_str);
            System.out.print("Введите специальность студента: ");
            String fieldOfStudy = sc.nextLine();
            System.out.print("Введите ФИО студента: ");
            String name = sc.nextLine();
            System.out.print("Введите группу студента: ");
            String group = sc.nextLine();

            Student s = new StudentData2(id, fieldOfStudy, name, group);
            DHandler.saveString(s);
            groupData.add(s);
        }
        return groupData;
    }


    public static void GroupInfo(List<Student> list){
        System.out.println("------------------------------------------------------------");
        System.out.printf("|%-5s |%-20s |%-20s |%-6s|%n", "ID", "Field of Study", "Name", "Group");
        System.out.println("------------------------------------------------------------");

        for(Student st: list){
            st.StudentInfo();
        }
    }


    public static void StudentByID(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите индекс студента: ");
        int id = sc.nextInt();
        DHandler.getStrFromBD(id);
    }

    public static void DeleteStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите индекс студента: ");
        int id = sc.nextInt();
        DHandler.DeleteStudentByID(id);
    }
}
