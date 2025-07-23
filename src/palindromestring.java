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
public class palindromestring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] reverse=str.toCharArray();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            //char temp=reverse[left];
            //reverse[right]=reverse[left];
            //reverse[left]=temp;
            if(reverse[left]!=reverse[right]){
                System.out.println("False");
                return;
            }
            left++;
            right--;
        }
        System.out.println("True");
        
    }
}
