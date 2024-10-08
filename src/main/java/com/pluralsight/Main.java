package com.pluralsight;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int serialNumber;
        String phoneModel;
        String carrier;
        String phoneNumber;
        String ownerFullName;

       /*
        System.out.println("What is the serial number? ");
        serialNumber = scanner.nextInt();
        System.out.println("What model is the phone? ");
        scanner.nextLine();
        phoneModel = scanner.nextLine();
        System.out.println("Who is the phone carrier? ");
        carrier = scanner.nextLine();
        System.out.println("What is the phone number? ");
        phoneNumber = scanner.nextLine();
        System.out.println("Who is the owner of the phone? ");
        ownerFullName = scanner.nextLine();
        */

        PhoneService p1 = new PhoneService(123456, "Iphone", "Verzion", "623-522-7756", "Brianna Castanon");
       // PhoneService p1 = new PhoneService();
        p1.setserialNumber(123456);
        p1.setphoneModel("Iphone");
        p1.setcarrier("Verizon");
        p1.setphoneNumber("623-522-7756");
        p1.setownerFullName("Brianna Castanon");
        PhoneService p2 = new PhoneService(1234, "Iphone", "Verizon", "915-526-7005", "Esme");
        p2.setphoneNumber("915-526-7005");


        System.out.println("Serial number: " + p1.getserialNumber());
        System.out.println("Phone model: " + p1.getphoneModel());
        System.out.println("Carrier " + p1.getcarrier());
        System.out.println("Phone number: " + p1.getphoneNumber());
        System.out.println("Owner full name: " + p1.getownerFullName());

        p1.dial("623-526-7005");
        p2.dial(p2);



    }
}