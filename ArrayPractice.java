import java.util.*;

class ArrayPractice {

    public static void main (String [] args){

        int A [][] = {{1,2,3} ,{4,5,6}};
        int B [][] = {{1,2,3} ,{4,5,6}};
        int sum [][] = new int [2][3]; 
        for (int a = 0; a <= 6; a++){
            for (int b = 0; b<= 6; b++){
                 sum [a][b] = A[a][b] + B[a][b];
                System.out.println(sum[a][b]);
            }
        }

    }
}