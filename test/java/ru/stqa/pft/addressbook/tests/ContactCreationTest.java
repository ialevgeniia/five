package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {


  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Carevich", "+333333333", "Ivan", "carevich@google.com"));
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnToHomepage();
  }


}