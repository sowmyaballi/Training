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
public class sortingarray {
    public static void sortarr(int n,int arr[]){
        
        for(int i=0;i<n;i++){
            
            if(i<n/2-1){
                for(int j=i+1;j<n/2;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            }
            else{
                for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            }
            
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
            
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sortarr(n,arr);
    }
    
}
