package ru.x5.ptoneTask;

public class PhoneApp {
    public static void main(String[] args){

        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        System.out.println(phone1.number + " " + phone1.model + " " + phone1.weight);
        System.out.println(phone2.number + " " + phone2.model + " " + phone2.weight);
        System.out.println(phone3.number + " " + phone3.model + " " + phone3.weight);

        phone1.recieveCall("Zibulba");
        phone2.recieveCall("Test");
        phone3.recieveCall("Oleg");

        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();

        phone1.recieveCall("Zibulba","4252");
        phone2.recieveCall("Test","425232");
        phone3.recieveCall("Oleg","4251112");

        phone1.sendMessage("+79992221133", "+71234212233","+79123219815");
    }
}
