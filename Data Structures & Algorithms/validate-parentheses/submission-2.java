class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);

            if (a == '(' || a == '{' || a == '[') {
                stack.push(a);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                if (stack.peek() == '(' && a == ')') {
                    stack.pop();
                } else if (stack.peek() == '{' && a == '}') {
                    stack.pop();
                } else if (stack.peek() == '[' && a == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }
}
