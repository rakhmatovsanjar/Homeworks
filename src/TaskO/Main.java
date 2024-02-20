package TaskO;

public class Main {
    public static void main(String[] args) {
        Calculation guard = new Guard();
        Calculation halfRateTeachers = new HalfrateTaechers();
        Calculation fullRateTeachers = new FullRateTeachers();
        System.out.println("Qorovul: " + guard.monthlyCalculation(15) + " so'm");
        System.out.println("Yarim stavka o'qituvchilar: " + halfRateTeachers.monthlyCalculation(22) + " so'm");
        System.out.println("To'liq stavka o'qituvchilar: " + fullRateTeachers.monthlyCalculation(27) + " so'm");
    }
}
