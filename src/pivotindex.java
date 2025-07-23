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
public class pivotindex {
    public static int pivind(int n,int a[]){
        int tsum=0;
        for(int i:a){
            tsum+=i;
            
        }
        int ls=0;
        for(int i=0;i<a.length;i++){
            if(ls==tsum-ls-a[i]){
                return i;
            }
            ls+=a[i];
        }
        return -1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       int k= pivind(n,a);
       System.out.println(k);
    }
    
}
