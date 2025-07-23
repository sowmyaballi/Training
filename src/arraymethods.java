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
public class arraymethods {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr2=Arrays.copyOfRange(arr,1,3);
        System.out.println(Arrays.toString(arr2));
        
        //Arrays.sort(arr);
       // System.out.println(Arrays.toString(arr));
      //  int[] numbers={3,4,10,12,1};
       // System.out.println(Arrays.equals(arr,numbers));
       /* for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }*/
    }
    
}
