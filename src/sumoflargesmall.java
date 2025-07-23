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
public class sumoflargesmall {
    public static int largesmallsum(int row,int col,int mat[][]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]>max){
                    max=mat[i][j];
                }
                if(mat[i][j]<min){
                    min=mat[i][j];
                }
            }
        }
        return max+min;
    } 
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] mat=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int res=largesmallsum(row,col,mat);
        System.out.println(res);
    }
    
}
