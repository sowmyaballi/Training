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
public class digitdifference {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int digit=sc.nextInt();
        int newnum=0;
        while(digit!=0){
            int rem=digit%10;
            newnum=newnum*10+rem;
            digit=digit/10;
            
        }
        System.out.println(newnum);
        int res=newnum%10;
        int prev=newnum%10;
        newnum=newnum/10;
        while(newnum!=0){
            int rem=newnum%10;
            int x=Math.abs(prev-rem);
            res=(res*10)+x;
            prev=rem;
            newnum=newnum/10;
        }
        System.out.println(res);
    }
    
}
