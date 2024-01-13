package src.exercise_3;

public class HaveThree {
    public static boolean haveThree(int[] nums) {

        int threeCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) threeCounter += 1;
            if (i > 0 && nums[i] == 3 && nums[i - 1] == 3) return false;
        }
        return (threeCounter == 3);
    }
}
