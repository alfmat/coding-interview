package RecursionDP;

import java.util.Arrays;

public class StepsMemo {
    public static void main(String args[]) {
        int step_count = 30;
        int[] step_memo = new int[step_count + 1];
        Arrays.fill(step_memo, -1);
        System.out.println(countSteps(step_count, step_memo));
    }

    public static int countSteps(int n, int[] step_memo) {
        if(n <= 0) {
            return 0;
        } else if(step_memo[n] != -1) {
           return step_memo[n];
        } else if(n == 1) {
            return 1;
        } else {
            return countSteps(n - 1, step_memo) + countSteps(n - 2, step_memo) + countSteps(n - 3, step_memo);
        }
    }
}
