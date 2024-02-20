package TaskD;

public class InformationTeacher implements LessonToGive{
    @Override
    public void toGive(String message) {
        System.out.println("informatika"+message);
    }
}
