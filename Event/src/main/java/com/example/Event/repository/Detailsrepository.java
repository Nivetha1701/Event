package com.example.Event.repository;

import com.example.Event.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Detailsrepository extends JpaRepository<Details, Long> {
}
