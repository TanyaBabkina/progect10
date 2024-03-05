package progect10;

import java.util.Scanner;

public class Student {
    private int id = 0;
    private String fieldOfStudy = null;
    private String name = null;
    private String group = null;

    public Student(int id, String fieldOfStudy, String name, String group){
        this.id = id;
        this.fieldOfStudy = fieldOfStudy;
        this.name = name;
        this.group = group;
    }

    public void StudentInfo(){
        System.out.println("Data about students");
    }

    public int getId(){ return id;}
    public String getName() {return name;}
    public String getGroup() {return group;}
    public String getFieldOfStudy() {return fieldOfStudy;}




}
