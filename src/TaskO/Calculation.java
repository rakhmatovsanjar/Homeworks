package TaskO;

public class Calculation implements MonthlyCalculation {

    private final int baseAmount = 330000;

    @Override
    public int monthlyCalculation(int degree) {
        return baseAmount * degree;
    }
}
