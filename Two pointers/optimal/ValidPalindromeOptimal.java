public class ValidPalindromeOptimal {

    public boolean isPalindrome(String s) {
        // Put one pointer at the start and one at the end
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Move the left pointer forward if it is pointing to a space or punctuation
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Move the right pointer backward if it is pointing to a space or punctuation
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare the two letters by making them both lowercase
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false; // If they don't match, it is not a palindrome
            }

            // Move both pointers inward for the next check
            left++;
            right--;
        }

        // If the pointers meet in the middle without any mismatches, it is a palindrome
        return true;
    }

    public static void main(String[] args) {
        ValidPalindromeOptimal solution = new ValidPalindromeOptimal();


        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Example 1: " + solution.isPalindrome(s1));

    }
}