package set4;

import java.util.*;

class Pair implements Comparable<Pair>{
    int a;
    int b;
    public Pair(int a, int b){
        this.a=a;
        this.b=b;
    }
    public int compareTo(Pair p){
        return Integer.compare(this.a,p.a);
    }
}

class petrolpublic  {
    public static void main(String[] args) {
        int petrol = 22;
        int[] dist = {11,15,3};
        int[] capacity = {6,4,2};
        List<Pair> dc=new ArrayList<>();
        for(int i=0;i<dist.length;i++){
            dc.add(new Pair(dist[i],capacity[i]));
        }
        Collections.sort(dc);
        for (Pair pair : dc) {
            System.out.println("Pair: (" + pair.a + ", " + pair.b + ")");
        }
        for(int i=0;i<dist.length;i++){
            Pair p = dc.get(i);
            if(petrol>p.a){
                petrol-=p.a;
                petrol+=p.b;
            }
            else{
                petrol=0;
                break;
            }
        }
        System.out.println(petrol > 0 ? "Remaining Petrol: " + petrol : "Out Of Petrol");

    }
}
