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
public class oddsumevensum {
    public static void sum(int n,int arr[]){
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                evensum+=arr[i];
            }
            else{
                oddsum+=arr[i];
            }
        }
        System.out.println(evensum-oddsum);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sum(n,arr);
        //int evensum=0;
        //int oddsum=0;
        /*for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evensum+=arr[i];
            }
            else{
                oddsum+=arr[i];
            }
        }
        System.out.println(oddsum-evensum);*/
        /*for(int i=0;i<n;i++){
            if(i%2==0){
                evensum+=arr[i];
            }
            else{
                oddsum+=arr[i];
            }
        }
        System.out.println(evensum-oddsum);*/
    }
    
}
