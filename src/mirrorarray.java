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
public class mirrorarray {
    public static boolean mirrorarr(int n,int arr[]){
       
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[n-1-i]){
                return false;
            }
        }
        
        return true;
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2!=0){
            System.out.println("Can't form a mirrored image with odd size");
            return;
        }
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       boolean res= mirrorarr(n,arr);
       
       if(res){
           System.out.println("It's a mirrored image");
       }
       else{
           System.out.println("Not a mirrored image");
       }
        
    }
        
    
}
