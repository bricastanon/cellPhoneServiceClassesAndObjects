package com.pluralsight;

import org.w3c.dom.ls.LSOutput;

public class PhoneService {

   int serialNumber;
   String phoneModel;
   String carrier;
   String phoneNumber;
   String ownerFullName;

   // Making Constructor
   public PhoneService(int serialNumber, String phoneModel, String carrier, String phoneNumber,String ownerFullName) {
       this.serialNumber = serialNumber;
       this.phoneModel = phoneModel;
       this.carrier = carrier;
       this.phoneNumber = phoneNumber;
       this.ownerFullName = ownerFullName;

   }
   public PhoneService() {
     serialNumber = 0;
     phoneModel = "";
     carrier = "";
     phoneNumber = "";
     ownerFullName = "";

      /*  this.serialNumber = serialNumber;
        this.phoneModel = phoneModel;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.ownerFullName = ownerFullName;*/
   }

    public int getserialNumber() {
        return this.serialNumber;
    }
    public void setserialNumber(int serialnumber) {
        this.serialNumber = serialNumber;
    }
    public String getphoneModel() {
        return this.phoneModel;
    }
    public void setphoneModel(String phonemodel) {
        this.phoneModel = phoneModel;
    }
    public String getcarrier() {
        return this.carrier;
    }
    public void setcarrier(String carrier) {
        this.carrier = carrier;
    }
    public String getphoneNumber() {
        return this.phoneNumber;
    }
    public void setphoneNumber(String phonenumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getownerFullName() {
        return this.ownerFullName;
    }
    public void setownerFullName(String ownerfullname) {
        this.ownerFullName = ownerFullName;
    }

    // OUTPUT
    public void phoneInfo() {
        System.out.println("Serial number: " + serialNumber);
    }
    public void dial(String phoneNumber) {
        System.out.println("Bri is calling : " + this.phoneNumber);
    }

    public void dial(PhoneService phoneNumber) {
        System.out.println("Receiving a call from : " + this.phoneNumber);
    }
}


