package StacksQueues;

import java.util.NoSuchElementException;
import java.util.EmptyStackException;

public class MyStackMinElement {
    private static class StackNode {
        private int data;
        private StackNode next;

        private StackNode(int data) {
            this.data=data;
        }
    }

    // property of MyStackMinElement
    private StackNode top;

    public int pop() {
        if(top == null) throw new EmptyStackException();
        int item = top.data;
        top = top.next;
        return item;
    }

    public void push(int item) {
        StackNode t = new StackNode(item);
        t.next = top;
        top = t;
    }

    public int peek() {
        if(top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int minElement() {
        int min_val = top.data;
        StackNode head = top.next;

        while(head != null) {
            if (head.data < min_val) {
                min_val = head.data;
            }
            head = head.next;
        }
        return min_val;
    }
}
