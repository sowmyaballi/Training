/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
class food{
    String itemId;
    String itemName; 
    double unitPrice;
    int quantity;
    food( String itemId,String itemName,double unitPrice,int quantity){
        this.itemId=itemId;
        this.itemName=itemName;
        this.unitPrice=unitPrice;
        this.quantity=quantity;
        
    }
    double calculateBill(){
        double subtotal=unitPrice*quantity;
        double gst=0.05*subtotal;
        double totalbill=subtotal+gst;
        if(totalbill>1000){
            totalbill-=0.10*totalbill;
        }
        return totalbill;
    }
    void displayDetails(){
        System.out.println("Food Item Record");
        System.out.println("ID "+itemId);
        System.out.println("Name "+itemName);
        System.out.println("Unit Price "+unitPrice);
        System.out.println("Quantity "+quantity);
        
        
    }
    
}
class DianaIn extends food{
    double servivecharge;
    DianaIn(String itemId,String itemName,double unitPrice,int quantity,double servivecharge){
        super(itemId,itemName,unitPrice,quantity);
        this.servivecharge=servivecharge;
    }
    @Override
    double calculateBill(){
        double subtotal=unitPrice*quantity;
        double gst=0.05*subtotal;
        double totalbill=subtotal+gst+servivecharge;
        if(totalbill>1000){
            totalbill-=0.10*totalbill;
        }
        return totalbill;
    }
    
    
    
    
}
public class Restaurantbillingsystem{
    public static void main(String[] args){
        food ob=new food("F10","Biryani",100.0,4);
       System.out.println(ob.calculateBill());
        ob.displayDetails();
        ob=new DianaIn();
    }

}