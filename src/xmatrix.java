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
public class xmatrix {
    public static boolean xmat(int r,int c,int mat[][]){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j || i+j==r-1){
                    if(mat[i][j]==0){
                        return false;
                    }
                }
                
                else if(mat[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        boolean res=xmat(r,c,mat);
        System.out.println(res);
    }
    
}
