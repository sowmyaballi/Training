/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
abstract class hide{
    int a,b;
    hide(int x,int y){
        a=x;
        b=y;
    }
    void sum(){
        System.out.println("sum="+(a+b));
    }
    abstract void sub();
    abstract void mul();
}
class heroine extends hide{
    heroine(){
        super(20,10);
    }
    void sub(){
        System.out.println("sub="+(a-b));
    }
    void mul(){
        System.out.println("mul="+(a*b));
    }
}
public class abstarction1 {
    public static void main(String[] args){
        heroine ob=new heroine();
        ob.sum();
        ob.sub();
        ob.mul();
    }
    
}
