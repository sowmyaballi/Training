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
public class matcolsort {
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
        
        for(int j=0;j<r;j++){
            int[] temp=new int[r];
        
            for(int i=0;i<c;i++){
                temp[i]=mat[i][j];
            }
            Arrays.sort(temp);
            for(int i=0;i<c;i++){
                mat[i][j]=temp[i];
            }
        }
        System.out.println(Arrays.deepToString(mat));
    }
}
