package set4;
import java.util.*;
public class groups {
    public static void main(String[] args) {
        int[] num = {3,9,7,4,6,8};
        int x=3;    
        Set<List<Integer>> ans = new LinkedHashSet<>();
        List<Integer> gp = new ArrayList<>();
        findGroups(num,x,0,0,ans,gp);
        for (List<Integer> group : ans) {
            System.out.print("[");
            for (int i = 0; i < group.size(); i++) {
                System.out.print(group.get(i));
                if (i < group.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }
        System.out.println("No of groups: " + ans.size());
    }
    private static void findGroups(int[] num,int x, int index, int sum, Set<List<Integer>> ans, List<Integer> gp){
        if(sum%x==0 && gp.size()>1 && gp.size()<=x){
            ans.add(new ArrayList<>(gp));
        }
        if(index==num.length || gp.size()>x) return;
        gp.add(num[index]);
        findGroups(num,x,index+1,sum+num[index],ans,gp);
        gp.remove(gp.size()-1);
        findGroups(num,x,index+1,sum,ans,gp);
    }
}
