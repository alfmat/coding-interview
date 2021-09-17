package LinkedLists;

public class PrintList {
    public static void printer(Node list) {
        while(list != null) {
           System.out.print(list.data + " -> ");
           list = list.next;
        }
        System.out.println("null"); 
    }
}
