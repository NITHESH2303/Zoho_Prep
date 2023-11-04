package set4;
public class island_pattern {
    public static void main(String[] args) {
        int m=6,n=7;
        int k = 0, l = 0;
        char ch = 'X';
        char[][] arr = new char[n][m];
        while (k < n && l < m) {
            // first row
            for (int i = l; i < m; i++){
                arr[k][i] = ch;
                // System.out.print(i +" $ " +ch+ " "+k+":");
            }
            System.out.println();
            k++;

            // last col
            for (int i = k; i < n; i++){
                arr[i][m - 1] = ch;
                // System.out.print(i +" " +ch+ " "+(m-1)+":");
            }
            System.out.println();
            m--;

            // last row
            if (k < n) {
                for (int i = m - 1; i >= l; i--)
                    arr[n - 1][i] = ch;

                n--;
            }

            // first col
            if (l < m) {
                for (int i = n - 1; i >= k; i--)
                    arr[i][l] = ch;

                l++;
            }

            ch = (ch == 'X') ? '0' : 'X';
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
