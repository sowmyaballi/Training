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
public class largestrevnum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        int a=sc.nextInt();
        System.out.println("enter b:");
        int b=sc.nextInt();
        int res1=0,res2=0;
        while(a!=0){
            int rem=a%10;
            res1=res1*10+rem;
            a=a/10;
        }
        while(b!=0){
            int rem=b%10;
            res2=res2*10+rem;
            b=b/10;
        }
        if(res1>res2){
            System.out.println(res1);
        }
        else{
            System.out.println(res2); 
        }
            
    }
    
}
