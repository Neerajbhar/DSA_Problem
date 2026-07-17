class Solution {
    public int thirdMax(int[] nums) {
        Long first=null;
        Long second = null;
        Long third=null;

        for(int  a : nums){
            if((first != null &&  a == first) ||
           (second != null && a == second) ||
           (third != null && a == third)){
            continue ;


           }

           if(first == null || a >first){
            third = second;
            second = first;
            first=(long) a ;
           }

           else  if (second == null || a > second){
            third = second;
                second = (long) a;

           }
           else if (third == null || a > third){
            third = (long) a;

           }
        }
         return third == null ? first.intValue() : third.intValue();
        
    }
}