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
public class smallernumber {
    public static void smallnumber(int n,int arr[]){
        
        int count=0;
        for(int i=0;i<n;i++){
            int max=arr[i];
            for(int j=0;j<n;j++){
                if(max>arr[j]){
                    count++;
            }
            }
            System.out.print(count+" ");
            count=0;
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        smallnumber(n,arr);
    }
}
