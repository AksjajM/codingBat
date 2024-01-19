package src.exercise_2;

public class EndOther {
    public static boolean endOther(String a, String b) {

        //My solution
        if (a.toLowerCase().endsWith(b.toLowerCase())) return true;
        if (b.toLowerCase().endsWith(a.toLowerCase())) return true;
        return false;

//        //Recommended by Intellij
//        if (a.toLowerCase().endsWith(b.toLowerCase())) return true;
//        return b.toLowerCase().endsWith(a.toLowerCase());

    }
}
