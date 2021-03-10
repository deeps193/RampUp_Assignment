package com.hcl;
 
import java.util.ArrayList;
import java.util.List;

import com.hcl.model.Contact;
 
public class ContactBusiness {
    public List<Contact> getContactList() {
        List<Contact> listContact = new ArrayList<>();
         
        listContact.add(new Contact(" abc", "abc@gmail.com", "USA"));
        listContact.add(new Contact("def", "def@outlook.com", "Eng"));
        listContact.add(new Contact("mno", "mno@yahoo.com", "Aus"));
        listContact.add(new Contact("ijk", "ijk@gmail.com", "India"));
         
        return listContact;
    }
}
