package set4;

public class subtract {
    public static void main(String[] args) {
        int n1= 4, n2=3;
        char[] num1={'9','9','9','0'}, num2={'1','1','1'};
        int borrow = 0;
        int i = n1 - 1, j = n2 - 1;
        StringBuilder diff = new StringBuilder(Math.max(n1, n2));
    
        while(i >= 0 || j >= 0){
            int temp = borrow;
            if (i >= 0) temp += Character.getNumericValue(num1[i--]);
            if (j >= 0) temp -= Character.getNumericValue(num2[j--]);
            if (temp < 0) {
                borrow = -1;
                temp += 10;
            } else {
                borrow = 0;
            }
            diff.append(temp);
        }
    
        System.out.println(diff.reverse().toString());
    }    
}
