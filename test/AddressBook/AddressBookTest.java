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
    int currentPersonCount = testAddressBookObject.getPersons().length;
    assertEquals("Added", testAddressBookObject.getPersons()[currentPersonCount-1].getFirstName());
    assertEquals(4, currentPersonCount);
  }

  @Test
  void set() {
  }

  @Test
  void remove() {
  }

  @Test
  void get() {
  }

  @Test
  void clear() {
  }

  @Test
  void getRowCount() {
  }

  @Test
  void getColumnCount() {
  }

  @Test
  void getValueAt() {
  }

  @Test
  void getColumnName() {
  }

  @Test
  void getColumnName1() {
  }

  @Test
  void findColumn() {
  }

  @Test
  void getColumnClass() {
  }

  @Test
  void isCellEditable() {
  }

  @Test
  void setValueAt() {
  }

  @Test
  void addTableModelListener() {
  }

  @Test
  void removeTableModelListener() {
  }

  @Test
  void getTableModelListeners() {
  }

  @Test
  void fireTableDataChanged() {
  }

  @Test
  void fireTableStructureChanged() {
  }

  @Test
  void fireTableRowsInserted() {
  }

  @Test
  void fireTableRowsUpdated() {
  }

  @Test
  void fireTableRowsDeleted() {
  }

  @Test
  void fireTableCellUpdated() {
  }

  @Test
  void fireTableChanged() {
  }

  @Test
  void getListeners() {
  }

}