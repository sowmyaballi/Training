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
public class alternatematreverse {
    public static void altmatrev(int r,int c,int mat[][]){
        for(int i=r-1;i>=0;i-=2){
            
                for(int j=0;j<c;j++){
                    System.out.print(mat[i][j]+" ");
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
        altmatrev(r,c,mat);
    }    
    
}
