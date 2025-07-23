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
public class targetsum {
    public static void  tgtsum(int n,int arr[],int target){
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                
                    sum=arr[i]+arr[j];
                    if(sum==target){
                        System.out.println(i+" "+j);
                        
                    }
                
            }
        }
        System.out.println(-1+""+-1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        tgtsum(n,arr,target);
    }
}
