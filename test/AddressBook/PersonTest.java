package AddressBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

  private Person testPerson;
  private Person testPerson2;
  private Person testPerson3;
  @BeforeEach
  void setUp() {
    testPerson = new Person("John","Doe","123 Main St","Fort Myers","FL","33901","239-555-1212");

  }

  @Test
  void invalidPerson() throws Exception
  {
    // Invalid First Name
    assertThrows(IllegalArgumentException.class,() -> {  testPerson2 = new Person("", "Doe", "123 Main St", "Fort Myers", "FL", "33901", "239-555-1212");} );
    // Invalid Last Name
    assertThrows(IllegalArgumentException.class,() -> { testPerson3 = new Person("John","","123 Main St","Fort Myers","FL","33901","239-555-1212");} );
    // Invalid Address
    //assertThrows(IllegalArgumentException.class,() -> { testPerson3 = new Person("John","Doe","","Fort Myers","FL","33901","239-555-1212");} );

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

      String [] ValidStates = {"AL","AK", "AZ", "AR", "CA",
              "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL",
              "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA",
              "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH",
              "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR",
              "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT",
              "VA", "WA", "WV", "WI", "WY"};
      Boolean isValidState = Arrays.asList(ValidStates).contains(testPerson.getState());

      assertEquals("FL", testPerson.getState());

      assertTrue(isValidState, testPerson.getState());



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
    assertEquals(true, testPerson.containsString("John"));
    assertEquals(true, testPerson.containsString("Doe"));
    assertEquals(true, testPerson.containsString("123"));
    assertEquals(true, testPerson.containsString("Fort"));
    assertEquals(true, testPerson.containsString("FL"));
    assertEquals(true, testPerson.containsString("33901"));
    assertEquals(true, testPerson.containsString("239"));

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