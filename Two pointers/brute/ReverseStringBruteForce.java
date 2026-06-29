public class ReverseStringBruteForce {

    public char[] reverseString(char[] s) {
        // 1. Create a new array of the same size
        char[] reversedArray = new char[s.length];

        int newIndex = 0;

        // 2. Loop through the original array starting from the very end
        for (int i = s.length - 1; i >= 0; i--) {
            // 3. Copy the letters one by one into the new array
            reversedArray[newIndex] = s[i];
            newIndex++;
        }

        // 4. Return the new array
        return reversedArray;
    }

public static void main(String[] args) {
    ReverseString solution = new ReverseString();

    char[] s1 = {'h', 'e', 'l', 'l', 'o'};
    solution.reverseString(s1);
    System.out.println("Example 1: " + Arrays.toString(s1));

}
}