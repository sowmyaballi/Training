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
public class eventdigitcount {
   /* public static void evendigit(int n,int arr[]){
        int count=0;
        
        for(int i=0;i<n;i++){
          int dig=(int)Math.log10(arr[i])+1;
          if(dig%2==0){
              count+=1;
          }
            
        }
        System.out.println(count);
    }*/
    public static void evendigit(int n,int arr[]){
        int count=0;
        
        for(int i=0;i<n;i++){
          int temp=arr[i];
          int cnt=0;
          while(temp>0){
              temp=temp/10;
              cnt++;
          }
          if(cnt%2==0){
              count++;
          }
            
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        evendigit(n,arr);
    }
    
}
