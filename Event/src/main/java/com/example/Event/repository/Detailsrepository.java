
package com.example.Event.repository;

import com.example.Event.model.Details;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Detailsrepository extends JpaRepository<Details, Integer> 
{
    @Query("SELECT d from Details d WHERE d.eventName = :name")
    List<Details> findByName(@Param("name")String eventName);

}
