package net.akshaath.addressbookapp.repository;

import net.akshaath.addressbookapp.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}