package set2;

import java.util.*;

public class Mathematical_Expression {
    public static void main(String[] args) {
        
    }
    private Boolean Valid(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(sb.charAt(i)=='(') st.push(i);
            if(!st.isEmpty() && sb.charAt(i)==')' && sb.charAt(st.peek())=='(') st.pop();
            else if(sb.charAt(i)==')') st.push(i);
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}
