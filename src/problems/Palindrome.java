package problems;

public class Palindrome {
    public static void main(String[] args) {
        String palindrome = "madam";
        String reversed = "";

        for (int i = palindrome.length()-1; i>=0; i-- ) {
            reversed += palindrome.charAt(i);
        }

        if (palindrome.equals(reversed)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }
}
