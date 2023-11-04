package set3;

class substring {
    public static void main(String[] args) {
        String s1 = "test123String";
        String s2 = "123";
        int n= s2.length();
        System.out.println(check_substring(s1,s2,n,0));
    }
    private static int check_substring(String s1, String s2, int n, int i){
        if(s1.length()<n) return -1;
        if(s1.substring(0,n).equals(s2)) return i;
        i++;
        return check_substring(s1.substring(1),s2,n,i);
    }
}
