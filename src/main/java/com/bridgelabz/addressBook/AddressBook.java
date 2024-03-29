package com.bridgelabz.addressBook;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class AddressBook implements AddressBookDataInterface {

    List<Person> personDataList = new ArrayList<>();
    String filepath = "/home/admin1/IdeaProjects/AddressBook/src/test/resources/Address.json";

    @Override
    public boolean addPerson(Person person) throws IOException {
        ArrayList<Person> personDataList = fileRead();
        personDataList.add(person);
        writeIntoJson(personDataList);
        return true;
    }
    @Override
    public boolean editPerson(Person person, String firstName) throws IOException {
        ArrayList<Person> personDataList = fileRead();
        for (Person personData1 : personDataList){
            if(personData1.getFirstName().equals(firstName)){
                personData1.setLastName(person.getLastName());
                personData1.setState(person.getState());
                personData1.setCity(person.getCity());
                personData1.setZipCode(person.getZipCode());
            }
        }
        writeIntoJson(personDataList);
        return true;
    }
    @Override
    public boolean deletePerson(String firstName) throws IOException {
        ArrayList<Person> personDataList = fileRead();
        personDataList.removeIf(person -> person.getFirstName().equals(firstName));
        writeIntoJson(personDataList);
        return true;
    }

    @Override
    public boolean sortEntriesByName() throws IOException {
        ArrayList<Person> personDataList = fileRead();
        personDataList.sort(Comparator.comparing(Person::getFirstName));
        writeIntoJson(personDataList);
        return true;
    }

    @Override
    public boolean sortEntriesByZip(Person personData) throws IOException {
        ArrayList<Person> personDataList = fileRead();
        personDataList.sort(Comparator.comparing(Person::getZipCode));
        personDataList.forEach(System.out::println);
        writeIntoJson(personDataList);
        return true;
    }

    @Override
    public boolean printEntries() throws IOException {
        ArrayList<Person> personDataList = fileRead();
        for(Person person2 : personDataList){
            System.out.println("FirstName :\t"+person2.getFirstName()+"\t\t"+"LastName :\t"+person2.getLastName()+"\t\t"+"PhoneNumber :\t"+person2.getPhoneNumber());
            System.out.println();
            System.out.println("State :\t"+person2.getState()+"\t\t"+"City :\t"+person2.getCity()+ "\t\t"+"ZipCode :\t"+person2.getZipCode());
        }
        return true;

    }


  @Override
  public void writeIntoJson(List<Person> personDataList) {
      Gson gson = new GsonBuilder().setPrettyPrinting().create();
      String json = gson.toJson(personDataList);
      try (FileWriter file = new FileWriter(filepath)) {
          file.write(json);
      } catch (IOException e) {
          e.printStackTrace();
      }
  }
       @Override
        public ArrayList<Person> fileRead() throws IOException {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(new File(filepath), new TypeReference<ArrayList<Person>>() {
            });
        }

    }

