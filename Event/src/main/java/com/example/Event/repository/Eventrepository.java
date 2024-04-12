package com.example.Event.repository;

import com.example.Event.model.Event;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Eventrepository extends JpaRepository<Event, Integer> 
{
    @Query("SELECT e from Event e WHERE e.eventName = 'wedding'")
    List<Event> findByName();

}
