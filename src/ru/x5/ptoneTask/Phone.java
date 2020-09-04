package ru.x5.ptoneTask;

public class Phone {
     String number;
     String model;
     int weight;

     public void recieveCall(String callerName){
          System.out.println("Звонит " + callerName);
     }

     public String getNumber(){
          return number;
     }

}
