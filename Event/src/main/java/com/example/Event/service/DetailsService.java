package com.example.Event.service;

import com.example.Event.model.Details;
import com.example.Event.repository.Detailsrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetailsService {

    @Autowired
    private Detailsrepository detailsRepository;

    public List<Details> getAllDetails() {
        return detailsRepository.findAll();
    }

    public void addDetails(Details details) {
        detailsRepository.save(details);
    }

    public Details getDetailsById(Long id) {
        Optional<Details> optionalDetails = detailsRepository.findById(id);
        return optionalDetails.orElse(null);
    }

    public void updateDetails(Details details) {
        detailsRepository.save(details);
    }

    public void deleteDetails(Long id) {
        detailsRepository.deleteById(id);
    }
    
}