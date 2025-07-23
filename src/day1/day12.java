/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

/**
 *
 * @author sowmya
 */
import java.util.*;
public class day12 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int hours=sc.nextInt();
       if(hours<=0){
           System.out.println("invalid");
        
    }
       if(hours<=2){
           System.out.println(50);
       }
       else{
           System.out.println(50+((hours-2)*20));
       }
    }
}

           
