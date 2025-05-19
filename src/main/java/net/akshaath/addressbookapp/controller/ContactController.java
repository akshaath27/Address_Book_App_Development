package net.akshaath.addressbookapp.controller;

import net.akshaath.addressbookapp.dto.ContactDTO;
import net.akshaath.addressbookapp.model.Contact;
import net.akshaath.addressbookapp.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
@CrossOrigin(origins = "*")
public class ContactController {

    @Autowired
    private ContactService service;

    @PostMapping
    public Contact create(@RequestBody ContactDTO dto) {
        return service.addContact(dto);
    }

    @GetMapping
    public List<Contact> getAll() {
        return service.getAllContacts();
    }

    @GetMapping("/{id}")
    public Contact getById(@PathVariable Long id) {
        return service.getContactById(id);
    }

    @PutMapping("/{id}")
    public Contact update(@PathVariable Long id, @RequestBody ContactDTO dto) {
        return service.updateContact(id, dto);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteContact(id);
        return "Deleted contact with id: " + id;
    }
}