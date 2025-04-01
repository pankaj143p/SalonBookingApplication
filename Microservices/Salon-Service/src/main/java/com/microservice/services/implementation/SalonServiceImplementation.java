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

//    @Autowired
    private final SalonRepository sloSalonRepository;

    @Override
    public Salon createSaloon(SalonDTO req, UserDTO user) {
       Salon salon = new Salon();
       salon.setName(req.getName());
       salon.setAddress(req.getAddress());
       salon.setCity(req.getCity());
       salon.setImages(req.getImages());
       salon.setOwnerId(req.getOwnerId());
       salon.setEmail(req.getEmail());
       salon.setOpenTime(req.getOpenTime());
       salon.setCloseTime(req.getCloseTime());
       salon.setPhoneNumber((req.getPhoneNumber()));

        return sloSalonRepository.save(salon);
    }

    @Override
    public Salon updateSalon(SalonDTO salon, UserDTO user, Long salonId) {
        Salon existingSalon = sloSalonRepository.findById(salonId).orElse(null);
        if(existingSalon != null){
            existingSalon.setName(salon.getName());
            existingSalon.setAddress(salon.getAddress());
            existingSalon.setCity(salon.getCity());
            existingSalon.setImages(salon.getImages());
            existingSalon.setOwnerId(salon.getOwnerId());
            existingSalon.setEmail(salon.getEmail());
            existingSalon.setOpenTime(salon.getOpenTime());
            existingSalon.setCloseTime(salon.getCloseTime());
            existingSalon.setPhoneNumber(salon.getPhoneNumber());
            return sloSalonRepository.save(existingSalon);
        }
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
