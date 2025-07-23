/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
interface pin{
    abstract void sum(int a,int b);
}
interface pan extends pin{
    abstract void mul(int a,int b);
}
interface prawn extends pan{
    abstract void sub(int a,int b);
}
class pray implements prawn{
    public void sum(int a,int b){
        System.out.println("sum:"+(a+b));
    }
    public void sub(int a,int b){
        System.out.println("sub:"+(a-b));
    }
    public void mul(int a,int b){
        System.out.println("mul:"+(a*b));
    }
}
public class extendinginterface {
    public static void main(String[] args){
        pray ob=new pray();
        ob.sum(5, 6);
        ob.sub(100, 200);
        ob.mul(25, 25);
    }
    
}
