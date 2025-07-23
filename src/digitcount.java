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
public class digitcount {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter digit:");
        int digit=sc.nextInt();
       /* String num=Integer.toString(digit);
        System.out.println();*/
        int count=0;
        while(digit>0){
             digit=digit/10;
            count++;
    }
        System.out.println("count:"+count);
    }
    
}
