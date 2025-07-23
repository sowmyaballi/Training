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
public class diagonaldiff {
    public static int diagdiff(int row,int col,int mat[][]){
        int diag1=0;
        int diag2=0;
                
    
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    diag1+=mat[i][j];
                }
                if(i+j==row-1){
                    diag2+=mat[i][j];
                }
            }
        }
        return diag1-diag2;
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] mat=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
       int res= diagdiff(row,col,mat);
       System.out.println(res);
    }
        
    
}
