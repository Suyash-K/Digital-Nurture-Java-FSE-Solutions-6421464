import java.util.Arrays;

public class ForecastDemo {
    public static void main(String[] args) {
        double principal = 1000.0;
        double[] rates = {0.05, 0.04, 0.06, 0.03, 0.05};
        int periods = rates.length;

        double fvRec = ForecastUtils.futureValueRecursive(principal, rates, periods);
        System.out.printf("Recursive Future Value: %.2f%n", fvRec);

        Double[] memo = new Double[periods + 1];
        double fvMemo = ForecastUtils.futureValueMemo(principal, rates, periods, memo);
        System.out.printf("Memoized Future Value: %.2f%n", fvMemo);

        System.out.println("Memo array contents: " + Arrays.toString(memo));
    }
}
