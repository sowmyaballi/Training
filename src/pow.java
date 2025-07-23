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
public class pow {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        double sum=0;
        while(n>0){
            count++;
            
            int digit=n%10;
            
            sum=sum+Math.pow(digit, count);
            n=n/10;
            
        }
        System.out.println((int)sum);
        
    }
        
    
}
