/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
//difference in no.of parameters
import java.util.*;
class student{
    void display(){
        System.out.println("Hello");
    }
    String display(String name){
        //System.out.println(name);
        return name;
    }
    
    void display(int a,int b){
        System.out.println(a*b);
    }
}
public class methodoverloading {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        student ob=new student();
        ob.display();
        String res=ob.display(sc.next());
        System.out.println(res);
        ob.display(5,3);
        
        
        
        
    }
}
