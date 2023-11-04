import java.util.*;

class Odd_letters {
    public static void main(String[] args) {
        String s="Program";
        System.out.println(s);
        int n = s.length();
        char[] ch = s.toCharArray();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print(ch[i]);
                }  
                else if(i==n-j-1){
                    System.out.print(ch[j]);
                }  
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}