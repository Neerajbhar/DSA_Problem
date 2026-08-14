class Solution {
    public int maximumLengthSubstring(String s) {
        int [] repeat=new int [30];
        int left=0;
        int maxlen=0;

        for(int right=0;right<s.length();right++){
            repeat[s.charAt(right)-'a']++;

            while(repeat[s.charAt(right)-'a']>2){
                repeat[s.charAt(left)-'a']--;
                left ++;
            }
            maxlen=Math.max(maxlen,right -left +1);
        }
        return maxlen;
        
    }
}