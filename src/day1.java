/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
import java.util.Scanner;
public class day1 {
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int five=n/500;
        n=n%500;
        int two=n/200;
        n=n%200;
        int one=n/100;
        System.out.println("500 notes are: "+five);
        if(two>0){
        System.out.println("200 notes are: "+two);
        }
        if(one>0){
        System.out.println("100 notes are: "+one);
        }
    }
        
    
}
