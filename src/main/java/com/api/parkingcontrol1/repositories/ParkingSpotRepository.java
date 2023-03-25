package com.api.parkingcontrol1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.parkingcontrol1.models.ParkingSpot;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, UUID> {
    boolean existsByLicensePlateCar(String licensePlateCar);

    boolean existsByParkingSpotNumber(String parkingSpotNumber);

    boolean existsByApartmentAndBlock(String apartment, String block);
}
