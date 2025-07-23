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
public class arrsum {
    public static void arraysum(int n,int arr[]){
        
        for(int i=0;i<n;i++){
            int sum=0;
            if(i==0){
                sum=arr[0];
            }
            for(int j=0;j<i;j++){
                sum+=arr[j];
            }
            System.out.print(sum+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        arraysum(n,arr);
    }
    
}
