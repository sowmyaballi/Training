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
public class anagram {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String name1=sc.next();
        String name2=sc.next();
        if(name1.length()!=name2.length()){
            System.out.println("Not an Anagram");
            return;
        }
        char[] input=name1.toCharArray();
        char[] input2=name2.toCharArray();
        Arrays.sort(input);
        Arrays.sort(input2);
        String res=input.toString();
        String res2=input.toString();
        if(res.equals(res2)){
            System.out.println("it is anagram");
        }
    }
    
}
