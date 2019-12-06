package com.bridgelabz.addressBook;

import org.junit.Assert;
import org.junit.Test;
//import sun.net.www.protocol.http.spnego.NegotiateCallbackHandler;

import java.io.IOException;

public class AddressBookTest {

    AddressBookDataInterface addressBookDataInterface=new AddressBook();
    @Test
    public void givenAddressBook_ToAddPerson1() throws IOException {
        Person person =new Person("Jiya", "Raypure", 736756857, "Maharashtra", "nagpur", 56565);
        boolean result=addressBookDataInterface.addPerson(person);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenAddressBook_ToAddPerson2() throws IOException {
        Person person=new Person("Neha","Renge",54765876,"MP","Sivani",766);
        boolean result=addressBookDataInterface.addPerson(person);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenAddressBook_ToEditPersonDetails() throws IOException {
        Person person=new Person("Neha","Renge",54765876,"Maha","Nagpur",56756);
        boolean result=addressBookDataInterface.editPerson(person,person.getFirstName());
        Assert.assertEquals(true,result);
    }

}