class Solution {
    public boolean isPalindrome(int x) {
        if(x< 0 ||( x % 10 == 0 && x != 0)){
            return false;
        }
        int rem=0;
        int org=x;

        while(x!=0){
            int digit = x%10;
            rem=rem * 10 +digit;
            x=x/10;

        }
        return org==rem;


    }
}