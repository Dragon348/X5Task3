package ru.x5.ptoneTask;

public class PhoneApp {
    public static void main(String[] args){

        Phone[] phones = new Phone[3];
        phones[0] = new Phone();
        phones[1] = new Phone();
        phones[2] = new Phone();
        for (Phone phone: phones) {
            System.out.println(phone.getNumber() + " " + phone.getModel() + " " + phone.getWeight());
            phone.sendMessage("+79992221133", "+71234212233", "+79123219815");
        }
        phones[0].recieveCall("Zibulba");
        phones[1].recieveCall("Test");
        phones[2].recieveCall("Oleg");

        phones[0].recieveCall("Zibulba", "4252");
        phones[1].recieveCall("Test", "425232");
        phones[2].recieveCall("Oleg", "4251112");
    }
}
