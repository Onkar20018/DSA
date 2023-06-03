import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        ArrayList<ArrayList<Integer>> ans = subsets(arr);
        for (ArrayList<Integer> e : ans) {
            System.out.println(e);
        }
    }
    
public static ArrayList<ArrayList<Integer>> subsets(int [] arr){
         ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
         ArrayList<Integer> save = new ArrayList<>();
         int index=0;
         predict(ans, save, arr, index);
         return ans;

}
public static void predict(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> save,int [] arr,int index){
                     if(index==arr.length){
                         ans.add(new ArrayList<>(save));
                         return;
                    }
                    else{
                        // Include
                        save.add(arr[index]);
                        predict(ans, save, arr, index+1);
                        // Backtrack
                        save.remove(save.size()-1);
                       // Exclude
                        predict(ans, save, arr, index+1);
                    }
}
}