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
import java.lang.*;
public class vowelsconsonants {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String sname=sc.next();
        String sname1=sname.toLowerCase();
        char[] chars=sname1.toCharArray();
       
        for(char pan:chars){
             if(pan!='a' && pan!='e' && pan!='i'&& pan!='o'&& pan!='u'){
            System.out.print(pan+" ");
            
            } 
       }
        for(char pin:chars){
             if(pin=='a' || pin=='e' || pin=='i'|| pin=='o'|| pin=='u'){
            System.out.print(pin+" ");
            
            } 
       }
        
    }
    
}
