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
public class countvowelsconsonants {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        str.toLowerCase();
        char[] input=str.toCharArray();
        int count1=0,count2=0;
        for(char conso:input){
           /* if(conso=='a' || conso=='e' || conso=='i' || conso=='o' || conso=='u' ){
                count1++;
            }*/
            if ("aeiou".indexOf(conso)!=-1){
                count1++;
            }
            else{
                count2++;
            }
        }
        System.out.println("vowel count: "+count1);
        System.out.println("consonant count: "+count2);
    }
    
}
