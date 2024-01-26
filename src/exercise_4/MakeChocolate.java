package exercise_4;

public class MakeChocolate {
    //        makeChocolate(4, 1, 9) → 4
    //        makeChocolate(4, 1, 10) → -1
    //        makeChocolate(4, 1, 7) → 2
    //        makeChocolate(6, 2, 7) → 2
    public static int makeChocolate(int small, int big, int goal) {
        int maximumBigBars = goal / 5;

        if (maximumBigBars > big) {
            goal -= big * 5;
        } else {
            goal -= maximumBigBars * 5;
        }
        if (goal <= small) {
            return goal;
        } else {
            return -1;
        }
    }
}
