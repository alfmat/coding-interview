package LinkedLists;

import java.util.Set;
import java.util.HashSet;

public class RemoveDups {
    public static void main(String args[]) {
        Node list = new Node(6);
        list.appendToTail(7);
        list.appendToTail(6);
        list.appendToTail(8);
        
        removeDups(list);
        PrintList.printer(list);
    }

    public static void removeDups(Node head) {
        Set<Integer> seen = new HashSet<Integer>();
        
        // setup two pointers
        Node parent = head;
        Node child = head.next;
        
        // add the parent's data
        seen.add(parent.data);

        while(child != null) {
            if(seen.contains(child.data)) {
                if(child.next != null) {
                    parent.next = child.next;
                } else {
                    parent.next = null;
                }
            } else {
                seen.add(child.data);
            }

            // update our pointers as the last step
            parent = parent.next;
            child = child.next;
        }
    }
}
