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
public class buysell {
   public static void  buysellprofit(int n,int arr[]){
       // int[] temp=new int[n];
       int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            int temp=0;
            for(int j=i+1;j<n;j++){
                if(arr[j]-arr[i]>temp){
                    temp=arr[j]-arr[i];
                }
            }
            if(temp>maxi){
                maxi=temp;
            }
            
        }
        
        /*int max=0;
        for(int i=0;i<n;i++){
            if(temp[i]>max){
                max=temp[i];
            }
        }*/
        System.out.println(maxi);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        buysellprofit(n,arr);
    }
    
}
