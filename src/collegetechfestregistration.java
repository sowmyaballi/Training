/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
class Participant{
    private int participantid;
    public void setParticipantId(int n){
        participantid=n;
    }
    private String name;
    public void setName(String s){
        name=s;
    }
    private double baseregfee;
    public void setBaseRegistrationFee(double m){
        baseregfee=m;
    }
    private int eventno;
    public void setNumberOfEvents(int k){
        eventno=k;
    }
    private double eventcharge;
    public void setEventChargePerEvent(double p){
        eventcharge=p;
    }
    public int getParticipantId(){
        return participantid;
    }
    public String getName(){
        return name;
    }
    public double getBaseRegistrationFee(){
        return baseregfee; 
    }
    public int getNumberOfEvents(){
        return eventno; 
    }
    public double getEventChargePerEvent(){
        return eventcharge;
    }
   double calculateTotalFee(){
        double totalfee=baseregfee+(eventno*eventcharge);
        return totalfee;
    }
   void displayDetails(){
        System.out.println("Participant Record");
        System.out.println("ID:"+getParticipantId());
        System.out.println("Name:"+getName());
        System.out.println("BaseRegistrationFee:"+getBaseRegistrationFee());
       
        System.out.println("charge per event:"+getNumberOfEvents()+"events @"+getEventChargePerEvent()+"/event");
        System.out.println("Totalfee:"+calculateTotalFee());
   }
}
public class collegetechfestregistration {
    public static void main(String[] args){
        Participant ob=new Participant();
        ob.setParticipantId(510);
        ob.setName("sowmya");
        ob.setBaseRegistrationFee(200.0);
        ob.setNumberOfEvents(3);
        ob.setEventChargePerEvent(100.0);
        ob.displayDetails();
        
    }
    
}
