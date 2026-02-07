package com.bloodbank.blooddonationsystem.controller;
import com.bloodbank.blooddonationsystem.entity.Donor;
import com.bloodbank.blooddonationsystem.repository.DonorRepository;
import com.bloodbank.blooddonationsystem.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donors")
@CrossOrigin(origins = {
        "http://localhost:3000",
        "https://blood-donation-frontend-kwz6r4ol8-varshinis-projects-08cedcee.vercel.app/"
})

public class DonorController {

    @Autowired
    private DonorService service;

    // GET ALL donors
    @GetMapping
    public List<Donor> getAllDonors() {
        return service.getAllDonors();
    }

    // GET by blood group
    @GetMapping("/blood/{bloodGroup}")
    public List<Donor> getByBloodGroup(@PathVariable String bloodGroup) {
        return service.getDonorsByBloodGroup(bloodGroup);
    }

    // ADD donor
    @PostMapping
    public Donor addDonor(@RequestBody Donor donor) {
        return service.saveDonor(donor);
    }

    // UPDATE donor
    @PutMapping("/{id}")
    public Donor updateDonor(@PathVariable Long id, @RequestBody Donor donor) {
        return service.updateDonor(id, donor);
    }

    // DELETE donor
    @DeleteMapping("/{id}")
    public void deleteDonor(@PathVariable Long id) {
        service.deleteDonor(id);
    }
}

