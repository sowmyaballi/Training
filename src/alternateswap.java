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
public class alternateswap {
    public static void aitswap(int n,int arr[]){
        
        for(int i=0;i<n-1;i+=4){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            
         }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        aitswap(n,arr);
    }
    
}
