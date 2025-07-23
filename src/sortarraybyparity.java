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
public class sortarraybyparity {
    public static void srp(int n,int arr[]){
        int[] arr2= new int[n];
        int left=0, right=n-1;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr2[left++]=arr[i];
            }
            else{
                arr2[right--]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        srp(n,arr);
    }
    
}
