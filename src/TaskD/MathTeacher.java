package TaskD;

public class MathTeacher implements LessonToGive{
    @Override
    public void toGive(String message) {
        System.out.println("matematika"+message);
    }
}
