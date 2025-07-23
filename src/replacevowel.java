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
public class replacevowel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] input=str.toCharArray();
        for(int i=0; i<str.length(); i++){
           if(input[i]=='a'||input[i]=='e'||input[i]=='i'||input[i]=='o'||input[i]=='u'){
                input[i]='@';
            }
            /*if("aeiou".indexOf(str.charAt(i))!=-1){
                str=str.replace(str.charAt(i),'*');
            }*/
        }
        String result=new String(input);
        System.out.println(result);
    }
    
}
