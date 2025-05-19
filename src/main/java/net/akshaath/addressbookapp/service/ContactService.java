package net.akshaath.addressbookapp.service;

import net.akshaath.addressbookapp.dto.ContactDTO;
import net.akshaath.addressbookapp.model.Contact;

import java.util.List;

public interface ContactService {
    Contact addContact(ContactDTO dto);
    List<Contact> getAllContacts();
    Contact getContactById(Long id);
    Contact updateContact(Long id, ContactDTO dto);
    void deleteContact(Long id);
}
