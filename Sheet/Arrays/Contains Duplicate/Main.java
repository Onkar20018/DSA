import java.util.*;
class Main {
     public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        System.out.println(containsDuplicate(nums));
     }
    public static boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
        for(int i=nums.length-1;i>=0;i--){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
    }
    return false;
}
}