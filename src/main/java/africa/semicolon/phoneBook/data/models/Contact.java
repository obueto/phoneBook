package africa.semicolon.phoneBook.data.models;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Contact {
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    private String  middleName;
    @NonNull
    private String  mobile;
    private String office;
}
//mongo db /repo
// lombok directory read-up


//repo = contact repo- crud
//services = delete contact,save,find contact by firstName,lastname
//api = expose the apis  ie controllers
