/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
interface first{
    abstract void display();
}
interface second{
     abstract void display();
}
interface friday{
     abstract void display();
}
class remo implements first,second,friday{
    public void display(){
        System.out.println("Bye!see u tmrow");
    }
}
    
public class multipleinterfaces {
    public static void main(String[] args){
        remo ob=new remo();
        ob.display();
    }
    
}
