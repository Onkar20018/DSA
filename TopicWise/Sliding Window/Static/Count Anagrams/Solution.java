import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        String s = "kkkkkkkkkkkkk";
        String x = "kkkk";
        System.out.println(count(s, x));
    }

    public static int count(String s, String k) {
        int start =0, end =0, max = 0,count=0;

        HashMap<Character,Integer> map = new HashMap<>();
         // Stores the value of our Key_String in Map  
        for (int i = 0; i < k.length(); i++) { 
           map.put(k.charAt(i),map.getOrDefault(k.charAt(i),0)+1 );
          }
          count=map.size();

        while (end<s.length()) {
          if (map.containsKey(s.charAt(end))) {
               map.put(s.charAt(end), map.get(s.charAt(end))-1);
              if (map.get(s.charAt(end))==0) {
                 count--;
              }
            }
              if (end-start+1<k.length()) {
                end++;
              }else if(end-start+1==k.length()){
                  if (count==0) {
                    System.out.println("In for start="+start+" end:"+end+" count:"+count);
                    if (map.containsKey(s.charAt(start))) {  
                        map.put(s.charAt(start), 1);
                        count++;
                    }
                    max++;        
                      end++;
                      start++;
                  }else{
                    System.out.println("Inn for start="+start+" end:"+end);
                     if (map.containsKey(s.charAt(start))) {
                       if (map.get(s.charAt(start))==0) {
                         map.put(s.charAt(start), 1);
                         count++;
                      } else{
                        map.put(s.charAt(start), map.getOrDefault(k.charAt(start), 0)+1);
                      }
                        
                     }
                    end++;
                    start++;
                    
                  }
              }
          }
          
        
         return max;
    }
}

