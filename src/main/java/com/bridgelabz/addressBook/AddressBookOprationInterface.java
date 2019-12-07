package com.bridgelabz.addressBook;

import java.io.IOException;

public interface AddressBookOprationInterface {
    public boolean createNewAddressBook(String file) throws IOException;
    public void openExistingAddressBook() throws IOException;
    public void saveAddressBook() throws IOException;
    public void saveAddressBookAs() throws IOException;
    public Void quitProgram() throws IOException;
}
