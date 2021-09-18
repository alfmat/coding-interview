package StacksQueues;


public class TestMinElement {
    public static void main(String args[]) {
        MyStackMinElement stack = new MyStackMinElement();
        stack.push(5);
        stack.push(18);
        stack.push(2);

        System.out.println(stack.minElement());
    }
}
