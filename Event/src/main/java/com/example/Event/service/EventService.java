package com.example.Event.service;

import com.example.Event.model.Event;
import com.example.Event.repository.Eventrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private Eventrepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Optional<Event> getEventById(int id) {
        return eventRepository.findById(id);
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public Event updateEvent(int id, Event event) {
        event.setId(id); // Set the ID of the updated event
        return eventRepository.save(event);
    }

    public void deleteEvent(int id) {
        eventRepository.deleteById(id);
    }
}
