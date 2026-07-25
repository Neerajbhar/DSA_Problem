import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger sum = new BigInteger(num1).multiply(new BigInteger(num2));;

       return String.valueOf(sum);
        
        
    }
}