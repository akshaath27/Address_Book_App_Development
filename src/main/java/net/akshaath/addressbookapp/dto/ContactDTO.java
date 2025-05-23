package net.akshaath.addressbookapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor


public class ContactDTO {
	private Long id;
    private String fullName;
    private String email;
    private String phone;
    private String city;
    
}