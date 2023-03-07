package com.example.estudosmicrosservicos.repositories;

import com.example.estudosmicrosservicos.entity.EmailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailEntity, Long> {
}
