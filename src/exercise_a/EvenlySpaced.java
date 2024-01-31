package exercise_a;

public class EvenlySpaced {
    public static boolean evenlySpaced(int a, int b, int c) {

        int[] toSort = {a, b, c};

        for (int i = 0; i < toSort.length; i++) {
            for (int j = 1; j < toSort.length; j++) {
                if (toSort[j - 1] > toSort[j]) {
                    int temp = toSort[j - 1];
                    toSort[j - 1] = toSort[j];
                    toSort[j] = temp;
                }
            }
        }

        return toSort[1] - toSort[0] == toSort[2] - toSort[1];
    }
}