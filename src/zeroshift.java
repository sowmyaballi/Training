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
public class zeroshift {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr2[j]=arr[i];
                j++;
            }
            
        }
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }

        
    }
    
}
