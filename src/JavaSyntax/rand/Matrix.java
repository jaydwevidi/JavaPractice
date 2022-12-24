package JavaSyntax.rand;

public class Matrix {
    static void printMatrix(int a[][] , int rows , int columns){
        for(int i = 0 ; i < rows ; i++){
            for(int j=0; j< columns ; j++) {
                if (a[i][j] < 10)
                    System.out.print(a[i][j] + "  ");
                else
                    System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static int[][] rotateMatrix90(int a[][] , int n ){
        int a2[][] = new int[n][n];

        for (int i=0 ; i <n ; i++ ){
            for (int j = 0 ; j < n ; j++){
                a2[j][i] = a[n-1-i][j];
            }
        }
        a = a2;
        return a2;
    }
    static int[][] rotateMatrix270(int a[][] , int n ){
        int a2[][] = new int[n][n];

        for (int i=0 ; i <n ; i++ ){
            for (int j = 0 ; j < n ; j++){
                a2[n-1-j][i] = a[i][j];
            }
        }
        a = a2;
        return a2;
    }

    int[][] rotatematrix(int m, int n, int mat[][])
    {
        int R = m;
        int C = m;
        int row = 0, col = 0;
        int prev, curr;


        prev = mat[row + 1][col];

        for (int i = col; i < n; i++)
        {
            curr = mat[row][i];
            mat[row][i] = prev;
            prev = curr;
        }
        row++;

        for (int i = row; i < m; i++)
        {
            curr = mat[i][n-1];
            mat[i][n-1] = prev;
            prev = curr;
        }
        n--;

        if (row < m)
        {
            for (int i = n-1; i >= col; i--)
            {
                curr = mat[m-1][i];
                mat[m-1][i] = prev;
                prev = curr;
            }
        }
        m--;

        if (col < n)
        {
            for (int i = m-1; i >= row; i--)
            {
                curr = mat[i][col];
                mat[i][col] = prev;
                prev = curr;
            }
        }
        col++;

        return mat;
    }

    public static void main(String[] args) {
        int mat[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        printMatrix(mat , 4 , 4);

        printMatrix(rotateMatrix270( mat , 4) , 4 ,4 );
    }
}
