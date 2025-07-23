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
import java.lang.*;
public class stringbasics {
    public static void main(String[]args){
        String str="java";
                str.concat("program");
                System.out.println(str);
        String name="python ";
        name=name.concat("program");
        System.out.println(name);
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.substring(2)+" ' ");
        System.out.println(name.substring(2,7)+"'");
        System.out.println(name.toLowerCase()+"'");
        System.out.println(name.toUpperCase()+"'");
        System.out.println(name.trim()+"'");
        System.out.println(name.equals(str));
        System.out.println(name.equalsIgnoreCase(str));
        System.out.println(name.compareTo(str));
        System.out.println(name.contains("while"));
        System.out.println(name.replace('y','*')+"'");
        String[] parts=name.trim().split(" ");
        System.out.println("split(\"\"):First word='"+parts[0]+"',second word='"+parts[1]+"'");
        System.out.println(name.indexOf("y"));
        System.out.println(name.lastIndexOf("p"));
        System.out.println(name.startsWith("log"));
        System.out.println(name.endsWith("lie"));
        String c="java";
        String d=new String("Java");
        System.out.println(str==c);
        System.out.println(str==d);
        System.out.println(c.equals(d));//comparing content so returns true even capitals return true but case sensitive
        System.out.println(c.equalsIgnoreCase(d));//it is not case sesnsitive
        System.out.println("apple".compareTo("apple"));
        System.out.println("banana".compareTo("apple"));
        System.out.println("apple".compareTo("banana"));
        //T o char array
        String sname="java123";
        char[] chars=sname.toCharArray();
        System.out.print("characters: ");
        for(char pan:chars){
            System.out.print(pan+" ");
        }
        System.out.println();
        //To byte array
        byte[] bytes=sname.getBytes();
        System.out.print("bytes: ");
        for(byte pin:bytes){
            System.out.print(pin+" ");
        }
        System.out.println();
        String numstr="1234";
        int num=Integer.parseInt(numstr);
        System.out.println("Parsed Integer: "+num);
        StringBuilder sb=new StringBuilder("Logic");
        sb.append("While");
        System.out.println("After append: "+sb);
        sb.insert(5," and");
        System.out.println("After insert: "+sb);
        sb.replace(0,5,"Loop");
        System.out.println("After replace: "+sb);
        sb.delete(4,8);
        System.out.println("After delete: "+sb);
        sb.reverse();
        System.out.println("After reverse: "+sb);
        String finalString=sb.toString();
        System.out.println("Final string: "+finalString);
        StringBuffer tb=new StringBuffer("Logic");
        tb.append("While");
        System.out.println("After append: "+tb);
        tb.insert(5," and");
        System.out.println("After insert: "+tb);
        tb.replace(0,5,"Loop");
        System.out.println("After replace: "+tb);
        tb.delete(4,8);
        System.out.println("After delete: "+tb);
        tb.reverse();
        System.out.println("After reverse: "+tb);
        String FinalString=tb.toString();
        System.out.println("Final string: "+FinalString);
        
    

        
    }
    
}

