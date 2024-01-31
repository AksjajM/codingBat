package exercise_9;

public class RepeatSeperator {
    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(word);
            if (i != count - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }
}
