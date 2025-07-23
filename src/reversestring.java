/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
/*import java.util.*;
import java.lang.*;
public class reversestring {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        StringBuffer ans=new StringBuffer("");
        for(int i=name.length()-1;i>=0;i--){
            ans=ans.append(name.charAt(i));
           
        }
        System.out.println(ans);
        ans.reverse();
        System.out.println(ans);
        
    }
    
}*/
//two pointer approach
import java.util.*;
import java.lang.*;
public class reversestring {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] input=str.toCharArray();
        int left=0;
             int right=str.length()-1;
        while(left<right){
            char temp=input[left];
            input[left]=input[right];
            input[right]=temp;
            left++;
            right--;
        }
        String result=new String(input);
        System.out.println(result);
        }
}

