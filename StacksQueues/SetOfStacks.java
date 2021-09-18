package StacksQueues;

import java.util.List;
import java.util.ArrayList;


public class SetOfStacks<T> {
    
    // data stored by the class
    private List<MyStack<T>> stacks;
    private int total_size;
    private int indiv_stack;

    public SetOfStacks() {
        this.stacks = new ArrayList<MyStack<T>>();
        this.total_size = 0;
        this.indiv_stack= 2;
    }

    public void push(T data) {
        if(this.total_size % this.indiv_stack == 0) {
            MyStack<T> present = new MyStack<T>();
            present.push(data);
            this.total_size += 1;
            this.stacks.add(0, present);
        } else {
            int sub_stack = this.total_size / this.indiv_stack;
            MyStack<T> present = this.stacks.get(sub_stack);
            present.push(data);
            this.total_size += 1;
        }
    }
    
    public T pop() {
        T data = null;
        if(this.total_size == 0) {
            new Exception();
        } else {
            MyStack<T> present = this.stacks.get(0);
            data = present.pop();
            if(present.isEmpty()) {
                this.stacks.remove(0);
            }
            this.total_size -= 1;
        }
        return data;
    }

}
