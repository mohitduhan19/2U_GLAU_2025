package U.Lec2_Theory;

public class Palindromic_Integer {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int left = 0 , right = str.length() - 1;
        while(left <= right){
            if(str.charAt(left++) != str.charAt(right--)) return false;
        }
        return true;
    }
}
