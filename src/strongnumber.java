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
public class strongnumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        
        for(int k=1;k<=n;k++){
            int temp=k;
            int sum=0;
        while(temp!=0){
            int rem=temp%10;
            int fact=1;
            for(int i=rem;i>=1;i--){
               fact=fact*i ;
            }
            sum+=fact;
            temp=temp/10;
        }
        if(k==sum){
            System.out.println(k);
        }
        }
        
        
    }
    
}
