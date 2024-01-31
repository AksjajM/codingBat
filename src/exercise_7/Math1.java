package exercise_7;

import java.util.List;
import java.util.stream.Collectors;

public class Math1 {
    public static List<Integer> math1(List<Integer> nums) {
        nums = nums.stream()
                .map(x -> (x+1)*10)
                .collect(Collectors.toList());
        return nums;
    }

}
