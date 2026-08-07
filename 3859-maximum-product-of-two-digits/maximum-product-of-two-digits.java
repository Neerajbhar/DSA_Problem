class Solution {
    public int maxProduct(int n) {
        int largest=0;
        int seclargest=0;
        while(n>0){
            int rem=n%10;
            if(rem > largest){
                seclargest=largest;
                largest=rem;
            }
            else if (rem > seclargest){
                seclargest=rem;
            }
            n/=10;
        }
        return largest *  seclargest;
        
    }
}