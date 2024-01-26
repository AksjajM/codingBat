package exercise_5;

import java.util.List;

public class Doubling {

    public static List<Integer> doubling(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            nums.set(i, nums.get(i) * 2);
        }
        return nums;
    }
}
