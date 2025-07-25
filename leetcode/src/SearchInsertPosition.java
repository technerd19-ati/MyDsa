/**
 * @author Atithi Kumari
 * @date 11/07/25
 * @description Given a sorted array of integers and a target value. return the
 * index if target is found, else return the position where it will be inserted
 * BS, EASY
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        System.out.println(searchInsertPosition(nums,4));
    }

    private static int searchInsertPosition(int[] nums, int t) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2; //low=3,high=4,mid=3
            if(t<nums[mid]){
                high=mid-1;
            }
            else if(t>nums[mid]){
                low=mid+1;
            }
            else if(t==nums[mid]){
                return mid;
            }
        }
        return low;

    }

}
