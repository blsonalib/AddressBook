package com.bridgelabz.addressBook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface AddressBookDataInterface {
    public boolean addPerson(Person person)throws IOException;
    public boolean editPerson(Person person, String firstName) throws IOException;
    public boolean deletePerson(String firstName)throws IOException;
    public boolean sortEntriesByName()throws IOException;
    public boolean  sortEntriesByZip(Person personData) throws IOException;
    public void printEntries() throws IOException;
    public void writeIntoJson(List<Person> personDataList)throws IOException;
    public ArrayList<Person>fileRead() throws IOException;
}
