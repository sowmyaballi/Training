/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
//sum of all factors excluding itself
import java.util.*;
public class perfectnumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
    
        }
        if(n==sum){
            System.out.println("Perfect number");
        }
        else{
          System.out.println(" Not Perfect number");  
        }
        }
        
    
}
