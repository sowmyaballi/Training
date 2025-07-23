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
public class jumpingnumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prev=n%10;
        n=n/10;
        
        boolean flag=true;
        while(n>0){
            int next=n%10;
            if(Math.abs(next-prev)!=1){
                flag=false;
                break;
            }
            prev=next;
            n=n/10;
        }
        if(flag){
            System.out.println("jumping number");
        }
        else{
            System.out.println("not a jumping number");
        }
        
        
    }
    
}
