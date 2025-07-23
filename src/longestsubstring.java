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
public class longestsubstring {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String name=sc.next();
        String current=" ";
        String longest=" ";
        char[] output=name.toCharArray();
        for(char ans:output){
            int res=current.indexOf(ans);
            if(res!=1){
                current=current.substring(res+1);
            }
            current+=ans;
        }
        if(current.length()>longest.length()){
            longest=current;
        }
        System.out.println(longest);
    }
    
}
