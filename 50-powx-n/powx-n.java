class Solution {
    public double myPow(double x, int n) {
        double result=0;
        if(x  == 0){
            return 0;
        }
        if (n == 0){
            return 1;

        }
        else{
                 result=(double) Math.pow(x , n);
        }
        return result;
        
    }
}