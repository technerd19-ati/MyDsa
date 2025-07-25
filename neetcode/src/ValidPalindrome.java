/**
 * @author Atithi Kumari
 * @date 09/07/25
 * @description Valid palindrome problem, Given a string if it reads same from both
 * directions - EASY, SW
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(input));
    }

    private static boolean isPalindrome(String input) {
        int start = 0, end = input.length() - 1;
        while (start <= end) {
            char charStart =input.charAt(start);
            char charEnd = input.charAt(end);
            if (!Character.isLetterOrDigit(charStart))
                start++;
            else if (!Character.isLetterOrDigit(charEnd))
                end--;
            else {
                if (Character.toLowerCase(charStart)
                        != Character.toLowerCase(charEnd))
                    return false;
                start++;
                end--;
            }
        }

        return true;
    }

    public static boolean isPalindromeBruteForce(String s) {
        String input = s.replaceAll("[^a-zA-Z]","").toLowerCase();
        String[] arr = input.split("");
        int i=0, j=arr.length-1;
        while(i<arr.length/2){
            if(!arr[i].equals(arr[j]))
                return false;
            i++;
            j--;
        }
        return true;

    }
}
