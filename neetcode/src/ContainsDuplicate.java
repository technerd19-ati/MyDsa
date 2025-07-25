import java.util.HashMap;
import java.util.Map;

/**
 * @author Atithi Kumari
 * @date 09/07/25
 * @description Given an array, check if a number appears twice
 * Arr,EASY
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,9};
        System.out.println(containsDuplicate(arr));
    }

    private static boolean containsDuplicate(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int j=0; j<arr.length;j++) {
            if (map.containsKey(arr[j]))
                return false;
            else
                map.put(arr[j],j);
        }
        return true;
    }
}
