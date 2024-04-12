package com.example.Event.repository;

import com.example.Event.model.Event;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Eventrepository extends JpaRepository<Event, Integer> 
{
    
}
