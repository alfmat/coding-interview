package StacksQueues;

public class TestSetOfStacks {
    public static void main(String args[]) {
        SetOfStacks<Integer> stack = new SetOfStacks<Integer>();
        stack.push(4);
        stack.push(5);
        stack.push(8);
        stack.pop();
        stack.push(9);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
