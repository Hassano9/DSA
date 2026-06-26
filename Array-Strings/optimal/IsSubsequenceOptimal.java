public class IsSubsequenceOptimal {

    public boolean isSubsequence(String s, String t) {
        int i = 0; // Pointer for string s
        int j = 0; // Pointer for string t

        // Keep checking as long as neither pointer has reached the end
        while (i < s.length() && j < t.length()) {

            // If the letters match, move the pointer for 's' forward
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            // We ALWAYS move the pointer for 't' forward to check the next letter
            j++;
        }

        // If we found all letters of 's', pointer 'i' will have reached the very end of 's'
        return i == s.length();
    }
    public static void main(String[] args) {
        IsSubsequenceOptimal is=new IsSubsequenceOptimal();
        System.out.println(is.isSubsequence("aec","abcde"));
    }
}
