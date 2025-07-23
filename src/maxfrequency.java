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
public class maxfrequency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
       int[] freq= new int[256];
         
        for(int i=0;i<name.length();i++){
            freq[name.charAt(i)]++;
            } 
        int max=freq[name.charAt(0)];
        
        for(int i=1;i<name.length();i++){
        
              if (freq[name.charAt(i)]>max){
                  max=freq[name.charAt(i)];
              
                   freq[name.charAt(i)]=0;
              }
        }
        System.out.println(max);
    
        
        
    }
    
}
