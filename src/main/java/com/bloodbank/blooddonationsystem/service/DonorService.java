package com.bloodbank.blooddonationsystem.service;
// Service layer for handling donor-related business logic

import com.bloodbank.blooddonationsystem.entity.Donor;
import com.bloodbank.blooddonationsystem.repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonorService {

    @Autowired
    private DonorRepository repository;

    // Create Donor
    public Donor saveDonor(Donor donor) {
        return repository.save(donor);
    }

    // Read Donors by Blood Group
    public List<Donor> getDonorsByBloodGroup(String bloodGroup) {
        return repository.findByBloodGroup(bloodGroup);
    }

    // Read All Donors
    public List<Donor> getAllDonors() {
        return repository.findAll();
    }

    // Update Availability
    public Donor updateAvailability(Long id, boolean available) {
        Donor donor = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Donor not found"));

        donor.setAvailable(available);
        return repository.save(donor);
    }

    // Update Full Donor
    public Donor updateDonor(Long id, Donor updatedDonor) {
        Donor donor = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Donor not found"));

        donor.setName(updatedDonor.getName());
        donor.setBloodGroup(updatedDonor.getBloodGroup());
        donor.setCity(updatedDonor.getCity());
        donor.setAvailable(updatedDonor.isAvailable());

        return repository.save(donor);
    }

    // Delete Donor
    public void deleteDonor(Long id) {
        repository.deleteById(id);
    }


}
