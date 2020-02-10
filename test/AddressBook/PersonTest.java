package AddressBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

  private Person testPerson;

  @BeforeEach
  void setUp() {
    testPerson = new Person("John","Doe","123 Main St","Fort Myers","FL","33901","239-555-1212");
  }

  @Test
  void getFirstName() {
    assertEquals("John", testPerson.getFirstName());
  }

  @Test
  void getLastName() {
    assertEquals("Doe", testPerson.getLastName());
  }

  @Test
  void getAddress() {
    assertEquals("123 Main St", testPerson.getAddress());
  }

  @Test
  void getCity() {
    assertEquals("Fort Myers", testPerson.getCity());
  }

  @Test
  void getState() {
    assertEquals("FL", testPerson.getState());
  }

  @Test
  void getZip() {
    assertEquals("33901", testPerson.getZip());
  }

  @Test
  void getPhone() {
    assertEquals("239-555-1212", testPerson.getPhone());
  }

  @Test
  void TestToString() {
    assertEquals("Doe, John", testPerson.toString());
  }

  @Test
  void containsString() {
    assertEquals(true, testPerson.containsString("Doe"));
    assertEquals(false, testPerson.containsString("Yo"));
  }

  @Test
  void getField() {
    assertEquals("Doe", testPerson.getField(0));
    assertEquals("John", testPerson.getField(1));
    assertEquals("123 Main St", testPerson.getField(2));
    assertEquals("Fort Myers", testPerson.getField(3));
    assertEquals("FL", testPerson.getField(4));
    assertEquals("33901", testPerson.getField(5));
    assertEquals("239-555-1212", testPerson.getField(6));
    assertThrows(IllegalArgumentException.class, () -> {
      testPerson.getField(7);
    });
  }
}