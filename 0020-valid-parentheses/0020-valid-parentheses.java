import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        java.util.Map<Character, Character> matchingBrackets = new java.util.HashMap<>();
        matchingBrackets.put(')', '(');
        matchingBrackets.put('}', '{');
        matchingBrackets.put(']', '[');
        
        for (char ch : s.toCharArray()) {
            if (matchingBrackets.containsValue(ch)) {
                stack.push(ch);
            } else if (matchingBrackets.containsKey(ch)) {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (top != matchingBrackets.get(ch)) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}
