import java.util.ArrayList;
import java.util.List;

/**
 * @author Atithi Kumari
 * @date 11/08/25
 * @description if the current number is divisible by 3 :Fizz, 5:Buzz, both 3 & 5:fizzbuzz
 * EASY
 */
public class Fizzbuzz {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(printWord(n));
    }

    private static List<String> printWord(int n){
        List<String> out = new ArrayList<>();
        for (int i = 1; i <n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    out.add("fizzbuzz");
                }
               else if (i % 5 == 0) {
                    out.add("buzz");
                }
               else if (i % 3 == 0) {
                    out.add("fizz");
                }
            else{
                out.add(String.valueOf(i));
            }
        }
        return out;
    }
}
