public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "racecar"; // Example string

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove any non-alphanumeric characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Initialize left and right pointers
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If mismatch, it's not a palindrome
            }
            left++;
            right--;
        }
        return true; // If all characters match
    }
}
