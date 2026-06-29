import java.util.Arrays;

public class ReverseStringOptimal {

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        // Keep swapping the outer letters, moving inward until we hit the middle
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseStringOptimal solution = new ReverseStringOptimal();

        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s1);
        System.out.println("Example 1: " + Arrays.toString(s1));
}
}