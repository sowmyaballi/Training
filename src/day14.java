/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
import java.util.*;
public class day14 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String customername=sc.next();
        System.out.println("Customer Name:"+customername);
        String customerid=sc.next();
        System.out.println("Customer Id:"+customerid);
        int unitsconsumed=sc.nextInt();
        System.out.println("Units Consumed:"+unitsconsumed);
        double basebill=0;
        if(unitsconsumed<=100){
            basebill=unitsconsumed*1.50;
            System.out.println("Basebill: "+basebill);
        }
        else if(unitsconsumed<=200){
            basebill=(100*1.50)+(unitsconsumed-100)*2.00;
            System.out.println("Basebill: "+basebill);
        }
        else if(unitsconsumed<=300){
            basebill=(100*1.50)+(100*2.00)+(unitsconsumed-200)*3.00;
            System.out.println("Basebill: "+basebill);
        }
        else{
            basebill=(100*1.50)+(100*2.00)+(unitsconsumed-300)*5.00;
            System.out.println("Basebill: "+basebill);
        }
        double gst=0.05*basebill;
        System.out.println("GST(5percent): "+gst);
        int servicecharge=25;
        System.out.println("service charge: "+servicecharge);
        double midbill=basebill+gst+servicecharge;
        double discount=0;
        if(midbill>500){
            discount=0.05*midbill;
            System.out.println("discount"+discount);
                 }
        double totalbill=basebill+gst+servicecharge-discount;
        System.out.println("totalbill"+totalbill);
    }
}

            
        
    

