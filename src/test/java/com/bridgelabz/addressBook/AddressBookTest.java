package com.bridgelabz.addressBook;

import org.junit.Assert;
import org.junit.Test;
//import sun.net.www.protocol.http.spnego.NegotiateCallbackHandler;

import java.io.IOException;

public class AddressBookTest {

    AddressBookDataInterface addressBookDataInterface=new AddressBook();
    @Test
    public void givenAddressBook_ToAddPerson1_ShouldReturnTrue() throws IOException {
        Person person =new Person("Jiya", "Raypure", 736756857, "Maharashtra", "nagpur", 56565);
        boolean result=addressBookDataInterface.addPerson(person);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenAddressBook_ToAddPerson2_ShouldReturnTrue() throws IOException {
        Person person=new Person("Neha","Renge",54765876,"MP","Sivani",76687);
        boolean result=addressBookDataInterface.addPerson(person);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenAddressBook_ToAddPerson3_ShouldReturnTrue() throws IOException {
        Person person =new Person("Lata", "Shahare", 779898908, "Maharashtra", "jalgao", 97778);
        boolean result=addressBookDataInterface.addPerson(person);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenAddressBook_ToEditPersonDetails_ShouldReturnTrue() throws IOException {
        Person person=new Person("Neha","Renge",54765876,"Maha","Nagpur",56756);
        boolean result=addressBookDataInterface.editPerson(person,person.getFirstName());
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenAddressBook_ToDeletePersonDetails_ShouldReturnTrue() throws IOException {
        Person person=new Person("Jiya", "Raypure", 736756857, "Maharashtra", "nagpur", 56565);
        boolean result=addressBookDataInterface.deletePerson("Jiya");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenAddressBook_ToSortEntriesByName_ShouldReturnTrue() throws IOException {
        Person person=new Person("Jiya", "Raypure", 736756857, "Maharashtra", "nagpur", 56565);
        boolean result=addressBookDataInterface.sortEntriesByName();
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenAddressBook_ToSortEntriesByZip_ShoulsReturnTrue() throws IOException {
        Person person=new Person("Neha","Renge",54765876,"Maha","Nagpur",56756);
        boolean result=addressBookDataInterface.sortEntriesByZip(person);
        Assert.assertEquals(true,result);
    }

}