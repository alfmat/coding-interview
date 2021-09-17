package StringsArrays;

public class UniqueChars {
    public static void main(String args[]) {
        System.out.println("Checking all unique chars");

        // words to test with
        String[] words = {"hello", "world"};
        for(String word: words) {
            System.out.println(word + ": " + unique(word));
        }
    }

    public static boolean unique(String word) {
        boolean[] charset = new boolean[128];
        int length = word.length();

        // go through each char
        for(int i = 0; i < length; i++) {
            int idx = word.indexOf(word.charAt(i));
            if(!charset[idx])
                charset[idx] = true;
            else
                return false;
        }
        
        return true;
    }
}
