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
public class missingnumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int tsum=n*(n+1)/2;
        
        int arrsum=0;
        for(int i=0;i<n;i++){
            arrsum+=arr1[i];
        }
        System.out.println(tsum-arrsum);
    }
    
}
