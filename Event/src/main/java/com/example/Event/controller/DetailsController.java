package com.example.Event.controller;

import com.example.Event.model.Details;
import com.example.Event.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/details")
public class DetailsController {

    @Autowired
    private DetailsService detailsService;

    @GetMapping("/")
    public List<Details> getAllDetails() {
        return detailsService.getAllDetails();
    }

    @PostMapping("/")
    public void addDetails(@RequestBody Details details) {
        detailsService.addDetails(details);
    }

    @GetMapping("/{id}")
    public Details getDetailsById(@PathVariable Long id) {
        return detailsService.getDetailsById(id);
    }

    @PutMapping("/{id}")
    public void updateDetails(@PathVariable Long id, @RequestBody Details details) {
        details.setId(id);
        detailsService.updateDetails(details);
    }

    @DeleteMapping("/{id}")
    public void deleteDetails(@PathVariable Long id) {
        detailsService.deleteDetails(id);
    }


}