public class PalindromeChecker {
    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String cleanString = str.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        String reversed = new StringBuilder(cleanString).reverse().toString();
        return cleanString.equals(reversed);
    }
}
