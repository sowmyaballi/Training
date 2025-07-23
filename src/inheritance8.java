/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
class Father{
    
    int a,b;
    Father(int x,int y){
        a=x;
        b=y;
    }
    void sum(){
        System.out.println(a+b);
    }
    void sub(){
        System.out.println(a-b);
    }
}
class Daughter extends Father{
    Daughter(){
    super(200,100);
    super.sum();
    super.sub();
    }
}
public class inheritance8 {
    public static void main(String[] args){
        Daughter ob=new Daughter();
    }
    
}
