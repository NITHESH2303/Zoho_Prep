import java.util.*;

class tmp {
    public static void main(String[] args) {
        String s="WELCOMETOZOHOCORPORATION";
        char[][] ch = new char[5][5];
        int k=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(k<s.length())
                    ch[i][j]=s.charAt(k++);
            }
        }
        System.out.println(Arrays.deepToString(ch));

        List<Integer[]> target = new ArrayList<>();
        int[][] vis = new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(ch[i][j]=='T'){
                    Integer[] num = {i,j,0,0,0,0};
                    dfs(ch,num,i,j,5,5,0,vis);
                    target.add(num); 
                }
            }
        }
        for(Integer[] i: target){
            if (i[2] == 1) {
                System.out.println("Start index: <" + i[0] + "," + i[1] + ">");
                System.out.println("End index: <" + (i[4]) + "," + i[5] + ">");
            }
        }
    }

    private static  void dfs(char[][] ch, Integer[] num,int i, int j, int row, int col,int count, int[][] vis){
        if(count==2) {
            num[2]=1;
            num[4]=i;
            num[5]=j;
            return;
        }
        vis[i][j]=1;
        int[] delrow = {1,0,-1,0};
        int[] delcol = {0,1,0,-1};
        for(int k=0;k<4;k++){
            int nrow = i + delrow[k];
            int ncol = j + delcol[k]; 
            if(nrow<row && ncol<col && nrow>=0 && ncol>=0 && count<3 && ch[nrow][ncol]=='O'&& vis[nrow][ncol]==0){
                dfs(ch,num,nrow,ncol,row,col,count+1,vis);
            }
        }
    }
}