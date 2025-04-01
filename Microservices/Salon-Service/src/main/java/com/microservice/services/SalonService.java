package com.microservice.services;
import com.microservice.model.Salon;
import com.microservice.payload.dto.SalonDTO;
import com.microservice.payload.dto.UserDTO;

import java.util.List;

public interface SalonService {

    Salon createSaloon(SalonDTO salon, UserDTO user);

    Salon updateSalon(SalonDTO salon, UserDTO user, Long salonId) throws Exception;

    List<Salon> getAllSalons();

    Salon getSalonById(Long salonId);

    Salon getSalonByName(Long ownerId);

    List<Salon> searchSalonByCity(String city);

}
