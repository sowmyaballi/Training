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
public class stringsplit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
       /* String res=""+Character.toUpperCase(name.charAt(0));
        for(int i=1;i<name.length();i++){
            if(name.charAt(i-1)==' '){
                res+=Character.toUpperCase(name.charAt(i));
            }
            else{
                res+=name.charAt(i);
            }
        }
        System.out.println(res);*/
        String[] array=name.split(" ");
        StringBuilder res=new StringBuilder("");
        for(String w:array){
            if(!w.isEmpty()){
                res.append(Character.toUpperCase(w.charAt(0)));
               
            }
             res.append(w.substring(1).toLowerCase()+" ");
             
            
        }
        System.out.println(res.toString());
    }
    
}
