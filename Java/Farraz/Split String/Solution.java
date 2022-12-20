import java.util.* ;
import java.io.*; 
public class Solution {
    public static void main(String[] args) {
        String s= "codingninjasax";
        System.out.println(splitString(s));
    }
    public static Boolean splitString(String str) {
        
        int index=str.length()/2;
        str=str.toLowerCase();
        String  one = str.substring(0,index);
        String  two = str.substring(index);
        int forone=0;
        int fortwo=0;
        for(int i=0;i<index;i++){
            if(one.charAt(i)=='a'){
                forone++;
            }else if(one.charAt(i)=='e'){
                forone++;
            }else if(one.charAt(i)=='i'){
                forone++;
            }else if(one.charAt(i)=='o'){
                forone++;
            }else if(one.charAt(i)=='u'){
                forone++;
            }
            if(two.charAt(i)=='a' ){
                fortwo++;
            }else if(two.charAt(i)=='e'){
                fortwo++;
            }else if(two.charAt(i)=='i'){
                fortwo++;
            }else if(two.charAt(i)=='o'){
                fortwo++;
            }else if(two.charAt(i)=='u'){
                fortwo++;
            }
        }
        if(forone==fortwo){
            return true;
        }else{
            return false;
        }
    }

}