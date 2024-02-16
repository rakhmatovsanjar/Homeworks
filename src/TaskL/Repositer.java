package TaskL;

public class Repositer {
    private final Android android;
    private final Flutter flutter;

    public Repositer(){
        android=new Android();
        flutter=new Flutter();

    }

    public void getAndroid() {
        android.getAndroid();
    }

    public void getFlutter() {
        flutter.getFlutter();
    }
}
