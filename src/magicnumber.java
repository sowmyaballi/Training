/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
//amaicable pairs;
import java.util.*;
public class magicnumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        int a=sc.nextInt();
        System.out.println("enter b:");
        int b=sc.nextInt();
        int sum1=0;
        int sum2=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                sum1+=i;
            }
        }
        for(int i=1;i<b;i++){
            if(b%i==0){
                sum2+=i;
            }
        }
        if(a==sum2 && b==sum1){
            System.out.println("Amicablepair");
        }
        else{
          System.out.println("Not Amicablepair"); 
        }
    }
    
}
