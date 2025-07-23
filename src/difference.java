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
public class difference {
    public static void diff(int n,int arr[])
    {
        int large=arr[0];
       
       for(int i=0;i<n/2-1;i++)
       {
           if(arr[i]>large)
           {
               large=arr[i];
           }
       }
       int small=arr[arr.length-1];
       for(int i=n/2;i<n;i++)
       {
           if(arr[i]<small)
           {
               small=arr[i];
           }
       }
       System.out.print(large-small);
           
       
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        diff(n,arr);
    }
}
