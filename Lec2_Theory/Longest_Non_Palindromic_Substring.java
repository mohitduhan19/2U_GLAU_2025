package U.Lec2_Theory;

public class Longest_Non_Palindromic_Substring {
    public boolean isPalindrome(String str){
        int n = str.length();
        for (int i = 0; i < n/2; i++)
            if (str.charAt(i) != str.charAt(n-i-1))
                return false;

        return true;
    }

    public int max_Length_Non_Palin_Substring(String str){
        int n = str.length();
        char ch = str.charAt(0);

        int i = 1;
        for (i = 1; i < n; i++)
            if(str.charAt(i) != ch){
                break;
            }

        // All characters are same, we can't
        // make a non-palindromic string.
        if (i == n)
            return 0;

        // If string is palindrome, we can make
        // it non-palindrome by removing any
        // corner character
        if (isPalindrome(str))
            return n-1;

        // Complete string is not a palindrome.
        return n;
    }
}