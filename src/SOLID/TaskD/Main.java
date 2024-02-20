package SOLID.TaskD;

public class Main {
    public static void main(String[] args) {
        LessonToGive math = new MathTeacher();
        Taechers mathTeacher = new Taechers("Aziz Alimovich", math);
        mathTeacher.giveLesson();
        System.out.println("----------------------------");
        LessonToGive information = new InformationTeacher();
        Taechers informationTeacher = new Taechers("Sanjarbek Isrojiddinvich", information);
        informationTeacher.giveLesson();
    }
}
