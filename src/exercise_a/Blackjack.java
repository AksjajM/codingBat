package exercise_a;

public class Blackjack {

    public static int blackjack(int a, int b) {
        for (int i = 21; i < 22 && i > 0; i--) {
            if (a == i) {
                return a;
            }
            if (b == i) {
                return b;
            }
        }
        return 0;
    }
}
