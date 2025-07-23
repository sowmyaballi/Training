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
public class colreverse {
     public static void colreversematrix(int row,int col,int mat[][]){
        int[][] mat2=new int[row][col];
    
        for(int i=0;i<col;i++){
            int top=0,bottom=row-1;
               while(top<=bottom){
                   int temp=mat[top][i];
                   mat[top][i]=mat[bottom][i];
                   mat[bottom][i]=temp;
                   top++;
                   bottom--;
               
                
        }
      }
        for(int i=0;i<mat.length;i++){
        
            System.out.println(Arrays.toString(mat[i]));
        }
    } 
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] mat=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        colreversematrix(row,col,mat);
    }
    
}
