package progect10;

public class StudentData extends Student{

    public StudentData(int id, String fieldOfStudy, String name, String group){
        super(id, fieldOfStudy, name, group);
    }
    @Override
    public void StudentInfo(){
        System.out.printf("%-5s %-20s %-20s %-5s%n", "ID", "Field of Study", "Name", "Group");
//        System.out.printf("%-5d %-20s %-20s %-5s%n", getId(), getFieldOfStudy(), getName(), getGroup());
    }
}
