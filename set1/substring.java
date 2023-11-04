import java.util.*;

class Substring {
    public static void main(String[] args) {
        // String s = "WELCOMETOZOHOCORPORATION";
        // char[][] ch = new char[5][5];
        // int k = 0;
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         if (k < s.length())
        //             ch[i][j] = s.charAt(k++);
        //     }
        // }
        char[][] ch = {
            {'W', 'E', 'L', 'C', 'O'},
            {'M', 'E', 'T', 'O', 'Z'},
            {'O', 'H', 'O', 'C', 'O'},
            {'R', 'P', 'O', 'R', 'A'},
            {'T', 'I', 'O', 'N', ' '}
        };

        List<Integer[]> target = new ArrayList<>();
        int[][] vis = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (ch[i][j] == 'T') {
                    Integer[] num = {i, j, 0, 0, 0, 0};
                    dfs(ch, num, i, j, 5, 5, 0, vis);
                    target.add(num);
                }
            }
        }

        for (Integer[] i : target) {
            if (i[2] == 1) {
                System.out.println("Start index: <" + i[0] + "," + i[1] + ">");
                System.out.println("End index: <" + (i[4]) + "," + i[5] + ">");
            }
        }
    }

    private static void dfs(char[][] ch, Integer[] num, int i, int j, int row, int col, int count, int[][] vis) {
        if (count == 2) {
            num[2] = 1;
            num[4] = i;
            num[5] = j;
            return;
        }

        vis[i][j] = 1;

        int[] delrow = {1, 0, -1, 0};
        int[] delcol = {0, 1, 0, -1};

        for (int k = 0; k < 4; k++) {
            int nrow = i + delrow[k];
            int ncol = j + delcol[k];
            if (nrow < row && ncol < col && nrow >= 0 && ncol >= 0 && ch[nrow][ncol] == 'O' && vis[nrow][ncol] == 0) {
                dfs(ch, num, nrow, ncol, row, col, count + 1, vis);
            }
        }
    }
}
// public class substring {

//     public static void main(String[] args) {
//         char[][] grid = {
//             {'W', 'E', 'L', 'C', 'O'},
//             {'M', 'E', 'T', 'O', 'Z'},
//             {'O', 'H', 'O', 'C', 'O'},
//             {'R', 'P', 'O', 'R', 'A'},
//             {'T', 'I', 'O', 'N', ' '}
//         };

//         String target = "TOO";
//         findSubstringInGrid(grid, target);
//     }

//     public static void findSubstringInGrid(char[][] grid, String target) {
//         int numRows = grid.length;
//         int numCols = grid[0].length;
//         int targetLen = target.length();

//         for (int r = 0; r < numRows; r++) {
//             for (int c = 0; c < numCols; c++) {
//                 if (c + targetLen <= numCols) {
//                     boolean found = true;
//                     for (int i = 0; i < targetLen; i++) {
//                         if (grid[r][c + i] != target.charAt(i)) {
//                             found = false;
//                             break;
//                         }
//                     }
//                     if (found) {
//                         System.out.println("Start index: <" + r + "," + c + ">");
//                         System.out.println("End index: <" + r + "," + (c + targetLen - 1) + ">");
//                         return;
//                     }
//                 }

//                 if (r + targetLen <= numRows) {
//                     boolean found = true;
//                     for (int i = 0; i < targetLen; i++) {
//                         if (grid[r + i][c] != target.charAt(i)) {
//                             found = false;
//                             break;
//                         }
//                     }
//                     if (found) {
//                         System.out.println("Start index: <" + r + "," + c + ">");
//                         System.out.println("End index: <" + (r + targetLen - 1) + "," + c + ">");
//                         return;
//                     }
//                 }
//             }
//         }
//         System.out.println("Substring not found in the grid.");
//     }
// }
