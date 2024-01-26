import exercise_6.CountHi;

public class Main {
    public static void main(String[] args) {
//        countHi("abc hi ho") → 1
//        countHi("ABChi hi") → 2
//        countHi("hihi") → 2

        System.out.println(CountHi.countHi("abc hi ho"));
        System.out.println(CountHi.countHi("ABChi hi"));
        System.out.println(CountHi.countHi("hihi"));

        String test = "Hallo dit is een test";
        String[] testen = test.split("");

        for (String i:testen){
            System.out.println(i);
        }


    }
}
