package com.bridgelabz.addressBook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface AddressBookDataInterface {
    public boolean addPerson(PersonData personData)throws IOException;
    public boolean editPerson(PersonData personData,String firsName) throws IOException;
    public boolean deletePerson(String firstName)throws IOException;
    public boolean sortEntriesByName()throws IOException;
    public void  sortEntriesByZip(PersonData personData) throws IOException;
    public void printEntries() throws IOException;
    public void writeIntoJson(List<PersonData> personDataList)throws IOException;
    public ArrayList<PersonData>fileRead() throws IOException;
}
