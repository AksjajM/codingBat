package noTeenSum;

public class NoTeenSum {
    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public static int fixTeen(int n) {
        if (n >= 13 && n <= 14 || n >= 17 && n <= 19) {
            return 0;
        } else {
            return n;
        }
    }
}
