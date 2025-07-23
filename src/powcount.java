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
public class powcount {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int count=0;
        double sum=0;
        int digits=0;
        while(n>0){
             digits=n%10;
            count++;
            System.out.println(digits+" ");
            n=n/10;
        }
    
    System.out.println("count:"+count);
    
    for(int i=count;i>=1;i--){
        int rem=temp%10;
        sum+=Math.pow(rem, i);
        temp=temp/10;
    }
    System.out.println((int)sum);
        
    } 
    
        
    
}
//5^1+6^2+7^3+8^4=4480