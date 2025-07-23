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
public class matrixsort {
    public static void matsort(int r,int c,int mat[][]){
        for(int i=0;i<m;i++){
          Arrays.sort(mat[i])
                  }
    }
    System.out.println(Arrays.deepToString(mat));
        
        for(int i=0;i<r;i++){
            
            int temp=0;
            for(int j=0;j<c;j++){
                
                if(mat[i][j]>mat[i][j+1]){
                    temp=mat[i][j];
                    mat[i][j]=mat[i][j+1];
                    mat[i][j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        matsort(r,c,mat);
    }
    
}
