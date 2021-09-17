package LinkedLists;

public class KToLast {
    public static void main(String args[]) {
        Node list = new Node(4);
        list.appendToTail(7);
        list.appendToTail(9);
        list.appendToTail(3);

        // print list to user as starting point
        PrintList.printer(list);

        int pos = 2;
        int result = KLast(list, pos);
        System.out.println("The " + pos + " last element was found to be " + result);
    }
    
    public static int KLast(Node list, int k) {
        Node p1 = list;
        Node p2 = p1;

        for(int i = 0; i < k; i++) {
            if(p2.next == null) {
                return -1;
            }
            p2 = p2.next;
        }

        while(p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1.data;
    }
}
