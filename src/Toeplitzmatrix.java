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

public class Toeplitzmatrix {
    public static boolean eplitzmatrix(int r,int c,int mat[][]){
      for(int i=0;i<r-1;i++){
          for(int j=0;j<c-1;j++){
              if(mat[i][j]!=mat[i+1][j+1]){
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
        boolean res=eplitzmatrix(r,c,mat);
        System.out.println(res);
     }    
    
}
