package RecursionDP;

// magicFast(0, 4)
// magicFast(0, 1)
//

public class MagicIndex {
    public static void main(String args[]) {
       int array[] = new int[] {1, 1, 4, 6, 8};
       System.out.println(magicFast(array, 0, array.length - 1)); 
    }

    public static int magicFast(int array[], int start, int end) {
        
        if(end < start) {
            return -1;
        }
        
        int mid = (start + end)/2;
        System.out.println("start: " + start + ",end: " + end + ",mid: " + mid);
        if(array[mid] == mid) {
            return mid;
        } else if(array[mid] < mid) {
            return magicFast(array, mid + 1, end);
        } else {
           return magicFast(array, start, mid - 1);
        } 
    }
}
