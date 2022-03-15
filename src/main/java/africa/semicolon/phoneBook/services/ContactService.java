package africa.semicolon.phoneBook.services;

import africa.semicolon.phoneBook.data.repositories.ContactRepository;
import africa.semicolon.phoneBook.dtos.requests.AddContactRequestDto;
import africa.semicolon.phoneBook.dtos.responses.AddContactResponseDto;
import africa.semicolon.phoneBook.dtos.responses.FindUserResponse;

public interface ContactService {
   public AddContactResponseDto save(AddContactRequestDto request);

   ContactRepository getRepository();
   //delete method
   void delete(AddContactRequestDto requestDto);

   FindUserResponse findContactByName(String name);

   FindUserResponse findContactByMobile(String number);

   //find contact by firstName,LastName
}

