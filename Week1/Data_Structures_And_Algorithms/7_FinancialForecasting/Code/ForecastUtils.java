public class ForecastUtils {

    public static double futureValueRecursive(double principal, double[] rates, int n) {
        if (n == 0) {
            return principal;
        }
        double prev = futureValueRecursive(principal, rates, n - 1);
        return prev * (1 + rates[n - 1]);
    }

    public static double futureValueMemo(double principal, double[] rates, int n, Double[] memo) {
        if (n == 0) {
            return principal;
        }
        if (memo[n] != null) {
            return memo[n];
        }
        double prev = futureValueMemo(principal, rates, n - 1, memo);
        memo[n] = prev * (1 + rates[n - 1]);
        return memo[n];
    }
}
