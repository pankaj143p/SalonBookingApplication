package com.microservice.repository;

import com.microservice.model.Saloon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaloonRepository extends JpaRepository<Saloon, Long> {
    
}
