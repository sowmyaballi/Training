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
public class uppertolower {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String res="";
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)>=65 && name.charAt(i)<=90){
                res+=Character.toLowerCase(name.charAt(i));
            }
            else{
                res+=Character.toUpperCase(name.charAt(i));
            }
        }
        System.out.println(res);
    }
    
}
