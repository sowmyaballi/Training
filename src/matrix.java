/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
import java.util.*;
public class matrix {
    public static void matrixoutput(int row,int col,int mat[][]){
       /* for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }*/
       /* for(int[] val:mat){
            for(int val1:val){
            System.out.print(val1+" ");
        }
            System.out.println();
        }*/
        for(int i=0;i<mat.length;i++){
            System.out.println(Arrays.toString(mat[i]));
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] mat=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        matrixoutput(row,col,mat);
    }
    
}
