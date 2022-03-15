package africa.semicolon.phoneBook.services;

import africa.semicolon.phoneBook.data.repositories.ContactRepository;
import africa.semicolon.phoneBook.data.repositories.ContactRepositoryImpl;
import africa.semicolon.phoneBook.dtos.requests.AddContactRequestDto;
import africa.semicolon.phoneBook.dtos.responses.FindUserResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ContactServiceImplTest {
    ContactRepository contactRepository;
    @BeforeEach void setUp(){
        contactRepository = new ContactRepositoryImpl();
    }

    @Test void testThatAContactCanBeAdded(){
        ContactService addContactService = new ContactServiceImpl();
        AddContactRequestDto requestDto = new AddContactRequestDto();
        requestDto.setFirstName("judith");
        requestDto.setLastName("sugs");
        requestDto.setMobileNumber("0878865544");

        addContactService.save(requestDto);

        assertEquals(1,addContactService.getRepository().count());
    }

    @Test
    void TestThatAContactCanBeDeletedTest(){
        ContactService addContactService = new ContactServiceImpl();
        AddContactRequestDto requestDto = new AddContactRequestDto();
        requestDto.setFirstName("judith");
        requestDto.setLastName("sugs");
        requestDto.setMobileNumber("0878865544");

    AddContactRequestDto requestDto2 = new AddContactRequestDto();
    requestDto2.setFirstName("jude");
    requestDto2.setLastName("sue");
    requestDto2.setMobileNumber("0874365544");

        addContactService.save(requestDto);
        addContactService.save(requestDto2);
        assertEquals(2,addContactService.getRepository().count());
        addContactService.delete(requestDto);
        assertEquals(1,addContactService.getRepository().count());

    }
    @Test
    void TestThatAContactCanBeFoundByName(){
        ContactService addContactService = new ContactServiceImpl();
        AddContactRequestDto requestDto = new AddContactRequestDto();
        requestDto.setFirstName("flourish");
        requestDto.setLastName("bbaj");
        requestDto.setMobileNumber("08788732544");
        addContactService.save(requestDto);
        FindUserResponse userResponse = addContactService.findContactByName("flourish");

        assertEquals("flourish",userResponse.getFirstName());

    }
    @Test
    void TestThatAContactCanBeFoundByMobile(){
        ContactService addContactService = new ContactServiceImpl();
        AddContactRequestDto requestDto = new AddContactRequestDto();
        requestDto.setFirstName("flourish");
        requestDto.setLastName("bbaj");
        requestDto.setMobileNumber("08788732544");
        addContactService.save(requestDto);
        FindUserResponse userResponse = addContactService.findContactByMobile("08788732544");
        assertEquals("08788732544",userResponse.getMobile());


    }
}