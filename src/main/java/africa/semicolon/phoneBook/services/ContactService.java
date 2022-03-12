package africa.semicolon.phoneBook.services;

import africa.semicolon.phoneBook.data.repositories.ContactRepository;
import africa.semicolon.phoneBook.dtos.requests.AddContactRequestDto;
import africa.semicolon.phoneBook.dtos.responses.AddContactResponseDto;

public interface ContactService {
   public AddContactResponseDto save(AddContactRequestDto request);

   ContactRepository getRepository();
   //delete method
   void delete(AddContactRequestDto requestDto);

   void findContactByName(AddContactRequestDto requestDto);

   //find contact by firstName,LastName
}

