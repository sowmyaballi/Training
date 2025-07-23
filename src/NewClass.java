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
public class NewClass {
    public static void lastplusone(int n,int arr[]){
        int rem=0;
        int res=0;
        for(int i=0;i<n;i++){
           rem=arr[i]%10;
           res=res*10+rem;
        }
        int fres=res+1;
        int res2=0;
        
        for(int i=0;i<n;i++){
            int rem1=fres%10;
            res2=res2*10+rem1;
            fres=fres/10;
        }
        
        int[] newarr=new int[n];
        for(int i=0;i<n;i++){
            newarr[i]=res2%10;
            res2=res2/10;
        }
        System.out.println(Arrays.toString(newarr));
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        lastplusone(n,arr);
    }
    
}
