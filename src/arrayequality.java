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
public class arrayequality {
    public static void arrequality(int a,int b,int arr1[],int arr2[]){
        for(int i=0;i<a;i++){
            
                if(arr1[i]!=arr2[i]){
                    System.out.println("NOT Equal");
                    return;
                }
                
            
     }
        System.out.println("Equal");
    } 
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a!=b){
            System.out.println("length must be same");
            return;
        }
        int[] arr1=new int[a];
        int[] arr2=new int[b];
        for(int i=0;i<a;i++){
            arr1[i]=sc.nextInt();
        }
        for(int j=0;j<b;j++){
            arr2[j]=sc.nextInt();
        }
        arrequality(a,b,arr1,arr2);
        
        
    }
    
}
