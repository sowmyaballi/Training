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
public class removeduplicatestr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
       /* StringBuffer dup=new StringBuffer("");
        for(int i=0;i<name.length();i++){
            String temp=dup.toString();
            if(temp.indexOf(name.charAt(i))==-1){
                dup=dup.append(name.charAt(i));
            }
        }*/
        String result="";
        for(int i=0;i<name.length();i++){
            if(result.indexOf(name.charAt(i))==-1){
                result=result+name.charAt(i);
            } 
        }
       // System.out.println(dup);
        System.out.println(result);
            
        
    }
    
}
