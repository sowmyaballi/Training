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
public class binary {
    public static void binaryarr(int n,int arr[]){
        for(int i=0;i<n;i++){
            int bin=arr[i]%2;
            System.out.print(bin+" ");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        binaryarr(n,arr);
    }
    
}
