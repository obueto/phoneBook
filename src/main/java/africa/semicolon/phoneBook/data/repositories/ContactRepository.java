package africa.semicolon.phoneBook.data.repositories;

import africa.semicolon.phoneBook.data.models.Contact;

public interface ContactRepository {
    Contact saveContact(Contact contact);
    void deleteContact(Contact contact2);
    Contact findBy (String name);
    int count();



}
