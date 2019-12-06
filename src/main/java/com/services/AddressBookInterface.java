package com.services;

import java.io.IOException;

public interface AddressBookInterface {
    public String add(String firstName,String lastName,String phonNumber,String state,String city,String zipCode ) throws IOException;
     public String edit  (String name,String phonenumber,String city,String state,String zipCode) throws IOException;
    public String delete(String name) throws IOException;
    public String sortByName() throws IOException;

    public String sortByZip() throws IOException;

    public void printAllEntries() throws IOException;
}
