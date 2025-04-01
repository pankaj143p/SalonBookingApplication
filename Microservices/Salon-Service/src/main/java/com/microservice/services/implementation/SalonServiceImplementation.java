package com.microservice.services.implementation;

import com.microservice.model.Salon;
import com.microservice.payload.dto.SalonDTO;
import com.microservice.payload.dto.UserDTO;
import com.microservice.repository.SalonRepository;
import com.microservice.services.SalonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SalonServiceImplementation implements SalonService {

    @Autowired
    private final SalonRepository sloSalonRepository;

    @Override
    public SalonDTO createSaloon(SalonDTO salon, UserDTO user) {
        return null;
    }

    @Override
    public Salon updateSalon(SalonDTO salon, UserDTO user, Long salonId) {
        return null;
    }

    @Override
    public List<Salon> getAllSalons() {
        return List.of();
    }

    @Override
    public Salon getSalonById(Long salonId) {
        return null;
    }

    @Override
    public Salon getSalonByName(Long ownerId) {
        return null;
    }

    @Override
    public List<Salon> searchSalonByCity(String city) {
        return List.of();
    }
}
