/**
 * @author Atithi Kumari
 * @date 11/07/25
 * @description Given a sorted array in asc order, find an element target, return
 * -1 if it doesn't exist, EASY, BS
 */public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(binarySearch(arr,9));
    }

    private static int binarySearch(int[] arr, int target) {
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid =low+(high-low)/2;
            if(target<arr[mid]){
                high=mid-1;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
}
