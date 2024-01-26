package exercise_6;

public class CountHi {
    public static int countHi(String str) {
        String[] splitSentence = str.split("");
        int hiCount = 0;

        for (int i = 0; i < splitSentence.length; i++) {
            if (splitSentence.length>1 && splitSentence[i].equals("h") && splitSentence[i + 1].equals("i")) {
                hiCount++;
            }
        }
        return hiCount;
    }
}