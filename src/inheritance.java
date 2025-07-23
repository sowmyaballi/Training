/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
class First{
    int a=10,b=20;
    void sum(){
        System.out.println(a+b);
    }
}
    class Second extends First{
        int c=15,d=25;
        void product(){
            System.out.println(c*d);
        }
        void sub(){
            System.out.println(b-a);
        }
    }

public class inheritance {
    public static void main(String[] args){
        Second ob=new Second();
        ob.sum();
        ob.product();
        ob.sub();
    }
    
}
