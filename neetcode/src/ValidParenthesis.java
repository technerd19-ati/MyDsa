import java.util.Stack;

/**
 * @author Atithi Kumari
 * @date 18/07/25
 * @description Given a string of parenthesis, identify if its a valid parenthesis that means it is open
 * and closed by same type of parenthesis , STACK, EASY
 */
public class ValidParenthesis {
    public static void main(String[] args) {
        String input = "(){}[]";
        System.out.println(validParenthesis(input));
    }

    private static boolean validParenthesis(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(')
                st.push(')');
            else if (ch == '{')
                st.push('}');
            else if (ch == '[')
                st.push(']');
            else if(st.isEmpty() || st.pop()!=ch)
                return false;
        }
        return st.isEmpty();
    }

    private static boolean validParenthesisBruteForce(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='(' || input.charAt(i)=='{' || input.charAt(i)=='[')
                stack.push(input.charAt(i));
            else {
                if(!stack.isEmpty() &&
                        ((input.charAt(i)==')' && stack.peek()=='(')
                    || (input.charAt(i)=='}' && stack.peek()=='{')
                    || (input.charAt(i)==']' && stack.peek()=='[')))
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }


}
