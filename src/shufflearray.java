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
public class shufflearray {
   public static void shufar(int n,int arr[]){
        int[] res=new int[2*n];
        int j=0;
        for(int i=0;i<n;i++){
            res[j++]=arr[i];
            res[j++]=arr[i+n];
        }
        System.out.println(Arrays.toString(res));
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[2*n];
        for(int i=0;i<2*n;i++){
            arr[i]=sc.nextInt();
        }
        shufar(n,arr);
    }
    
}
