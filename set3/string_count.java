package set3;

import java.util.*;

class string_count{
    public static void main(String[] args) {
        String str = "b3c6d15a1";
        List<String> s = new ArrayList<>();
        StringBuilder tmp = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                tmp.append(c);
            } else {
                if (tmp.length() > 0) {
                    ans.append(pattern(s.get(s.size()-1),tmp));
                    s.add(tmp.toString());
                    tmp.setLength(0);
                }
                s.add(String.valueOf(c));
            }
        }
        if (tmp.length() > 0) {
            s.add(tmp.toString());
            ans.append(pattern(s.get(s.size()-2),tmp));
        }
        System.out.println(s+" "+ans);
    }
    private static StringBuilder pattern(String st, StringBuilder c){
        StringBuilder t = new StringBuilder();
        for(int i=0;i<Integer.parseInt(c.toString());i++){
            t.append(st);
        }
        return t;
    }
}