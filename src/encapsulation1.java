/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
class Student1{
    private String name;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
}
public class encapsulation1 {
    public static void main(String[] args){
        Student1 s=new Student1();
        s.setName("Sowmya");
        System.out.println(s.getName());
        s.setName("nandini");
         System.out.println(s.getName());
    }
    
}
