//class RewardValue{
//    private double cashValue;
//    private double milesValue;
//
//    // Constructor accepting cash value
//    public RewardValue(double cashValue) {
//        this.cashValue = cashValue;
//        this.milesValue = cashValue / 0.0035;
//    }
//
//    // Constructor accepting miles value
//    public RewardValue(double milesValue, boolean isMiles) {
//        this.milesValue = milesValue;
//        this.cashValue = milesValue * 0.0035;
//    }
//
//    // Returns the cash value of the RewardValue
//    public double getCashValue() {
//        return cashValue;
//    }
//
//    // Returns how many miles the RewardValue is worth
//    public double getMilesValue() {
//        return milesValue;
//    }
//}

public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}