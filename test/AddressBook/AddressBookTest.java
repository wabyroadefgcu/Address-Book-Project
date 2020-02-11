package AddressBook;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

  AddressBook testAddressBookObject;

  @BeforeEach
  void setUp() {
    testAddressBookObject = new AddressBook();
    testAddressBookObject.add(new Person("John","Doe","123 Main St","Fort Myers","FL","33901","239-555-1212"));
    testAddressBookObject.add(new Person("Jane","Doe","111 FGCU Pkwy","Fort Myers","FL","33912","239-555-1210"));
    testAddressBookObject.add(new Person("Mr","T","","","","","239-555-0909"));
  }

  @AfterEach
  void tearDown() {

  }

  @Test
  void getPersons() {
    // TODO: Look into making this test more independent, as it currently depends on Person class (mock??)
    Person[] tempArray = testAddressBookObject.getPersons();
    assertEquals(3, tempArray.length);
    assertEquals("John", tempArray[0].getFirstName());
    assertEquals("Jane", tempArray[1].getFirstName());
    assertEquals("T", tempArray[2].getLastName());
  }

  @Test
  void add() {
    testAddressBookObject.add(new Person("Added","Person","","","","",""));
    int currentPersonCount = testAddressBookObject.getRowCount();
    assertEquals("Added", testAddressBookObject.getPersons()[currentPersonCount-1].getFirstName());
    assertEquals(4, currentPersonCount);
  }

  @Test
  void set() {
    // Set new person in third spot in the list of Person objects
    Person tempPerson = new Person("Another","Person","","","","","");
    testAddressBookObject.set(2,tempPerson);
    assertEquals("Another", testAddressBookObject.getPersons()[2].getFirstName());
  }

  @Test
  void remove() {
    testAddressBookObject.remove(0);
    assertEquals("Jane", testAddressBookObject.getPersons()[0].getFirstName());
  }

  @Test
  void get() {
    Person testPerson = testAddressBookObject.get(0);
    assertEquals("John", testAddressBookObject.get(0).getFirstName());
    assertEquals("Doe", testAddressBookObject.get(0).getLastName());
  }

  @Test
  void clear() {
    testAddressBookObject.clear();
    int currentPersonCount = testAddressBookObject.getRowCount();
    assertEquals(0, currentPersonCount);
    assertThrows(IndexOutOfBoundsException.class, () -> {
      testAddressBookObject.get(0);
    });
  }

  @Test
  void getRowCount() {
    assertEquals(3, testAddressBookObject.getRowCount());
  }

  @Test
  void getColumnCount() {
    assertEquals(7, testAddressBookObject.getColumnCount());
  }

  @Test
  void getValueAt() {
    assertEquals("John", testAddressBookObject.get(0).getField(1));
    assertEquals("T", testAddressBookObject.get(2).getField(0));
  }

  @Test
  void getColumnName() {
    assertEquals("Last Name", testAddressBookObject.getColumnName(0));
    assertEquals("First Name", testAddressBookObject.getColumnName(1));
    assertEquals("Address", testAddressBookObject.getColumnName(2));
    assertEquals("City", testAddressBookObject.getColumnName(3));
    assertEquals("State", testAddressBookObject.getColumnName(4));
    assertEquals("ZIP", testAddressBookObject.getColumnName(5));
    assertEquals("Phone", testAddressBookObject.getColumnName(6));
  }
}