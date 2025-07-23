/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
abstract class hero{
    abstract void sum(int a,int b);
    abstract void mul(int a,int b);
}
abstract class lover extends hero{
    void sum(int a,int b){
        System.out.println("sum="+(a+b));
    }
    abstract void mul(int a,int b);
}
class third extends lover{
    void mul(int a,int b){
        System.out.println("mul="+(a*b));
    }
}
public class abstarction2 {
    public static void main(String[] args){
        third ob=new third();
        ob.sum(100,200);
        ob.mul(5, 6);
    }
    
}
