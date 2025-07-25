import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Atithi Kumari
 * @date 08/07/25
 * @description Target sum, Given an array and a target, to find if nos in the array
 * can sum up to target, EASY,ARR
 */

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map =new HashMap<>();
        int r =0;
        for(int i=0;i<nums.length;i++){
            r=target-nums[i];
            if(map.containsKey(r)) return new int[]{map.get(r),i};
            else
                map.put(nums[i],i);
        }
        return new int[0];
    }

    public static int[] twoSumBruteForce(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i]) && i != map.get(target-nums[i]))
                return new int[]{i,map.get(target-nums[i])};
        }
        return new int[]{0,0};
    }

}
