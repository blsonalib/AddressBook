package com.bridgelabz.addressBook;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class AddressBook implements AddressBookDataInterface {

    List<PersonData> personDataList = new ArrayList<>();
    String filepath="/home/admin1/IdeaProjects/AddressBook/src/test/resources/Address.json";

    @Override
    public boolean addPerson(PersonData personData) throws IOException {
        personDataList.add(personData);
        writeIntoJson(personDataList);
        return true;
    }

    @Override
    public boolean editPerson(PersonData personData, String firsName) throws IOException {
        return false;
    }

    @Override
    public boolean deletePerson(String firstName) throws IOException {
        return false;
    }

    @Override
    public boolean sortEntriesByName() throws IOException {
        return false;
    }

    @Override
    public void sortEntriesByZip(PersonData personData) throws IOException {

    }

    @Override
    public void printEntries() throws IOException {

    }


  @Override
  public void writeIntoJson(List<PersonData> personDataList) {
      Gson gson = new GsonBuilder().setPrettyPrinting().create();
      String json = gson.toJson(personDataList);
      try (FileWriter file = new FileWriter(filepath)) {
          file.write(json);
          System.out.println("written to json");
      } catch (IOException e) {
          e.printStackTrace();
      }
  }
       @Override
        public ArrayList<PersonData> fileRead() throws IOException {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(new File(filepath), new TypeReference<ArrayList<PersonData>>() {
            });
        }

    }

