package set4;

import java.io.*;
import java.util.*;

class pattern {

    static String countnndSay(int n){
        String s = "1";
        for (int i = 1; i < n; i++) {
            String str = "";
            System.out.println(s);
            HashMap<Character, Integer>map = new HashMap<>();

            for (int j = 0; j <= s.length(); j++) {
                if (j == s.length() || map.containsKey(s.charAt(j)) == false && j > 0) {
                    str += String.valueOf(map.get(s.charAt(j-1))) + s.charAt(j-1);
                    map.clear();
                }  

                if(j == s.length()){
                    map.put(null, 1);
                }
                else{
                    map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                }   
            } s=str;
        }

        return s;
    }

    public static void main(String args[]){
        int N = 5;
        System.out.println(countnndSay(N));
    }
}
/* 
import java.io.*;
import java.util.*;

class GFG {

    static String countnndSay(int n){
        String s = "1";
        for (int i = 1; i < n; i++) {
            String str = "";
            System.out.println(s);
            HashMap<Character, Integer>map = new HashMap<>();

            for (int j = 0; j < s.length(); j++) {
                if (map.containsKey(s.charAt(j)) == false && j > 0) {
                    str += String.valueOf(map.get(s.charAt(j-1))) + s.charAt(j-1);
                    map.clear();
                }  
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            } 
            str += String.valueOf(map.get(s.charAt(s.length()-1))) + s.charAt(s.length()-1);
            s=str;
        }

        return s;
    }

    public static void main(String args[]){
        int N = 5;
        System.out.println(countnndSay(N));
    }
}
*/
