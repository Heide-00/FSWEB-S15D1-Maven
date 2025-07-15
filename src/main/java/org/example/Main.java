package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*Grocery grocery=new Grocery();
        grocery.startGrocery();*/

       MobilePhone mobilePhone=new MobilePhone("2342342342",new ArrayList<>());
       mobilePhone.addNewContact(new Contact("emrah","2342342342"));
       mobilePhone.addNewContact(new Contact("emrah","2342342342"));
       mobilePhone.addNewContact(new Contact("emrah","2342342342"));
       mobilePhone.addNewContact(new Contact("fhjklllşfj","23u2342342"));
       mobilePhone.printContacts();
    }
}
