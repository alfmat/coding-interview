/*
 * If a string is a permutation of the other then:
 * 1. both strings contain exactly the same characters
 * 2. the length of both strings is the same
 */
package StringsArrays;

import java.util.Arrays;

public class Permutations {
    public static void main(String args[]) {
        System.out.println(permuteStd("abcd", "cbae"));
        System.out.println(permuteOpt("tom is fine", "mot si nife"));
    } 

    public static String sort(String s) {
        char[] s_chars = s.toCharArray();
        Arrays.sort(s_chars);
        return new String(s_chars);
    }

    public static boolean permuteStd(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        return sort(s).equals(sort(t));
    }

    public static boolean permuteOpt(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        // create ASCII array for first string
        int[] s_contents = new int[128];

        char[] s_chars = s.toCharArray();
        
        for(int i = 0; i < s_chars.length; i++) {
            s_contents[s_chars[i]] += 1;
        }

        for(int j = 0; j < t.length(); j++) {
            if(s_contents[t.charAt(j)] < 0) {
                return false;
            } else {
                s_contents[t.charAt(j)] -= 1;
            }
        }

        return true;
    }
}

