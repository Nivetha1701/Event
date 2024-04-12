

package com.example.Event.repository;

import com.example.Event.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bookingrepository extends JpaRepository<Booking, Integer> {
}
