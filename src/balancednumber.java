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
import java.lang.Math;
public class balancednumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0,n1=n;
        while(n>0){
            rev=rev+(n%10);
            n1=n1/10;
        }
        int count=0;
        while(n2>0){
            n2=n/2;
            count++;
        }
        int leftsum=0;
        int rightsum=0;
        for(int i=1;i<=count/2;i++){
            leftsum+=n1%10;
            n=n/10;
            rightsum+=rev%10;
        }
        
        
        
    }
    
}
