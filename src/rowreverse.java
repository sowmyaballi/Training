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
public class rowreverse {
    public static void rowreversematrix(int row,int col,int mat[][]){
        int[][] mat2=new int[row][col];
    
        for(int i=0;i<row;i++){
            int left=0,right=row-1;
               while(left<=right){
                   int temp=mat[i][left];
                   mat[i][left]=mat[i][right];
                   mat[i][right]=temp;
                   left++;
                   right--;
                
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
        rowreversematrix(row,col,mat);
    }
    
}
