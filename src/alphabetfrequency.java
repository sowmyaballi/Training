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
public class alphabetfrequency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int[] freq= new int[256];
         
        for(int i=0;i<name.length();i++){
            freq[name.charAt(i)]++;
            } 
        
        for(int i=0;i<name.length();i++){
          if(freq[name.charAt(i)]>0){
              System.out.println(name.charAt(i)+": "+freq[name.charAt(i)]);
              freq[name.charAt(i)]=0;
        }
    }
    
}
}
