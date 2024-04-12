package com.example.Event.service;

import com.example.Event.model.Event;
import com.example.Event.repository.Eventrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    public List<Event> getEventsSortedByField(String field) {
        Sort sort = Sort.by(field);
        return eventRepository.findAll(sort);
    }

    public Page<Event> getEventsPaginated(Pageable pageable) {
        return eventRepository.findAll(pageable);
    }

    public Page<Event> getEventsSortedAndPaginated(Pageable pageable, String field) {
        Sort sort = Sort.by(field);
        pageable = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), sort);
        return eventRepository.findAll(pageable);
    }
   
}