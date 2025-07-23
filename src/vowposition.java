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
public class vowposition {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        //char[] input=str.toCharArray();
        String res="";
        for(int i=0;i<str.length();i++){
           // if(input[i]=='a' ||input[i]=='o' || input[i]=='e' || input[i]=='i' ||input[i]=='u'){
            char ch=str.charAt(i);
            if("aeiouAEIOU".indexOf(ch)!=-1){
                    for(int j=1;j<i+1;j++){
                        //res+=input[i];
                        res+=ch;
                    }
                        
            }
            //res+=input[i];
            res+=ch;
            
        }
        System.out.println(res);
        
    }
    
}
