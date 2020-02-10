package GUI;

import AddressBook.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonDialogTest {


    private String firstName = "John";
    private String lastName = "Doe";
    private String address = "123 lane";
    private String city = "Naples";
    private  String state = "FL";
    private String zipcode = "12345";
    private String phone = "000-000-0000";
    private Person testPerson = new Person(firstName, lastName, address, city, state, zipcode,phone);


    @Test
    void getPerson() {

       //
        assertEquals(lastName, testPerson.getLastName());
    }

    @Test
    void  ValidateZipCode() {

        String firstName = "John";
        String lastName = "Doe";
        String address = "123 lane";
        String city = "Naples";
        String state = "FL";
        String zipcode = "12345";
        String phone = "000-000-0000";
        Person testPerson = new Person(firstName, lastName, address, city, state, zipcode,phone);



    }
}
