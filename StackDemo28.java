import java.util.Scanner;
public class StackDemo28 {
    public static void main(String[] args) {
        Stack28 stack = new Stack28(10);
        stack.push(8);
        stack.push(12);
        stack.push(18);
        stack.print();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.push(-5);
        stack.print();
    }
}
