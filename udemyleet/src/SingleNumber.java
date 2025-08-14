import java.util.HashSet;
import java.util.Set;

/**
 * @author Atithi Kumari
 * @date 14/08/25
 * @description Given an array of integers in which each element appears twice except 1,
 * xprint no which appears once
 * EASY, expected TIme Complexity O(N), expected space complexity O(1)
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {1,1,5,2,2,3,3,4,4};
        System.out.println(singleNumber(arr));
    }
    private static int singleNumberBruteForce(int[] arr){
        Set<Integer> output=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!output.contains(arr[i]))
                output.add(arr[i]);
            else
                output.remove(arr[i]);
        }
        return output.iterator().next();
    }

    private static int singleNumber(int[] arr){
        int output=0;
        for(int num:arr){
            output=output ^ num;
        }
        return output;
    }

}
