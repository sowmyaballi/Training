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
public class flipimage {
    public static void fliponetozero(int r,int c,int mat[][]){
        for(int i=0;i<r;i++){
            for(int j=c-1;j>=0;j--){
                //System.out.print((mat[i][j]^1+" ");another way of solution
                if(mat[i][j]==1){
                    
                    System.out.print(0+" ");
                }
                else if(mat[i][j]==0){
                    
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
         
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
        fliponetozero(r,c,mat);
        
    }
    
}
