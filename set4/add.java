package set4;

class add {
    public static void main(String[] args) {
        int n1= 4, n2=3;
        char[] num1={'0','0','9','0'}, num2={'1','1','1'};
        int carry=0;
        int i=n1-1, j=n2-1;
        StringBuilder sum=new StringBuilder(Math.max(n1, n2));
        while(i>=0 || j>=0){
            int temp = carry;
            if (i >= 0) temp += Character.getNumericValue(num1[i--]);
            if (j >= 0) temp += Character.getNumericValue(num2[j--]);
            carry = temp / 10;
            sum.append(temp % 10);
        }
        if(carry != 0) sum.append(carry);
        System.out.println(sum.reverse().toString());
    }
}
