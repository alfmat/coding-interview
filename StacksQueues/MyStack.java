package StacksQueues;

import java.util.NoSuchElementException;
import java.util.EmptyStackException;

public class MyStack<T> {
    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        private StackNode(T data) {
            this.data=data;
        }
    }

    // property of MyStack
    private StackNode<T> top;

    public T pop() {
        if(top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item) {
        StackNode<T> t = new StackNode<T>(item);
        t.next = top;
        top = t;
    }

    public T peek() {
        if(top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
