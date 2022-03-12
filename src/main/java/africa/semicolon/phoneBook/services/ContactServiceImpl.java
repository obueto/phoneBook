package africa.semicolon.phoneBook.services;

import africa.semicolon.phoneBook.data.models.Contact;
import africa.semicolon.phoneBook.data.repositories.ContactRepository;
import africa.semicolon.phoneBook.data.repositories.ContactRepositoryImpl;
import africa.semicolon.phoneBook.dtos.requests.AddContactRequestDto;
import africa.semicolon.phoneBook.dtos.responses.AddContactResponseDto;

public class ContactServiceImpl implements ContactService{

    ContactRepository contactRepository = new ContactRepositoryImpl();
    @Override
    public AddContactResponseDto save(AddContactRequestDto request) {
        Contact contact =new Contact(request.getFirstName(), request.getLastName(), request.getMobileNumber());
        contactRepository.saveContact(contact);

        return null;
    }

    @Override
    public ContactRepository getRepository() {
        return contactRepository;
    }

    @Override
    public void delete(AddContactRequestDto requestDto) {
        Contact contact =new Contact(requestDto.getFirstName(), requestDto.getLastName(), requestDto.getMobileNumber());
        contactRepository.deleteContact(contact);
    }

    @Override
    public void findContactByName(AddContactRequestDto requestDto) {
        Contact contact =new Contact(requestDto.getFirstName(), requestDto.getLastName(), requestDto.getMobileNumber());
        contactRepository.findBy(contact.getFirstName());
    }
}
