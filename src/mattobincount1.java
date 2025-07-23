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
public class mattobincount1 {
    public static void mattobinarycount(int r,int c,int mat[][]){
        int[] count=new int[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=mat[i][j]%2;
                if(mat[i][j]==1){
                    count[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(count));
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
        mattobinarycount(r,c,mat);
    }
}
