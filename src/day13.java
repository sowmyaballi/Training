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
public class day13 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        if(days>0){
            if(days<=5){
                int fine=days*2;
                System.out.println("Total fine: "+fine);
            }
            else if(days<=10){
               int fine2=10+(3*(days-5));
               System.out.println("Total fine: "+fine2);
            }
            else{
                int fine3=25+((days-10)*5);
                System.out.println("Total fine: "+fine3);
            }
        }
    }
    
}
