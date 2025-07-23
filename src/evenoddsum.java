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
public class evenoddsum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int digit=sc.nextInt();
        int sum=0;
        
        while(digit!=0){
            int rem=digit%10;
            sum=sum*10+rem;
            digit=digit/10;
            
            
        }
        System.out.println(sum);
        int even=0,odd=0;
        while(sum!=0){
            int rem=sum%10;
            if(rem%2==0){
                even=even*10+rem;
            }
            else{
                odd=odd*10+rem;
            }
            sum=sum/10;
        }
        System.out.println(even-odd);
    }
        
    
}
