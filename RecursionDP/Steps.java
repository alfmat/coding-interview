package RecursionDP;

public class Steps {
    public static void main(String args[]) {
        System.out.println(countSteps(30));
    }

    public static int countSteps(int n) {
        if(n <= 0) {
           return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return countSteps(n - 1) + countSteps(n - 2) + countSteps(n - 3);
        }
    }
}
