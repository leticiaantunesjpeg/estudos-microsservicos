package com.example.estudosmicrosservicos.representation;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailRepresentation {

    @NotBlank
    private String ownerRef;
    @NotBlank
    @Email
    private String emailFrom;
    @NotBlank
    @Email
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    @Column(columnDefinition = "TEXT")
    private String text;
}
