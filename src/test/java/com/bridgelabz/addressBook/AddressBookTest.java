package com.bridgelabz.addressBook;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class AddressBookTest {

    AddressBookDataInterface addressBookDataInterface=new AddressBook();
    @Test
    public void givenAddressBook_ToAddPerson() throws IOException {
        PersonData personData=new PersonData("Jiya", "raypure", "7367568576", "Maharashtra", "nagpur", "56565");
        boolean result=addressBookDataInterface.addPerson(personData);
        Assert.assertEquals(true,result);
    }
}