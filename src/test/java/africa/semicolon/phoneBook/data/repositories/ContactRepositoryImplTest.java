package africa.semicolon.phoneBook.data.repositories;

import africa.semicolon.phoneBook.data.models.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactRepositoryImplTest {
    ContactRepository contactRepository;

    @BeforeEach
    void setUp() {
        contactRepository = new ContactRepositoryImpl();
    }

    @Test
    public void contactCanBeSavedTest() {
        Contact contact = new Contact("Ade", "deji", "0703");
        contactRepository.saveContact(contact);
        assertEquals(1, contactRepository.count());
    }
    @Test
    public void contactCanBeDeletedTest(){
        Contact contact = new Contact("Ade", "deji", "0703");
        contactRepository.saveContact(contact);

        Contact contact2 = new Contact("Ade", "deji", "0703");
        contactRepository.saveContact(contact2);
        assertEquals(2, contactRepository.count());

        contactRepository.deleteContact(contact2);
        assertEquals(1,contactRepository.count());
    }
    @Test
    public  void contactCanBeGottenByFirstName(){
        //given that
        Contact contact = new Contact("Ade", "deji", "0703");
        contactRepository.saveContact(contact);

        Contact contact2 = new Contact("inc", "dej", "0702");
        contactRepository.saveContact(contact2);

        //when we try to get contact by firstname
     Contact foundContact =   contactRepository.findBy("inc");
     assertEquals(contact2,foundContact);

    }
}
