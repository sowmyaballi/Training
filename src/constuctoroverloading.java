/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
import java.lang.reflect.Constructor;
import java.util.*;
  
class Student{
    
     Student(int a,int b){
        System.out.println(a+b);
    }
     Student(double a,double b){
         System.out.println(b-a);
     }
}
public class constuctoroverloading {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Student ob=new Student(a,b);
        Student ob2=new Student(5.0,3.0);
        
        
    }
    
}
