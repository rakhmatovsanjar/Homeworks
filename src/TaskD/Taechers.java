package TaskD;

public class Taechers {
    private final String teacherName;
    private final LessonToGive lessonToGive;

    public Taechers(String teacherName, LessonToGive lessonToGive) {
        this.teacherName = teacherName;
        this.lessonToGive = lessonToGive;
    }

    public void giveLesson() {
        System.out.print(teacherName + " ");
        lessonToGive.toGive(" fanidan dars beradi");
    }
}
