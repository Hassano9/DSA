public class ValidPalindromeBruteForce {

    public boolean isPalindrome(String s) {
        // 1. Create a new place to store our cleaned-up letters
        StringBuilder cleaned = new StringBuilder();

        // 2. Go through the original phrase letter by letter
        for (char c : s.toCharArray()) {

            // If it is a letter or a number, make it lowercase and save it
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // 3. Save our cleaned string so it reads forward
        String forward = cleaned.toString();

        // 4. Reverse the cleaned string so it reads backward
        String backward = cleaned.reverse().toString();

        // 5. If it reads the exact same both ways, it is a palindrome!
        return forward.equals(backward);
    }

    public static void main(String[] args) {
        ValidPalindromeBruteForce solution = new ValidPalindromeBruteForce();

        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Example 1: " + solution.isPalindrome(s1));

    }
}