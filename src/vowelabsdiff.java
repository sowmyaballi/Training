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
public class vowelabsdiff {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        name.toLowerCase();
        int len=name.length();
        char[] input=name.toCharArray();
        int count1=0,count2=0;
        for(int i=0;i<len;i++){
            if(i<len/2){
                if(input[i]=='a' ||input[i]=='o' || input[i]=='e' || input[i]=='i' ||input[i]=='u'){
                    count1++;
                }
            }
            else{
                if(input[i]=='a' ||input[i]=='o' || input[i]=='e' || input[i]=='i' ||input[i]=='u'){
                    count2++;
                }
            }
        }
            System.out.println(Math.abs(count1-count2));
    }
    
}
