/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
/*class First{
    int a,b;
    First(int x,int y){
        System.out.println("first class constructor");
        a=x;
        b=y;
    }
    void sum(){
        System.out.println(a+b);
    }
}
class Second extends First{
    Second(){
        super(10,20);
        System.out.println("second class constructor");
    }
}
*/
class parent{
    int a, b;
    void sum(){
        System.out.println("Sum of a and b is "+(a+b));
    }
    
    void diff(int a, int b){
        System.out.println("Differenece  etween a and b is "+(a-b));
    }
}

class Child extends parent{
    
    Child(int a, int b){
        super.a=a;
        super.b=b;
        super.sum();
        super.diff(50, 30);
    }
}
public class Inheritance6 {
    public static void main(String[] args){
       Child ob= new Child(10, 20);
        
    }    
    
}
