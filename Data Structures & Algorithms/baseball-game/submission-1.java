class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int total = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int a = stack.pop();
                int b = stack.peek();

                int c = a + b;

                stack.push(a);
                stack.push(c);
            } else if (operations[i].equals("D")) {
                int a = stack.peek();
                int b = 2 * a;

                stack.push(b);
            } else if (operations[i].equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(operations[i]));
            }
        }

        while (!stack.isEmpty()) {
            total += stack.pop();
        }

        return total;
    }
}