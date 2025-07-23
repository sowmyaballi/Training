/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
interface sow{
    abstract void display();
    abstract void print();
}
class maya implements sow{
    public void display(){
        System.out.println("First method");
    }
    public void print(){
        System.out.println("second method");
    }
}
public class Interface1 {
    public static void main(String[] args){
        maya ob=new maya();
        ob.display();
        ob.print();
    }
    
}
