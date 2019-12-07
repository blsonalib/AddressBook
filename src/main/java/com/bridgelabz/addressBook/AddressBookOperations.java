package com.bridgelabz.addressBook;

import java.io.File;
import java.io.IOException;

public class AddressBookOperations implements AddressBookOprationInterface {
    @Override
    public boolean createNewAddressBook(String file) {
        String filePath="/home/admin1/IdeaProjects/AddressBook/src/test/resources/Address";
        File file1=new File(filePath +file+ ".json");
        boolean fileExistance=file1.exists();
        if(fileExistance)
        {
            System.out.println("File does not exists");
            return true;
        }
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void openExistingAddressBook() {

    }

    @Override
    public void saveAddressBook() {

    }

    @Override
    public void saveAddressBookAs() {

    }

    @Override
    public Void quitProgram() {
        return null;
    }
}
