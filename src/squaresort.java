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
import java.lang.Math;
public class squaresort {
    public static void sqrsort(int n,int arr[]){
        for(int i=0;i<n;i++){
            arr[i]=(int)Math.pow(arr[i],2);
        }
        Arrays.sort(arr);
        
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sqrsort(n,arr);
    }
    
}
