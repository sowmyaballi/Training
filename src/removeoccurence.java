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
public class removeoccurence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String remove=sc.next();
        String res=name.replaceAll(remove,"");
        /*int i=0;
        while(i<=name.length()- remove.length()){
            if(name.substring(i,i+remove.length()).equals(remove)){
                i+=remove.length();
            }
            else{
                res+=name.charAt(i);
                i++;
            }
        }
        
        while(i<name.length()){
            res+=name.charAt(i++);
        }*/
        
        System.out.println(res);
    }
    
}
