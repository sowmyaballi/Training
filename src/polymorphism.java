/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
class Flowers{
    void blossom(){
        System.out.println("Flowers blossom");
    }
    
}
class Rose extends Flowers{
   @Override 
    void blossom(){
        System.out.println("Rose blossoms");
    }
}
class jasmine extends Flowers{
    @Override
    void blossom(){
        System.out.println("jasmine blossoms");
    }
}
public class polymorphism {
    public static void main(String[] args){
        Flowers a=new Flowers();
        a.blossom();
        
        a=new Rose();
        a.blossom();
        a=new jasmine();
        a.blossom();
    }
    
}
