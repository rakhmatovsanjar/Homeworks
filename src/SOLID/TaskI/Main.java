package SOLID.TaskI;

public class Main {
    public static void main(String[] args) {
        AndroidTeachers androidTeachers=new AndroidTeachers();
        FlutterTeachers flutterTeachers=new FlutterTeachers();
        JavaFoundationTeachers javaFoundationTeachers=new JavaFoundationTeachers();
        androidTeachers.java();
        androidTeachers.kotlin();
        flutterTeachers.java();
        flutterTeachers.dart();
        javaFoundationTeachers.java();
    }
}
