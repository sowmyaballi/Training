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
public class amicablepair {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int digit=sc.nextInt();
        
        
        while(digit>9){
            int sum=0;
            int temp=digit;
            while(temp!=0){
                int rem=temp%10;
                sum+=rem;
                temp=temp/10;
            }
            digit=sum;
        }
        
        if(digit==1){
            System.out.println("Mgic");
        }
        else{
            System.out.println("Generic");
        }
    }
    
}
