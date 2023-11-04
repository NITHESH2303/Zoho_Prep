import java.util.*;

class weights {
    public static void main(String[] args) {
        int arr[] = {10,36,54,89,12};
        List<Integer[]> ls = new ArrayList<>();
        for(int i: arr){
            int sum=0;
            if(perfect_square(i)) sum+=5;
            if(multiple(i)) sum+=4;
            if(even(i)) sum+=3;
            Integer[] ans = {i,sum};
            ls.add(ans);
        }
        ls.sort(Comparator.comparingInt(a -> a[1]));
        System.out.println(Arrays.deepToString(ls.toArray()));
    }

    private static Boolean perfect_square(int n){
        if(Math.floor((double)Math.sqrt(n)) == Math.ceil((double)Math.sqrt(n))) return true;
        return false;
    }
    private static Boolean multiple(int n){
        if(n%4==0 && n%6==0) return true;
        return false;
    }
    private static Boolean even(int n){
        return n%2==0;
    }
}
