package Laboratorka1;

public class Task5 {
    public static void matrix(){
        int n = 3;
        int k = 3;
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int arr[][] = new int[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) { // 123
            for (int j = 0; j < k; j++) { // 147
                arr[j][i] = matrix[i][j];
            }
            System.out.println();
        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        matrix();
    }
}
