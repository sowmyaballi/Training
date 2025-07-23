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
public class firstzero {
    public static void first(int n,int arr[])
    {
        int arr1[]=new int[n];
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                arr1[index++]=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr1[index++]=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr1[i]+" ");
        }
            
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
        first(n,arr);
        
    }
}
