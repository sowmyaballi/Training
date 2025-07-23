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
public class maxconsecutives {
    public static void maxcon(int n,int arr[]){
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count+=1;
            }
            else{
                if(count>max){
                max=count;
                }  
                count=0;
            }
        }
        if(count>max) max=count;
        System.out.println(max);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        maxcon(n,arr);
    }
    
}
