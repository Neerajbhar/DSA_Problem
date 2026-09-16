class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        boolean negative = num < 0;
        long n = Math.abs((long) num);

        String ans = "";

        while (n > 0) {
            ans = (n % 7) + ans;
            n = n / 7;
        }

        if (negative) {
            ans = "-" + ans;
        }

        return ans;
    }
}