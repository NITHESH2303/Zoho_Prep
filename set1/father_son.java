import java.util.*;

public class father_son {
    public static void main(String[] args) {
        // 1st string -> child, 2nd string -> father
        // 1st string -> child, 2nd string -> father
        String[][] str = {{"luke","shaw"},
                        {"wayne","rooney"},
                        {"rooney","ronoldo"},
                        {"shaw","rooney"}
                    };
        HashMap<String,List<String>> map = new HashMap<>();
        for(String[] s: str){
            List<String> ls = map.getOrDefault(s[1], new ArrayList<>());
            ls.add(s[0]);
            map.put(s[1], ls);
        }
        String father = "ronoldo";
        int gc = 0;
        
        List<String> child = map.get(father);
        
        for(Map.Entry<String,List<String>> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        List<List<String>> ans = new ArrayList<>();
        int total=0;
        for(String s: child){
            ans.add(map.get(s));
            total+=map.get(s).size();
        }
        System.out.print("GrandChilder:");
        System.out.println(ans.toString()+" count:"+total);
    }

}
