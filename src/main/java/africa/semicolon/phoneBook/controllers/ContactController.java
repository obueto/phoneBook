package africa.semicolon.phoneBook.controllers;

import africa.semicolon.phoneBook.dtos.requests.AddContactRequestDto;
import africa.semicolon.phoneBook.dtos.responses.AddContactResponseDto;
import africa.semicolon.phoneBook.dtos.responses.FindUserResponse;
import africa.semicolon.phoneBook.services.ContactService;
import africa.semicolon.phoneBook.services.ContactServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contact")
public class ContactController {
    private ContactService contactService= new ContactServiceImpl();
@PostMapping("/save")
    public AddContactResponseDto save(@RequestBody AddContactRequestDto request){
        return contactService.save(request);
    }
    @DeleteMapping("/{contact}")
    public void delete(@RequestBody AddContactRequestDto requestDto){
    contactService.delete(requestDto);
    }

    @GetMapping("/{name}")
    public FindUserResponse findContactByName(@PathVariable String name){
    return contactService.findContactByName(name);
    }
    @GetMapping("/{mobile}")
    public FindUserResponse findContactByMobile(@PathVariable String mobile){
        return contactService.findContactByName(mobile);
    }

}
