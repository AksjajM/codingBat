package exercise_8;

import java.util.List;
import java.util.stream.Collectors;

public class NoLong {
    public static List<String> noLong(List<String> strings) {
        strings = strings.stream()
                .filter(x -> x.length() < 4)
                .collect(Collectors.toList());
        return strings;
    }

}
