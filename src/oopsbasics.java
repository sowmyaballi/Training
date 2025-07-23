/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
//class & objects
 /*class Student1{
    String name;
    int rollno;
    double marks;
    void display(){
        System.out.println(name+" "+rollno+" "+marks);
    }
}
public class oopsbasics {
    public static void main(String[] args){
        Student1 s1=new Student1();
        s1.name="sowmya";
        s1.rollno=510;
        s1.marks=58.25;
        s1.display();*/
//static variables and static methods
/*class student2{
    static String name="sowmya";
    static int rollno=510;
    static double marks=58.56;
    static void display(){
        System.out.println(name+" "+rollno+" "+marks);
    }
    
}
public class oopsbasics {
    public static void main(String[] args){
       // student2 s1=new student2();
        student2.display();
        System.out.println(student2.marks);*/
//methods with parameters
/*class student3{
    String name;
    int rollno;
    double marks;
    void display(String n,int r,double m){
        System.out.println("Name:"+n);
        System.out.println("Rollno:"+r);
        System.out.println("Marks:"+m);
    }
}
public class oopsbasics {
    public static void main(String[] args){
        student3 ob=new student3();
        ob.display("sowmya",123,65.45);
        ob.display("pinky",134,78.90);*/
//methods with parameters example2
/*class student4{
    


     String name="sowmya";
    int rollno=510;
    double marks=68.62;
    void display(String n,int r,double m){
        System.out.println("Name:"+n);
        System.out.println("Rollno:"+r);
        System.out.println("Marks:"+m);
    }
}
public class oopsbasics {
    public static void main(String[] args){
        student4 ob=new student4();
        ob.display(ob.name,ob.rollno,ob.marks);*/
//default constructor
/*class constructor1{
    String name;
    int rollno;
    double marks;
    void display(){
        System.out.println(name+" "+rollno+" "+marks);
    }
    constructor1()
    {
        name="sowmya";
        rollno=510;
        marks=85.25;
        System.out.println("Hello");
    }
}
public class oopsbasics {
    public static void main(String[] args){
        constructor1 ob =new constructor1();
        ob.display();
        


    }
    
}*/
import java.lang.reflect.Constructor;
public class oopsbasics{
    String name;
    int rollno;
    double marks;
    oopsbasics(String n,int r,double m){
        name=n;
        rollno=r;
        marks=m;
    }
     void display(String n,int r,double m){
        System.out.println("Name:"+n);
        System.out.println("Rollno:"+r);
        System.out.println("Marks:"+m);
         System.out.println("Name:"+name);
        System.out.println("Rollno:"+rollno);
        System.out.println("Marks:"+marks);
    }
    public static void main(String[] args){
        oopsbasics ob=new oopsbasics("sowmya",124,89.00);
        ob.display("s",3,45.9);
    }
    
    
} 
