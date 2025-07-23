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
public class bordersum {
   public static int altmatrev(int r,int c,int mat[][]){
        int sum=0;
        for(int i=0;i<r;i+=2){
            
                for(int j=0;j<c;j++){
                    if(j==0 || j==c-1){
                    sum+=mat[i][j];
                }
            
            }
            
        }
        return sum;
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
       int res= altmatrev(r,c,mat);
       System.out.println(res);
    }    
    

    
}
